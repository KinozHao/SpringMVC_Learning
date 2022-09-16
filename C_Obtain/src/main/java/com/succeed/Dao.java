package com.succeed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/8/4 - 20:39
 * @apiNote
 */
@Component
public class Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Book> findAll() {
        String sql = "select * from book_info";
        final List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return query;
    }

}
