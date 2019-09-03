package com.jianzhu.controller;

import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.scheduler.QueueScheduler;

public class MyScheduler extends QueueScheduler {
    int num;

    public void push(Request request, Task task) {
        this.logger.trace("get a candidate url {}", request.getUrl());
        if (this.shouldReserved(request) || this.noNeedToRemoveDuplicate(request) || !getDuplicateRemover().isDuplicate(request, task)) {
            this.logger.debug("push to queue {}", request.getUrl());
            this.pushWhenNoDuplicate(request, task);
        }

    }
}
