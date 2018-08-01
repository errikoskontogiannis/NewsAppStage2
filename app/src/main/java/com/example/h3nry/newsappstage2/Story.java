package com.example.h3nry.newsappstage2;

public class Story {

    private String mCategory;

    private String mTitle;

    private String mUrl;

    public Story(String category, String title, String url) {

        mCategory = category;

        mTitle = title;

        mUrl = url;

    }

    public String getCategory() {
        return mCategory;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

}
