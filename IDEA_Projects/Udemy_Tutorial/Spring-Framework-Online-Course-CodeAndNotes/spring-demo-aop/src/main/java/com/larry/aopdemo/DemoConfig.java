package com.larry.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.larry.aopdemo")
public class DemoConfig {


}
