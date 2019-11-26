package com.ramo.shengwu;

import com.ramo.shengwu.Entity.Shebei;
import com.ramo.shengwu.Mapper.ShebeiMapper;
import com.ramo.shengwu.com.SpringUtils;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class ShengwuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShengwuApplication.class, args);


        org.springframework.context.ApplicationContext applicationContext=SpringUtils.getApplicationContext();
         ShebeiMapper shebeiMapper=applicationContext.getBean(ShebeiMapper.class);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                List<Shebei> shebeiList=shebeiMapper.findByTime();
                Date nowDate=new Date();
                for (Shebei shebei:shebeiList){


                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    try {
                        Date time=sdf.parse(shebei.getTime());
                        long a=nowDate.getTime();
                        long b=time.getTime();
                        int dx= (int) ((a-b)/1000);
                        if(dx>60){
                            //拼接字符串：更改dx>60，获取Id的数据,状态改为0

                            shebeiMapper.updateStatus(shebei.getId());
                        }


                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }

            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每60秒执行一次
        timer.schedule(timerTask,10,60000);
    }
}
