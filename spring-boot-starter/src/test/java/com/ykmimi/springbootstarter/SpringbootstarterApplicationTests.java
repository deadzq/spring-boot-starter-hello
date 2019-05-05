package com.ykmimi.springbootstarter;

import com.wisdom.stat.HelloServiceConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootstarterApplicationTests {

    @Resource
    HelloServiceConfiguration helloService;

    @Test
    public void contextLoads() {
        System.out.println(helloService.getName());
    }

}
