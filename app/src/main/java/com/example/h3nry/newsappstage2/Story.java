package com.example.h3nry.newsappstage2;

public class Story {

    private String mCategory;

    private String mTitle;

    private String mDate;

    private String mUrl;

    public Story(String category, String title, String date, String url) {

        mCategory = category;

        mTitle = title;

        mDate = date;

        mUrl = url;

    }

    public String getCategory() {
        return mCategory;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}
