package com.aplicacion.nueva.clase_3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by francisco on 8/19/17.
 */

public final class ApplicationConstants {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static <T> T getRetrofitBuilder(final Class<T> service) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(service);
    }
}
