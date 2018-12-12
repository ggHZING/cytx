package com.cytx.pojo;

public class Mycollection {
    private Integer mycollectionId;

    private Integer mycollectionScenicId;

    private String mycollectionScenicName;

    private String mycollectionScenicPicture;

    public Integer getMycollectionId() {
        return mycollectionId;
    }

    public void setMycollectionId(Integer mycollectionId) {
        this.mycollectionId = mycollectionId;
    }

    public Integer getMycollectionScenicId() {
        return mycollectionScenicId;
    }

    public void setMycollectionScenicId(Integer mycollectionScenicId) {
        this.mycollectionScenicId = mycollectionScenicId;
    }

    public String getMycollectionScenicName() {
        return mycollectionScenicName;
    }

    public void setMycollectionScenicName(String mycollectionScenicName) {
        this.mycollectionScenicName = mycollectionScenicName == null ? null : mycollectionScenicName.trim();
    }

    public String getMycollectionScenicPicture() {
        return mycollectionScenicPicture;
    }

    public void setMycollectionScenicPicture(String mycollectionScenicPicture) {
        this.mycollectionScenicPicture = mycollectionScenicPicture == null ? null : mycollectionScenicPicture.trim();
    }
}