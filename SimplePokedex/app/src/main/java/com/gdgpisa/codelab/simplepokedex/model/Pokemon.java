
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    @SerializedName("forms")
    @Expose
    private List<Form> forms = new ArrayList<Form>();
    @SerializedName("abilities")
    @Expose
    private List<Ability> abilities = new ArrayList<Ability>();
    @SerializedName("stats")
    @Expose
    private List<Stat> stats = new ArrayList<Stat>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("moves")
    @Expose
    private List<Move> moves = new ArrayList<Move>();
    @SerializedName("sprites")
    @Expose
    private Sprites sprites;
    @SerializedName("held_items")
    @Expose
    private List<Object> heldItems = new ArrayList<Object>();
    @SerializedName("location_area_encounters")
    @Expose
    private String locationAreaEncounters;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("species")
    @Expose
    private Species species;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("game_indices")
    @Expose
    private List<Object> gameIndices = new ArrayList<Object>();
    @SerializedName("base_experience")
    @Expose
    private Integer baseExperience;
    @SerializedName("types")
    @Expose
    private List<Type> types = new ArrayList<Type>();

    /**
     * 
     * @return
     *     The forms
     */
    public List<Form> getForms() {
        return forms;
    }

    /**
     * 
     * @param forms
     *     The forms
     */
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    /**
     * 
     * @return
     *     The abilities
     */
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The moves
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * 
     * @param moves
     *     The moves
     */
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * 
     * @return
     *     The sprites
     */
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * 
     * @param sprites
     *     The sprites
     */
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    /**
     * 
     * @return
     *     The heldItems
     */
    public List<Object> getHeldItems() {
        return heldItems;
    }

    /**
     * 
     * @param heldItems
     *     The held_items
     */
    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * 
     * @return
     *     The locationAreaEncounters
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * 
     * @param locationAreaEncounters
     *     The location_area_encounters
     */
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 
     * @param isDefault
     *     The is_default
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 
     * @return
     *     The species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * 
     * @param species
     *     The species
     */
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The gameIndices
     */
    public List<Object> getGameIndices() {
        return gameIndices;
    }

    /**
     * 
     * @param gameIndices
     *     The game_indices
     */
    public void setGameIndices(List<Object> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * 
     * @return
     *     The baseExperience
     */
    public Integer getBaseExperience() {
        return baseExperience;
    }

    /**
     * 
     * @param baseExperience
     *     The base_experience
     */
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * 
     * @return
     *     The types
     */
    public List<Type> getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(List<Type> types) {
        this.types = types;
    }

}
