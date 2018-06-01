package com.javtex.mapsgo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CombuyClient {
    @GET("localnegocio/")
    public Call<List<CombuyLocal>> getListLocales();

}
