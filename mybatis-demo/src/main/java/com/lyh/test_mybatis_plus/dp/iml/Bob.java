package com.lyh.test_mybatis_plus.dp.iml;


import com.lyh.test_mybatis_plus.dp.People;
import org.springframework.stereotype.Service;

@Service("bob_nb")
public class Bob implements People {

    @Override
    public void run() {
        System.out.println("Bob runs fast!");
    }

    @Override
    public void eat() {
        System.out.println("Bob runs fast!");
    }
}
