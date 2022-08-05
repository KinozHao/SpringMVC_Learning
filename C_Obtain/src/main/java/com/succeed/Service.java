package com.succeed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/8/4 - 21:04
 * @apiNote
 */
@Component
public class Service {

    @Autowired
    private Dao dao;

    public List<Book> findAll() {
        return dao.findAll();
    }
}
