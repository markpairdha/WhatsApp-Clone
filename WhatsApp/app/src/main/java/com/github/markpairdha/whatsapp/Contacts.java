package com.github.markpairdha.whatsapp;

public class Contacts {
    public String name,image,status;

    public Contacts()
    {

    }

    public void setStatus(String name,String status,String image)
    {
        this.status = status;
        this.image = image;
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
