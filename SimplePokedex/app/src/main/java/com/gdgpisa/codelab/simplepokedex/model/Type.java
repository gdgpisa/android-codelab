
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Type {

    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("type")
    @Expose
    private Type_ type;

    /**
     * 
     * @return
     *     The slot
     */
    public Integer getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The type
     */
    public Type_ getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Type_ type) {
        this.type = type;
    }

}
