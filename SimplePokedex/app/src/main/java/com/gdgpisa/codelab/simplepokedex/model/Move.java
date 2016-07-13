
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Move {

    @SerializedName("version_group_details")
    @Expose
    private List<VersionGroupDetail> versionGroupDetails = new ArrayList<VersionGroupDetail>();
    @SerializedName("move")
    @Expose
    private Move_ move;

    /**
     * 
     * @return
     *     The versionGroupDetails
     */
    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    /**
     * 
     * @param versionGroupDetails
     *     The version_group_details
     */
    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    /**
     * 
     * @return
     *     The move
     */
    public Move_ getMove() {
        return move;
    }

    /**
     * 
     * @param move
     *     The move
     */
    public void setMove(Move_ move) {
        this.move = move;
    }

}
