package com.example.fo_severside.Remote;

import com.example.fo_severside.Model.MyResponse;
import com.example.fo_severside.Model.Sender;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAAexTsSk:APA91bFNFzTkeG5JIkSc9nR68ow9Tby8xa-wvBfL2IC4HRGeg9eg--YL6SyVjFEJguWoE-teRvvDQ15WcLRjaGdMI7ZcwmAq-B0CY9vsqxs4pxVrG70PqM4Vn3VBr4okW6rWd2hFd2Bn"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
