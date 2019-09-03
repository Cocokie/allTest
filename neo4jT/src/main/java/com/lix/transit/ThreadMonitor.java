package com.lix.transit;

import java.util.*;

public class ThreadMonitor {

    public static void main(String[] args) throws InterruptedException {
        NeoContext neoContext = new NeoContext();
        NeoTask neoTask = new NeoTask(neoContext);
        Thread th1 = new Thread(neoTask, Constant.threadHuo);
     /*   Thread th2 = new Thread(neoTask, Constant.threadMu);
        Thread th3 = new Thread(neoTask, Constant.threadJin);
        Thread th4 = new Thread(neoTask, Constant.threadTu);
        Thread th5 = new Thread(neoTask, Constant.threadShui);*/
        th1.start();
       /* th2.start();
        th3.start();
        th4.start();
        th5.start();*/
    }
}
