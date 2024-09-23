package com.northcoders.recordshopapp.ui.mainactivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.northcoders.recordshopapp.databinding.RecordItemBinding;
import com.northcoders.recordshopapp.model.Record;

import java.util.List;

public class RecordShopAdapter extends RecyclerView.Adapter<RecordShopAdapter.RecordShopViewHolder> {

    private List<Record> records;
    private Context context;

    public RecordShopAdapter(List<Record> records, Context context) {
        this.records = records;
        this.context = context;
    }

    @NonNull
    @Override
    public RecordShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordShopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class RecordShopViewHolder extends RecyclerView.ViewHolder {

        private final RecordItemBinding recordItemBinding;

        public RecordShopViewHolder(RecordItemBinding recordItemBinding) {
            super(recordItemBinding.getRoot());
            this.recordItemBinding = recordItemBinding;
        }


    }

}
