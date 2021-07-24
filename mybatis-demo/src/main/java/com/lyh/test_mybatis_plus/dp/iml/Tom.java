package com.lyh.test_mybatis_plus.dp.iml;

import com.lyh.test_mybatis_plus.dp.People;
import org.springframework.stereotype.Service;

@Service("tom_nb")
public class Tom implements People {
    @Override
    public void run() {
        System.out.println("Tom runs fast!");
    }

    @Override
    public void eat() {
        System.out.println("Tom runs fast!");
    }
}
