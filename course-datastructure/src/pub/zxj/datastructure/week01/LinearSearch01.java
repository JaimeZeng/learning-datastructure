package pub.zxj.datastructure.week01;

/**
 * 线性查找类 LinearSearch01
 *
 * @author Jaime
 */
public class LinearSearch01 {

    /**
     * 无参构造
     */
    private LinearSearch01() {
    }

    /**
     * 在数组中查找目标值是否存在。存在返回目标元素在数组中的下标索引值。未找到返回-1.
     *
     * @param data   要查找的数组
     * @param target 目标元素
     * @return 找到返回目标元素在数组中的下标索引值。未找到返回-1.
     */
    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
