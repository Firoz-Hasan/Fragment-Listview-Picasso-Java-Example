package com.bdjobs.training.day2.Models;

/**
 * Created by FIROZ HASAN on 7/27/2017.
 */

public class BaseDataModel {
    String name, address;

    public BaseDataModel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
