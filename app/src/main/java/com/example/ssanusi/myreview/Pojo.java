package com.example.ssanusi.myreview;

public class Pojo {

    private String name;
    private String continent;
    private String description;
    private int Image;

    public Pojo(String name, String continent, int image,String description) {
        this.name = name;
        this.continent = continent;
        this.description= description;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
