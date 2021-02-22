package pub.zxj.datastructure.week01;

/**
 * 学生类 Student 的测试类
 *
 * @author Jaime
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu01 = new Student("Jaime", "S001");
        Student stu02 = new Student("Ryan", "S002");
        Student stu03 = new Student("ZhangWei", "S006");
        Student[] stus = {stu01, stu02, stu03};

        System.out.println(LinearSearch02.search(stus, stu02));   //添加断点查看

        Student stuKong = null;
        System.out.println(LinearSearch02.search(stus, stuKong));   //添加断点查看

        Student stuKosya = new Student("Kosya", "S996");
        System.out.println(LinearSearch02.search(stus, stuKosya));   //添加断点查看

        Student stuJaime = new Student("zhangwei", "s006");
        System.out.println(LinearSearch02.search(stus, stuJaime));   //添加断点查看
    }
}
