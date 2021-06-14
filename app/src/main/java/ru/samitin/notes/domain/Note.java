package ru.samitin.notes.domain;

import androidx.annotation.StringRes;

public class Note {
    @StringRes
    private int name;
    @StringRes
    private int description;
    @StringRes
    private int date;
    @StringRes
    private int note;

    public Note(int name,int description,int date,int note){
        this.name=name;
        this.description=description;
        this.date=date;
        this.note=note;
    }
    public int getName(){ return name;}
    public int getDescription(){return description;}
    public int getDate(){return date;}
    public int getNote(){return note;}
}
