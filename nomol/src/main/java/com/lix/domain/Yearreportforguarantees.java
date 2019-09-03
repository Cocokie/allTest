package com.lix.domain;

public class Yearreportforguarantees {
    private String ancheid;

    private String gatype;

    private String guarapperiod;

    private String more;

    private String mortgagor;

    private String pefperform;

    private String pefperto;

    private String priclasecam;

    private String priclaseckind;

    private String rage;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getGatype() {
        return gatype;
    }

    public void setGatype(String gatype) {
        this.gatype = gatype == null ? null : gatype.trim();
    }

    public String getGuarapperiod() {
        return guarapperiod;
    }

    public void setGuarapperiod(String guarapperiod) {
        this.guarapperiod = guarapperiod == null ? null : guarapperiod.trim();
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more == null ? null : more.trim();
    }

    public String getMortgagor() {
        return mortgagor;
    }

    public void setMortgagor(String mortgagor) {
        this.mortgagor = mortgagor == null ? null : mortgagor.trim();
    }

    public String getPefperform() {
        return pefperform;
    }

    public void setPefperform(String pefperform) {
        this.pefperform = pefperform == null ? null : pefperform.trim();
    }

    public String getPefperto() {
        return pefperto;
    }

    public void setPefperto(String pefperto) {
        this.pefperto = pefperto == null ? null : pefperto.trim();
    }

    public String getPriclasecam() {
        return priclasecam;
    }

    public void setPriclasecam(String priclasecam) {
        this.priclasecam = priclasecam == null ? null : priclasecam.trim();
    }

    public String getPriclaseckind() {
        return priclaseckind;
    }

    public void setPriclaseckind(String priclaseckind) {
        this.priclaseckind = priclaseckind == null ? null : priclaseckind.trim();
    }

    public String getRage() {
        return rage;
    }

    public void setRage(String rage) {
        this.rage = rage == null ? null : rage.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}