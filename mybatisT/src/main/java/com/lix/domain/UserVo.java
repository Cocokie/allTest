package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class UserVo {
    List<Integer> ids = new ArrayList<Integer>();
    User s = new User();

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }


    public User getS() {
        return s;
    }

    public void setS(User s) {
        this.s = s;
    }
}
