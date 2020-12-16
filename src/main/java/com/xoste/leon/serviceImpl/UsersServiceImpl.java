package com.xoste.leon.serviceImpl;

import com.xoste.leon.daoImpl.UsersDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Leon
 */
@Service
public class UsersServiceImpl {
    @Resource
    private UsersDaoImpl usersDaoImpl;
    public void addUsers() {
        this.usersDaoImpl.insertUsers();
    }
}
