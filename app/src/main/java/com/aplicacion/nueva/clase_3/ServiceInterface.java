package com.aplicacion.nueva.clase_3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by francisco on 8/19/17.
 */

public interface ServiceInterface {
    interface ServiceCallback {
        void onProductsArrives(List<Product> products);
        void onError(Error error);
    }
    void fetchProducts(ServiceCallback callback);

    interface Service {
        @GET("users")
        Call<List<Product>> getProducts();
    }
}
