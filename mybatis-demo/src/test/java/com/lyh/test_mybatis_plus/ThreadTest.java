package com.lyh.test_mybatis_plus;


import lombok.extern.log4j.Log4j;
import org.springframework.boot.test.context.SpringBootTest;


@Log4j(topic = "c.Test")
@SpringBootTest
public class ThreadTest {
    static int c = 0;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("T1"){
            @Override
            public void run() {
                for(int i = 0;i < 5000;++i)
                    synchronized (lock) {
                        c++;
                        log.debug("--->" + c);
                    }
                }
            };
        Thread t2 = new Thread("T2"){
            @Override
            public void run() {
                for(int i = 0;i < 5000;i++)
                        c--;
                        log.debug("        --->" + c);
            }
        };

//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t1.setDaemon(true);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        log.debug(c);

    }
}
