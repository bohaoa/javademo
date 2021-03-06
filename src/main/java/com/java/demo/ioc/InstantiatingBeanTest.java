package com.java.demo.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.demo.ioc.helloworld.HelloApi;


public class InstantiatingBeanTest {
    
    @Test
    public void instantiatingBeanByConstructor() {
        //使用构造器
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("ioc/instantiatingBean.xml");
        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();

        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }

    @Test
    public void instantiatingBeanByStaticFactory() {
        //使用静态工厂方法
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("ioc/instantiatingBean.xml");
        HelloApi bean3 = beanFactory.getBean("bean3", HelloApi.class);
        bean3.sayHello();
    }

    @Test
    public void instantiatingBeanByInstanceFactory() {
        //使用实例工厂方法
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("ioc/instantiatingBean.xml");
        HelloApi bean4 = beanFactory.getBean("bean4", HelloApi.class);
        bean4.sayHello();
        
    }
}
