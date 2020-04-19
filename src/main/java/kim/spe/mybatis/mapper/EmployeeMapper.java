package kim.spe.mybatis.mapper;

import kim.spe.mybatis.bean.Employee;

/**
 * @author charlie
 * @date 2020/4/19 - 10:25
 * @description
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
    public void insertEmp(Employee employee);
}
