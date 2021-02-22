package pub.zxj.datastructure.week01;

/**
 * 自定义学生类 Student
 *
 * @author Jaime
 */
public class Student {
    /**
     * 学生姓名stuName、学生学号stuId
     */
    private String stuName;
    private String stuId;

    /**
     * 无参构造
     */
    public Student() {
    }

    /**
     * 全参构造初始化
     *
     * @param stuName 学生姓名
     * @param stuId   学生学号
     */
    public Student(String stuName, String stuId) {
        this.setStuName(stuName);
        this.setStuId(stuId);
    }

    /**
     * 获取学生姓名
     *
     * @return 学生姓名
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置学生姓名
     *
     * @param stuName 学生姓名
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * 获取学生学号
     *
     * @return 学生学号
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 设置学生学号
     *
     * @param stuId 学生学号
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * 重写equals方法（Ctrl+O），判断两类对象的学生学号属性（不区分大小写）是否一致。
     *
     * @param obj 传入的类对象
     * @return 两类对象的学生学号属性（不区分大小写）一致返回true，否则返回false
     */
    @Override
    public boolean equals(Object obj) {

        // 判断是否比较的是同一个对象
        if (this == obj) {
            return true;
        }

        // 传入的对象是否为空
        if (obj == null) {
            return false;
        }

        // 判断两对象的类是否一致
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Student another = (Student) obj;
        return this.getStuId().toLowerCase().equals(another.getStuId().toLowerCase());
    }
}
