package com.northcoders.recordshopapp.repository;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

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

    public void addNewRecord(Record record) {
        RecordShopApiService apiService = RetrofitInstance.getService();

        Call<Record> call =  apiService.addRecord(record);

        call.enqueue(new Callback<Record>() {
            @Override
            public void onResponse(Call<Record> call, Response<Record> response) {
                Toast.makeText(application.getApplicationContext(),
                        "Record added to database",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Record> call, Throwable t) {
                Toast.makeText(application.getApplicationContext(),
                        "Unable to add record to database",
                        Toast.LENGTH_SHORT).show();
                Log.e("POST request failed", t.getMessage());
            }
        });
    }
}
