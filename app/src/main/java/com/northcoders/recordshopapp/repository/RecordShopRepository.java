package com.northcoders.recordshopapp.repository;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.model.Record;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecordShopRepository {

    private MutableLiveData<List<Record>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public MutableLiveData<List<Record>> getMutableLiveData() {

        RecordShopApiService apiService = RetrofitInstance.getService();
        Call<List<Record>> call = apiService.getAllRecords();

        call.enqueue(new Callback<List<Record>>() {
            @Override
            public void onResponse(Call<List<Record>> call, Response<List<Record>> response) {
                List<Record> records = response.body();
                mutableLiveData.setValue(records);
            }

            @Override
            public void onFailure(Call<List<Record>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
