package com.ramazza.gamecollectionapi.model;

public class Game {

    String name;
    String platform;
    String genre;
    int year;
    String status;

    public Game(String name, String platform, String genre, int year, String status) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.year = year;
        this.status = status;
    }

    public String getName() { return name; }
    public String getPlatform() { return platform; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public String getStatus() { return status; }

    public void setName(String name) { this.name = name; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setYear(int year) { this.year = year; }
    public void setStatus(String status) { this.status = status; }
}
