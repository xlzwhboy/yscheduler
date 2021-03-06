package com.yeahmobi.yscheduler.common;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.scheduling.support.CronSequenceGenerator;
import org.springframework.scheduling.support.CronTrigger;

public class CrontabUtils {

    /**
     * 兼容linux crontab，把5位的crontab表达式补全到6位
     */
    public static String normalize(String crontab, boolean padding) {
        if (StringUtils.isBlank(crontab)) {
            throw new IllegalArgumentException("调度时间表达式为空！");
        }
        String newCrontab = crontab;
        if (StringUtils.split(crontab).length == 5) {
            newCrontab = "0 " + crontab;
        }
        try {
            new CronTrigger(newCrontab);
        } catch (Exception e) {
            throw new IllegalArgumentException("错误的调度时间表达式:\n" + e.getMessage());
        }

        // quartz表达式秒位不是0
        if (!newCrontab.trim().startsWith("0 ")) {
            throw new IllegalArgumentException("调度时间只支持到分钟级别！");
        }
        if (padding) {
            return newCrontab;
        } else {
            return crontab;
        }
    }

    public static Date next(String expression, Date from) {
        CronSequenceGenerator generator = new CronSequenceGenerator(normalize(expression, true), Constants.TIMEZONE);
        return generator.next(from);
    }

    public static boolean validateLastScheduleTime(String expression, Date lastTime, Date time) {
        return time.equals(next(expression, lastTime));
    }
}
