package com.example.ganhong.photos;

/**
 * Created by GanHong on 5/3/17.
 */

public class Upload {

    public String name;
    public String url;
    public String description;

    public Upload() {

    }

    public Upload(String name, String url, String description) {
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() { return description; }

}
