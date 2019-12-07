package com.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName: JdbcTemplateUtil
 * @Description:
 * @author: zwx
 * @Date: 2019/11/27 22:14
 * @version: V1.0
 */
public class JdbcTemplateUtil {

    private static DataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
            properties.load(JdbcTemplateUtil.class.getResourceAsStream("/com/jdbctemplate.properties"));
             dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
