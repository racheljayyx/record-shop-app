package com.northcoders.recordshopapp.model;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.northcoders.recordshopapp.BR;

public class Record extends BaseObservable {

    private Long id;
    private String name;
    private String artist;
    private String genre;
    private String format;
    private int quantity;
    private int priceInPence;

    public Record(Long id, String name, String artist, String genre, String format, int quantity, int priceInPence) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.format = format;
        this.quantity = quantity;
        this.priceInPence = priceInPence;
    }

    public Record() {
    }


    @Bindable
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }

    @Bindable
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
        notifyPropertyChanged(BR.format);
    }

    @Bindable
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyPropertyChanged(BR.quantity);
    }

    @Bindable
    public int getPriceInPence() {
        return priceInPence;
    }

    public void setPriceInPence(int priceInPence) {
        this.priceInPence = priceInPence;
        notifyPropertyChanged(BR.priceInPence);
    }
}
