package com.example.login.ui;



public class products {
    private String id ;
    private String title;
    private String price;
    private String date;
    private  String img;
    public products() {
    }

    public products(String id ,String title, String price, String date, String img) {
        this.id=id;
        this.title = title;
        this.price = price;
        this.price = price;
        this.img = img;

    }
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getImg() {
        return img;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setimg(String img) {
        this.img = img;
    }


}
