
package com.gdgpisa.codelab.simplepokedex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VersionGroupDetail {

    @SerializedName("move_learn_method")
    @Expose
    private MoveLearnMethod moveLearnMethod;
    @SerializedName("level_learned_at")
    @Expose
    private Integer levelLearnedAt;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    /**
     * 
     * @return
     *     The moveLearnMethod
     */
    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    /**
     * 
     * @param moveLearnMethod
     *     The move_learn_method
     */
    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    /**
     * 
     * @return
     *     The levelLearnedAt
     */
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    /**
     * 
     * @param levelLearnedAt
     *     The level_learned_at
     */
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    /**
     * 
     * @return
     *     The versionGroup
     */
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    /**
     * 
     * @param versionGroup
     *     The version_group
     */
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

}
