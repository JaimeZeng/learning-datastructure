package pub.zxj.datastructure.week01;

/**
 * LinearSearch01 测试类
 *
 * @author Jaime
 */
public class LinearSearch01Test {
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        // LinearSearch01 ls = new LinearSearch01();
        System.out.println((LinearSearch01.search(data, 16) == -1) ? "Not Found!" : "Find, index = " + LinearSearch01.search(data, 16));
        System.out.println((LinearSearch01.search(data, 88) == -1) ? "Not Found!" : "Find, index = " + LinearSearch01.search(data, 88));
    }
}
