package com.jianzhu.controller;

import com.lix.importurl.MySqlDao;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class MyPipeline implements Pipeline {

    public void process(ResultItems resultItems, Task task) {
        String target = resultItems.get("target");
        if(target==null)return;
        String infoId = resultItems.get("infoId");
        String category = resultItems.get("category");
        MySqlDao.insert(target,infoId,category);
    }
}
