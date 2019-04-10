package com.example.utkarsh.retro;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("v2/5cadd3432f00000d343a984a")
    Call<JSONResponse> getJSON();
}


