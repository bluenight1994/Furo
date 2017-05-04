package com.example.ganhong.photos;

/**
 * Created by GanHong on 5/3/17.
 */

public class Upload {

    public String name;
    public String url;
    public String description;
    public Boolean isPublic;

    public Upload() {

    }

    public Upload(String name, String url, String description, Boolean isPublic) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() { return description; }

    public Boolean getIsPublic() { return isPublic; }
}
