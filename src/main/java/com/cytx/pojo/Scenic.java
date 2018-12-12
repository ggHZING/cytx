package com.cytx.pojo;

public class Scenic {
    private Integer scenicId;

    private String scenicName;

    private String scenicAddr;

    private String scenicLink;

    private String scenicTel;

    private String scenicTicket;

    private Double scenicCharge;

    private String scenicPicture;

    private String scenicIntro;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicAddr() {
        return scenicAddr;
    }

    public void setScenicAddr(String scenicAddr) {
        this.scenicAddr = scenicAddr == null ? null : scenicAddr.trim();
    }

    public String getScenicLink() {
        return scenicLink;
    }

    public void setScenicLink(String scenicLink) {
        this.scenicLink = scenicLink == null ? null : scenicLink.trim();
    }

    public String getScenicTel() {
        return scenicTel;
    }

    public void setScenicTel(String scenicTel) {
        this.scenicTel = scenicTel == null ? null : scenicTel.trim();
    }

    public String getScenicTicket() {
        return scenicTicket;
    }

    public void setScenicTicket(String scenicTicket) {
        this.scenicTicket = scenicTicket == null ? null : scenicTicket.trim();
    }

    public Double getScenicCharge() {
        return scenicCharge;
    }

    public void setScenicCharge(Double scenicCharge) {
        this.scenicCharge = scenicCharge;
    }

    public String getScenicPicture() {
        return scenicPicture;
    }

    public void setScenicPicture(String scenicPicture) {
        this.scenicPicture = scenicPicture == null ? null : scenicPicture.trim();
    }

    public String getScenicIntro() {
        return scenicIntro;
    }

    public void setScenicIntro(String scenicIntro) {
        this.scenicIntro = scenicIntro == null ? null : scenicIntro.trim();
    }
}