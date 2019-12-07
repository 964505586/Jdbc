package com.dao;

import com.entity.User;
import com.utils.JdbcTemplateUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcTemplateUtil.getDataSource());

    public List<User> listAll(String account, Integer count) {
        String sql = "select * from sys_user where account like ? limit ?, ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), "%" + account + "%", (count - 1) * 2, 2); // 从x开始取y位
    }

    public Integer count(String account) {
        String sql = "select count(1) from sys_user where account like ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, "%" + account + "%");
    }

    public void delById(Integer index) {
        String sql = "delete from sys_user where id = ?";
        jdbcTemplate.update(sql, index);
    }

    public void addUser(User user) {
        String sql = "";
        jdbcTemplate.update(sql, user.getAccount(), user.getName(), user.getAge(), user.getSex(), user.getBirthDate(), user.getCreateTime(), user.getCreateBy());
    }

    public User getById(Integer id) {
        String sql = "select * from sys_user where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }
}
