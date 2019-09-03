package com.lix.domain;

public class Yearreportalters {
    private String ancheid;

    private String altitem;

    private String altaf;

    private String altbe;

    private String altdate;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getAltitem() {
        return altitem;
    }

    public void setAltitem(String altitem) {
        this.altitem = altitem == null ? null : altitem.trim();
    }

    public String getAltaf() {
        return altaf;
    }

    public void setAltaf(String altaf) {
        this.altaf = altaf == null ? null : altaf.trim();
    }

    public String getAltbe() {
        return altbe;
    }

    public void setAltbe(String altbe) {
        this.altbe = altbe == null ? null : altbe.trim();
    }

    public String getAltdate() {
        return altdate;
    }

    public void setAltdate(String altdate) {
        this.altdate = altdate == null ? null : altdate.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}