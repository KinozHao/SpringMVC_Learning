package top.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/1 - 10:06
 * @apiNote
 */
@Component
@RequestMapping("/teacher")
public class TeacherList {

    @RequestMapping("/tea_list")
    public String stu(){
        return "Teacher";
    }
}
