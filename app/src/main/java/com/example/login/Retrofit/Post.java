package com.example.login.Retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {

    private String title;

    private String price;

    private String date;

    private String img;

    @SerializedName("body")
    private String text;

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

    public String getText() {
        return text;
    }
}
