package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @author kinoz
 * @Date 2022/8/4 - 19:32
 * @apiNote
 */
@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String username;
    private String password;
}
