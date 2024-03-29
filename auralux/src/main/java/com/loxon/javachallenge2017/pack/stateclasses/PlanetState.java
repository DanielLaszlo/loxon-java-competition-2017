
package com.loxon.javachallenge2017.pack.stateclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlanetState {

    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("ownershipRatio")
    @Expose
    private Double ownershipRatio;
    @SerializedName("stationedArmies")
    @Expose
    private List<StationedArmy> stationedArmies = null;
    @SerializedName("movingArmies")
    @Expose
    private List<MovingArmy> movingArmies = null;
    @SerializedName("planetID")
    @Expose
    private Integer planetID;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getOwnershipRatio() {
        return ownershipRatio;
    }

    public void setOwnershipRatio(Double ownershipRatio) {
        this.ownershipRatio = ownershipRatio;
    }

    public List<StationedArmy> getStationedArmies() {
        return stationedArmies;
    }

    public void setStationedArmies(List<StationedArmy> stationedArmies) {
        this.stationedArmies = stationedArmies;
    }

    public List<MovingArmy> getMovingArmies() {
        return movingArmies;
    }

    public void setMovingArmies(List<MovingArmy> movingArmies) {
        this.movingArmies = movingArmies;
    }

    public Integer getPlanetID() {
        return planetID;
    }

    public void setPlanetID(Integer planetID) {
        this.planetID = planetID;
    }

}
