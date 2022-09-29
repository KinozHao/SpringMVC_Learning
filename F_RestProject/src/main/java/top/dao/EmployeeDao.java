package top.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.entity.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/9/24 14:53
 * @apiNote 模拟用户数据
 */
@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static Map<Integer, Employee> employees = null;

    //静态数据
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

    /**
     * 保存员工
     * @param employee
     */
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        //employees.put(employee.getId(), employee);
        String sql = "insert into restful values(?,?,?,?)";
        int update = jdbcTemplate.update(sql, employee.getId(), employee.getLastName(), employee.getEmail(), employee.getGender());
        System.out.println("添加成功:影响行数:"+update);

    }

    /**
     * 获取所有员工
     * @return
     */
    @Test
    public Collection<Employee> getAll() {
        String sql = "select * from restful";
        List<Employee> employeeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        //return employees.values();
        return employeeList;
    }

    /**
     * 根据id获取员工
     * @param id
     * @return
     */
    public Employee get(Integer id) {
        String sql = "select * from restful where id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), id);
        return employee;
        //return employees.get(id);
    }

    /**
     * 根据id删除员工
     * @param id
     */
    public void delete(Integer id) {
        String sql = "delete from restful where id=?";
        jdbcTemplate.update(sql,id);
        //employees.remove(id);
    }
}
