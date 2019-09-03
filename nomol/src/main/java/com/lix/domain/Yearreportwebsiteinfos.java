package com.lix.domain;

public class Yearreportwebsiteinfos {
    private String ancheid;

    private String domain;

    private String websitname;

    private String webtype;

    private String target;

    public String getAncheid() {
        return ancheid;
    }

    public void setAncheid(String ancheid) {
        this.ancheid = ancheid == null ? null : ancheid.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getWebsitname() {
        return websitname;
    }

    public void setWebsitname(String websitname) {
        this.websitname = websitname == null ? null : websitname.trim();
    }

    public String getWebtype() {
        return webtype;
    }

    public void setWebtype(String webtype) {
        this.webtype = webtype == null ? null : webtype.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
}