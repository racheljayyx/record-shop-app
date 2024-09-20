package com.northcoders.recordshopapp.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.northcoders.recordshopapp.model.Record;
import com.northcoders.recordshopapp.repository.RecordShopRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private final RecordShopRepository recordShopRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.recordShopRepository = new RecordShopRepository();
    }

    public LiveData<List<Record>> getAllRecords() {
        return recordShopRepository.getMutableLiveData();
    }



}
