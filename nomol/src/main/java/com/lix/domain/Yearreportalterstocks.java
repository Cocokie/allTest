package com.lix.domain;

public class Yearreportalterstocks {
    private String ancheid;

    private String altdate;

    private String inv;

    private String transamaft;

    private String transampr;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getAltdate() {
        return altdate;
    }

    public void setAltdate(String altdate) {
        this.altdate = altdate == null ? null : altdate.trim();
    }

    public String getInv() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv = inv == null ? null : inv.trim();
    }

    public String getTransamaft() {
        return transamaft;
    }

    public void setTransamaft(String transamaft) {
        this.transamaft = transamaft == null ? null : transamaft.trim();
    }

    public String getTransampr() {
        return transampr;
    }

    public void setTransampr(String transampr) {
        this.transampr = transampr == null ? null : transampr.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}