package com.lix.transit;

public class NeoContext {
    private static final int excuteNum = 1000;
    private int currentRelationNum;
    private int skip=356180;

    public static int getExcuteNum() {
        return excuteNum;
    }

    public int getCurrentRelationNum() {
        return currentRelationNum;
    }

    public void setCurrentRelationNum(int currentRelationNum) {
        this.currentRelationNum = currentRelationNum;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }
}
