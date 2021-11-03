package com.example.teste2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface CustumersService {
    @GET("entities/customers")
    @Headers({
            "cookie: PHPSESSID=uug5lejgaan39vq883p5si8u4h; lang=pt",
            "Authorization: Basic YWRtaW46MTQ1MzZiNjQ1YmUwNmI4M2QyZTc1Nzk3ZjMyM2ZiODhlMGIyNGVmMw=="
    })
    Call<CustomerResult> get();

}
