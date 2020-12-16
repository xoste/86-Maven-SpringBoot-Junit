package com.xoste.leon.test;

import com.xoste.leon.Application;
import com.xoste.leon.serviceImpl.UsersServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * SpringBoot测试类
 * @RunWith： 启动器
 * SpringJUnit4ClassRunner.class:让Junit与spring环境整合
 * @SpringBootTest(classes = {Application.class})  : 当前类为SpringBoot的测试类
 * @SpringBootTest(classes = {Application.class})  :  加载SpringBoot启动类
 * Junit与spring整合@ContextConfiguration(classpath:applicationContext.xmlx)
 * @author Leon
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
public class JunitTest {
    @Resource
    private UsersServiceImpl usersServiceImpl;
    @Test
    public void insertUsers() {
        this.usersServiceImpl.addUsers();
    }
}
