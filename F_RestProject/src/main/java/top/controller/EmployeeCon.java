package top.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.dao.EmployeeDao;
import top.entity.Employee;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author kinoz
 * @Date 2022/9/24 14:48
 * @apiNote 员工控制器
 */
@Controller
public class EmployeeCon {

    @Resource
    private EmployeeDao employeeDao;

    //获取全部用户信息
    @RequestMapping(value = "employee", method = RequestMethod.GET)
    public String getEmployeeList(Model model){
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList",employeeList);
        return "employee_list";
    }
}
