package com.loxon.javachallenge2017.pack.magicnumber;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.loxon.javachallenge2017.pack.magicnumber.MagicValue;

import java.util.LinkedList;
import java.util.List;

public class MagicData {

    @SerializedName("magicValues")
    @Expose
    private List<MagicValue> magicValues = new LinkedList<>();

    public MagicData(List<MagicValue> magicValues) {
        this.magicValues = magicValues;
    }

    public List<MagicValue> getMagicValues() {
        return magicValues;
    }

    public void setMagicValues(List<MagicValue> magicValues) {
        this.magicValues = magicValues;
    }

    @Override
    public String toString() {
        return "MagicData{" +
                "magicValues=" + magicValues +
                '}';
    }
}
