package pub.zxj.datastructure.week01;

/**
 * 线性查找类 LinearSearch02, 使用泛型
 *
 * @author Jaime
 */
public class LinearSearch02 {

    /**
     * 无参构造
     */
    private LinearSearch02() {
    }

    /**
     * 在类对象数组中查找类对象目标值是否存在。存在返回目标元素在数组中的下标索引值。未找到返回-1.
     *
     * @param data   类对象数组
     * @param target 类对象目标元素
     * @param <E>    泛型
     * @return 存在返回目标元素在数组中的下标索引值。未找到返回-1.
     */
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (target.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }
}
