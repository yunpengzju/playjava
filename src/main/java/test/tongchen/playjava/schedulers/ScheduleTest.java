/*
 * Fabric4cloud.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package test.tongchen.playjava.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author miro
 * @version $Id: ScheduleTest.java, v 0.1 2019-03-01 15:26:37 miro Exp $
 */
@Component
public class ScheduleTest {
    @Scheduled(fixedRate = 1000)
    public void speaker() {
        System.out.println("This is tongchen's scheduler test");
    }
}
