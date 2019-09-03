package com.lix.controller;

import com.lix.domain.Company;
import com.lix.importurl.MySqlDao;
import com.lix.importurl.ReadCompany;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

public class MyPipeline implements Pipeline {

    public void process(ResultItems resultItems, Task task) {
        String zw = resultItems.get("gsmc");
        String yw = resultItems.get("ywmc");
        String code = resultItems.get("code");
        MySqlDao.insert(zw,yw,code);

    }
}
