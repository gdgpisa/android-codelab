
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stat {

    @SerializedName("stat")
    @Expose
    private Stat_ stat;
    @SerializedName("effort")
    @Expose
    private Integer effort;
    @SerializedName("base_stat")
    @Expose
    private Integer baseStat;

    /**
     * 
     * @return
     *     The stat
     */
    public Stat_ getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(Stat_ stat) {
        this.stat = stat;
    }

    /**
     * 
     * @return
     *     The effort
     */
    public Integer getEffort() {
        return effort;
    }

    /**
     * 
     * @param effort
     *     The effort
     */
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    /**
     * 
     * @return
     *     The baseStat
     */
    public Integer getBaseStat() {
        return baseStat;
    }

    /**
     * 
     * @param baseStat
     *     The base_stat
     */
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

}
