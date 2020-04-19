package kim.spe.mybatis.bean;

/**
 * @author charlie
 * @date 2020/4/19 - 9:46
 * @description
 */
public class Department {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
