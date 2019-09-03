package com.lix.domain;

public class Yearreportbasics {
    private String ancheid;

    private String addr;

    private String anchedate;

    private String ancheyear;

    private String busst;

    private String creditno;

    private String email;

    private String entname;

    private String postalcode;

    private String regno;

    private String tel;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getAnchedate() {
        return anchedate;
    }

    public void setAnchedate(String anchedate) {
        this.anchedate = anchedate == null ? null : anchedate.trim();
    }

    public String getAncheyear() {
        return ancheyear;
    }

    public void setAncheyear(String ancheyear) {
        this.ancheyear = ancheyear == null ? null : ancheyear.trim();
    }

    public String getBusst() {
        return busst;
    }

    public void setBusst(String busst) {
        this.busst = busst == null ? null : busst.trim();
    }

    public String getCreditno() {
        return creditno;
    }

    public void setCreditno(String creditno) {
        this.creditno = creditno == null ? null : creditno.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno == null ? null : regno.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}