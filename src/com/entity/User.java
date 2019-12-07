package com.entity;

/**
 * @ClassName: User
 * @Description:
 * @author: zwx
 * @Date: 2019/11/27 23:35
 * @version: V1.0
 */
public class User {

    private Integer id;
    private String account;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private String birthDate;
    private String createTime;
    private String createBy;

    public User() {
    }

    public User(Integer id, String account, String password, String name, Integer age, Integer sex, String birthDate, String createTime, String createBy) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthDate = birthDate;
        this.createTime = createTime;
        this.createBy = createBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
