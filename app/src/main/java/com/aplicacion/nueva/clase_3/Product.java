package com.aplicacion.nueva.clase_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by francisco on 8/19/17.
 */

public class Product {
    @SerializedName("id")
    @Expose
    public long id;

    @SerializedName("name")
    @Expose
    public String name;

    @Override
    public String toString() {
        return name + " id: "+ id;
    }
}
