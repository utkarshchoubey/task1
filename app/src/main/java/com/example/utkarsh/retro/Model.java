package com.example.utkarsh.retro;

import java.util.ArrayList;

public class Model {
    String type;
    String id;
    ArrayList<String> dataMap;
    String title;

    public Model(String type, String id, ArrayList<String> dataMap, String title) {
        this.type = type;
        this.id = id;
        this.dataMap = dataMap;
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getDataMap() {
        return dataMap;
    }

    public void setDataMap(ArrayList<String> dataMap) {
        this.dataMap = dataMap;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
