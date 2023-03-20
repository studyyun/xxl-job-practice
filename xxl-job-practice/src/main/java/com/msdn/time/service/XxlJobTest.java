package com.msdn.time.service;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class XxlJobTest {

    @XxlJob("xxlJobTest")
    public ReturnT<String> xxlJobTest(String date) {
        String param = XxlJobHelper.getJobParam();
        log.info("-------hello world------" + param);
        return ReturnT.SUCCESS;
    }

    @XxlJob("xxlJobTest2")
    public ReturnT<String> xxlJobTest2(String date) {
        String param = XxlJobHelper.getJobParam();
        log.info("-------hello world2222------" + param);
        return ReturnT.SUCCESS;
    }
}

