package com.strepsis.reader.model;

/**
 * Created by pcerbino on 13/02/17.
 */
public class FeedMessage {


    String title;
    String description;
    String link;
    String autor;
    String guid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "FeedMessage[ title : " + title + " , description : " + description + " , link : " + link + " " +
                " , autor : " + autor + " , guid : " + guid + "   ]";
    }

}
