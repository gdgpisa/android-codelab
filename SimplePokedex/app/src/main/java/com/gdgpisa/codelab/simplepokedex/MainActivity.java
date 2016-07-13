package com.gdgpisa.codelab.simplepokedex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.gdgpisa.codelab.simplepokedex.model.Pokemon;
import com.gdgpisa.codelab.simplepokedex.model.Stat;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
                                                               Callback<Pokemon> {

    public static final String TAG = "MainActivity";

    private PokeapiInterface instance;

    private Button goButton;
    private EditText searchBox;

    private ProgressBar progressLoading;

    private LinearLayout pkmnDetail;
    private TextView pkmnName;
    private TextView pkmnWeight;
    private TextView pkmnHp;
    private TextView pkmnAttack;
    private TextView pkmnDefense;
    private TextView pkmnSpeed;

    private ImageView pkmnFront;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        instance = buildPokeapiInstance();

        goButton.setOnClickListener(this);
    }

    private PokeapiInterface buildPokeapiInstance() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        return retrofit.create(PokeapiInterface.class);
    }

    private void bindViews() {
        goButton = (Button) findViewById(R.id.go_button);
        searchBox = (EditText) findViewById(R.id.search_box);

        progressLoading = (ProgressBar) findViewById(R.id.progress_loading);

        pkmnDetail = (LinearLayout) findViewById(R.id.pkmn_detail);

        pkmnName = (TextView) findViewById(R.id.pkmn_name);
        pkmnWeight = (TextView) findViewById(R.id.pkmn_weight);
        pkmnHp = (TextView) findViewById(R.id.pkmn_hp);
        pkmnAttack = (TextView) findViewById(R.id.pkmn_attack);
        pkmnDefense = (TextView) findViewById(R.id.pkmn_defense);
        pkmnSpeed = (TextView) findViewById(R.id.pkmn_speed);

        pkmnFront = (ImageView) findViewById(R.id.pkmn_front);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.go_button) {
            if (searchBox.getText().toString().length() == 0) {
                Toast.makeText(MainActivity.this, "Inserisci un numero/numero per cercare",
                               Toast.LENGTH_SHORT).show();
                return;
            }

            progressLoading.setVisibility(View.VISIBLE);
            pkmnDetail.setVisibility(View.GONE);
            String pokemonQuery = searchBox.getText().toString();
            instance.searchForPokemon(pokemonQuery).enqueue(this);
        }
    }

    @Override
    public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
        try {
            Pokemon result = response.body();
            Picasso.with(this)
                .load(response.body().getSprites().getFrontDefault())
                .into(pkmnFront);
            pkmnName.setText(result.getName());
            pkmnWeight.setText("Weight: " + result.getWeight());
            for (Stat s : result.getStats()) {
                switch (s.getStat().getName()) {
                    case "hp":
                        pkmnHp.setText("HP: " + s.getBaseStat());
                        break;
                    case "attack":
                        pkmnAttack.setText("Attack: " + s.getBaseStat());
                        break;
                    case "defense":
                        pkmnDefense.setText("Defense: " + s.getBaseStat());
                        break;
                    case "speed":
                        pkmnSpeed.setText("Speed: " + s.getBaseStat());
                        break;
                }
            }
            progressLoading.setVisibility(View.GONE);
            pkmnDetail.setVisibility(View.VISIBLE);
        } catch (RuntimeException e) {
            handleError(e);
        }
    }

    private void handleError(Throwable e) {
        Log.d(TAG, "Runtime error during Pokemon download", e);
        progressLoading.setVisibility(View.GONE);
        pkmnDetail.setVisibility(View.GONE);
        Toast.makeText(MainActivity.this, "C'è stato un errore nel download!",
                       Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Call<Pokemon> call, Throwable t) {
        handleError(t);
    }
}
