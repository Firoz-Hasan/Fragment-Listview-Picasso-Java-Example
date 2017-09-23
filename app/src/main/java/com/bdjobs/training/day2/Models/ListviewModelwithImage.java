package com.bdjobs.training.day2.Models;

import android.media.Image;

/**
 * Created by FIROZ HASAN on 7/27/2017.
 */

public class ListviewModelwithImage {
    String firstText, secondText, imageURL;

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public ListviewModelwithImage(String firstText, String secondText, String imageURL) {

        this.firstText = firstText;
        this.secondText = secondText;
        this.imageURL = imageURL;
    }









}
