package com.javtex.mapsgo;

import android.location.Location;
import android.os.StrictMode;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CombuyRetrofit {
    String URL="https://combuyapi.herokuapp.com/";

    public List<CombuyLocal> getListLocal(){

    List<CombuyLocal> listLocal = null;


    StrictMode.ThreadPolicy policy = new
            StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .client(httpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    CombuyClient api=retrofit.create(CombuyClient.class);

        try {
            final Call<List<CombuyLocal>> callsync= api.getListLocales();
            Response<List<CombuyLocal>> response=callsync.execute();
            listLocal=response.body();
            if(response.code()==200){
                Log.v("RETRO","Response Satisfed!");
            }else{
                Log.v("RETRO","Failed U.U");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listLocal;
    }


}
