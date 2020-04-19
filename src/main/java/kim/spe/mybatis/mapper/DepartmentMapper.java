package kim.spe.mybatis.mapper;

import kim.spe.mybatis.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author charlie
 * @date 2020/4/19 - 9:50
 * @description
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDept(Department department);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department (departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
