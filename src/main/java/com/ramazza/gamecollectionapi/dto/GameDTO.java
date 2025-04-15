package com.ramazza.gamecollectionapi.dto;

import jakarta.validation.constraints.*;

public class GameDTO {

    @NotBlank(message = "O nome é obrigatório")
    String name;

    @NotBlank(message = "A plataforma é obrigatória")
    String platform;

    @NotBlank(message = "O genero é obrigatório")
    String genre;

    @NotBlank(message = "O ano é obrigatório")
    @Min(value = 0, message = "Ano inválido")
    int year;

    @NotBlank(message = "O status é obrigatório")
    String status;

    public GameDTO() {}

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
