package com.service;

import com.dao.UserDao;
import com.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserService
 * @Description:
 * @author: zwx
 * @Date: 2019/11/28 0:20
 * @version: V1.0
 */
public class UserService {

    private static UserDao userDao = new UserDao();

    public List<User> listAll(String account, Integer count) {
        return userDao.listAll(account, count);
    }

    public Integer count(String account) {
        return userDao.count(account);
    }

    public void delById(Integer index) {
        userDao.delById(index);
    }

    public void addUser(User user) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        user.setCreateTime(format);
        userDao.addUser(user);
     }

    public User getById(Integer index) {
        return userDao.getById(index);
    }




















}
