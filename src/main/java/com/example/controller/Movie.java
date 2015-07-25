package com.example.controller;


import java.io.Serializable;

public class Movie implements Serializable {

    private int id;
    private String name;
    private String directory;

    public Movie(int id, String directory,  String name) {
        this.directory = directory;
        this.id = id;
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "directory='" + directory + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}