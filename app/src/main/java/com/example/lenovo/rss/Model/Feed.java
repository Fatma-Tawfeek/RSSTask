package com.example.lenovo.rss.Model;

/**
 * Created by lenovo on 11/23/2017.
 */

public class Feed
{
    public String url;
    public String title;
    public String link;
    public String author;
    public String image;

    public Feed(String url, String title, String link, String author, String image) {
        this.url = url;
        this.title = title;
        this.link = link;
        this.author = author;
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
