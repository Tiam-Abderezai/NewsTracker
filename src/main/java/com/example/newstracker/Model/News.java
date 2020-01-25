package com.example.newstracker.Model;


public class News {

    private String mTitle;
    private String mSection;
    private String mDate;
    private String mAuthor;
    private String mUrl;


    public News(String mTitle,
                String mSection,
                String mDate,
                String mAuthor,
                String mUrl) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mAuthor = mAuthor;
        this.mUrl = mUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}