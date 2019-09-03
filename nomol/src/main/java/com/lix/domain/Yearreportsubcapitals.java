package com.lix.domain;

public class Yearreportsubcapitals {
    private String ancheid;

    private String condate;

    private String conform;

    private String currency;

    private String inv;

    private String lisubconam;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getCondate() {
        return condate;
    }

    public void setCondate(String condate) {
        this.condate = condate == null ? null : condate.trim();
    }

    public String getConform() {
        return conform;
    }

    public void setConform(String conform) {
        this.conform = conform == null ? null : conform.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getInv() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv = inv == null ? null : inv.trim();
    }

    public String getLisubconam() {
        return lisubconam;
    }

    public void setLisubconam(String lisubconam) {
        this.lisubconam = lisubconam == null ? null : lisubconam.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}