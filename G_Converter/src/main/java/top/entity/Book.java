package top.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author kinoz
 * @Date 2022/10/4 15:33
 * @apiNote 此实体对象用于测试@ResponseBody注解
 * @see top.controller.HttpController
 */
//使用lombok省略繁琐的setter getter以及有参无参构造器
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int id;
    private String bookName;
    private String bookPrice;
}
