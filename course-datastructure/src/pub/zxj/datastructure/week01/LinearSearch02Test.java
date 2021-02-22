package pub.zxj.datastructure.week01;

/**
 * LinearSearch02 测试类
 *
 * @author Jaime
 */
public class LinearSearch02Test {
    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        System.out.println((LinearSearch02.<Integer>search(data, 16) == -1) ? "Not Found!" : "Find, index = " + LinearSearch02.<Integer>search(data, 16));
        System.out.println((LinearSearch02.search(data, 88) == -1) ? "Not Found!" : "Find, index = " + LinearSearch02.search(data, 88));
    }
}
