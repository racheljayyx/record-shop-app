package com.northcoders.recordshopapp.repository;

import com.northcoders.recordshopapp.model.Record;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecordShopApiService {

    @GET
    Call<List<Record>> getAllRecords();
}
