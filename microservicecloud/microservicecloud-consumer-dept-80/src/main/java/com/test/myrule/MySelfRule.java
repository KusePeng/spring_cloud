package com.test.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 自定义负载规则
 * @Created by XP
 * @Date 2019/9/10
 */
@Configuration
public class MySelfRule {


    @Bean
    public IRule myRule(){
        //return new RandomRule();

        return new RandomRule_MySelf();
    }

}
