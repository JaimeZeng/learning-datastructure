package pub.zxj.datastructure.week01;

/**
 * 线性查找类 LinearSearch
 *
 * @author Jaime
 */
public class LinearSearch {

    /**
     * 在数组中查找目标值是否存在。存在返回目标元素在数组中的下标索引值。未找到返回-1.
     *
     * @param data   要查找的数组
     * @param target 目标元素
     * @return 找到返回目标元素在数组中的下标索引值。未找到返回-1.
     */
    public int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        LinearSearch ls = new LinearSearch();
        System.out.println((ls.search(data, 16) == -1) ? "Not Found!" : "Find, index = " + ls.search(data, 16));
        System.out.println((ls.search(data, 88) == -1) ? "Not Found!" : "Find, index = " + ls.search(data, 88));
    }
}
