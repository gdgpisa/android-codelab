
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sprites {

    @SerializedName("back_female")
    @Expose
    private Object backFemale;
    @SerializedName("back_shiny_female")
    @Expose
    private Object backShinyFemale;
    @SerializedName("back_default")
    @Expose
    private Object backDefault;
    @SerializedName("front_female")
    @Expose
    private Object frontFemale;
    @SerializedName("front_shiny_female")
    @Expose
    private Object frontShinyFemale;
    @SerializedName("back_shiny")
    @Expose
    private Object backShiny;
    @SerializedName("front_default")
    @Expose
    private String frontDefault;
    @SerializedName("front_shiny")
    @Expose
    private Object frontShiny;

    /**
     * 
     * @return
     *     The backFemale
     */
    public Object getBackFemale() {
        return backFemale;
    }

    /**
     * 
     * @param backFemale
     *     The back_female
     */
    public void setBackFemale(Object backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * 
     * @return
     *     The backShinyFemale
     */
    public Object getBackShinyFemale() {
        return backShinyFemale;
    }

    /**
     * 
     * @param backShinyFemale
     *     The back_shiny_female
     */
    public void setBackShinyFemale(Object backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * 
     * @return
     *     The backDefault
     */
    public Object getBackDefault() {
        return backDefault;
    }

    /**
     * 
     * @param backDefault
     *     The back_default
     */
    public void setBackDefault(Object backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * 
     * @return
     *     The frontFemale
     */
    public Object getFrontFemale() {
        return frontFemale;
    }

    /**
     * 
     * @param frontFemale
     *     The front_female
     */
    public void setFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * 
     * @return
     *     The frontShinyFemale
     */
    public Object getFrontShinyFemale() {
        return frontShinyFemale;
    }

    /**
     * 
     * @param frontShinyFemale
     *     The front_shiny_female
     */
    public void setFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * 
     * @return
     *     The backShiny
     */
    public Object getBackShiny() {
        return backShiny;
    }

    /**
     * 
     * @param backShiny
     *     The back_shiny
     */
    public void setBackShiny(Object backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * 
     * @return
     *     The frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    /**
     * 
     * @param frontDefault
     *     The front_default
     */
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * 
     * @return
     *     The frontShiny
     */
    public Object getFrontShiny() {
        return frontShiny;
    }

    /**
     * 
     * @param frontShiny
     *     The front_shiny
     */
    public void setFrontShiny(Object frontShiny) {
        this.frontShiny = frontShiny;
    }

}
