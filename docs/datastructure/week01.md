---
title: 第1周 线性查找法
url: week01
---

# 第 1 周 线性查找法

开课第一周，我们将学习最简单的算法：线性查找法。在学习这样一个最简单的算法的过程中，我们也将接触诸多概念：循环不变量，复杂度分析，如何使用泛型让我们的算法更通用，以及简单的性能测试方式。

**课程安排**

1. 什么是算法
2. 为什么要学习算法和数据结构
3. 线性查找算法
4. 使用泛型让算法更通用
5. 自定义类测试算法
6. 循环不变量
7. 复杂度分析
8. 常见算法复杂度举例

## 什么是算法

### 算法

::: tip Algorithm

In mathematics and computer science, an algorithm (/ˈælɡərɪðəm/ (About this soundlisten)) is a finite sequence of well-defined, computer-implementable instructions, typically to solve a class of problems or to perform a computation.Algorithms are always unambiguous and are used as specifications for performing calculations, data processing, automated reasoning, and other tasks.

::: right
[Algorithm - Wikipedia](https://en.wikipedia.org/wiki/Algorithm)
:::

::: tip 算法

算法（algorithm），在数学（算学）和计算机科学之中，一个被定义好的、计算机可施行之指示的有限步骤或次序，常用于计算、数据处理和自动推理。作为一个有效方法，算法被用于计算函数，它包含了一系列定义清晰的指令，并可于有限的时间及空间内清楚的表述出来。

::: right
[算法 - 维基百科](https://zh.wikipedia.org/wiki/算法)
:::

算法：（Algorithm，本意：解决问题的方法。）一系列解决问题的、清晰的、可执行的计算机指令。

### 生活中的的算法

- 菜谱：鱼香肉丝的做法？

  - 1. 猪里脊肉切细丝,加腌肉调料腌制十几分钟;
  - 2. 绿尖椒、胡萝卜、冬笋分别切细丝,黑木耳泡软洗净切细丝备用;
  - 3. 调好鱼香汁备用,葱、姜、蒜切末备用,泡辣椒切未备用;
  - 4. 锅中放足量油,油六七成热时放入肉丝大火快速滑散至变白,盛出备用;
  - 5. 锅中放少许油,放入葱、姜、蒜末炒香,放入泡辣辣末炒岀红油;
  - 6. 放入胡萝卜、冬笋、木耳翻炒 2 分钟,放入尖椒翻炒均匀;
  - 7. 放入炒好的肉丝迅速翻炒均匀;
  - 8. 倒入鱼香汁快速翻炒均匀即可。

- 问路：如何去天安门？

- 数学：如何求解一元二次方程？

### 算法五大特性

1. 有限性：依据图灵的定义，一个算法是能够被任何图灵完备系统模拟的一串运算，而图灵机只有有限个状态、有限个输入符号和有限个转移函数（指令）。而一些定义更规定算法必须在有限个步骤内完成任务。
2. 确定性：又称明确性：算法的描述必须无歧义（不会产生二义性），以保证算法的实际执行结果是精确地符合要求或期望，通常要求实际运行结果是确定的。
3. 可行性：又称有效性：能够实现，算法中描述的操作都是可以通过已经实现的基本运算执行有限次来实现。
4. 输入：一个算法必须有零个或以上输入量。
5. 输出：一个算法应有一个或以上输出量，输出量是算法计算的结果。

## 线性查找算法

在 data 数组中查找 16.

```java
// 在 data 数组中查找 16.

                   i
                   ↓
data  24 18 12 09 16 66 32 04
index  0  1  2  3  4  5  6  7
```

输入： 数组 data[] ，目标元素 i。
输出： 目标元素所在数组索引值。若不存在则返回-1。

<CodeGroup>
  <CodeGroupItem title="LinearSearch.java" active>

```java
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
```

</CodeGroupItem>
  <CodeGroupItem title="LinearSearch01.java">

```java
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
```

</CodeGroupItem>
  <CodeGroupItem title="LinearSearch01Test.java">

```java
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
```

</CodeGroupItem>
</CodeGroup>

### 使用泛型

- 不可以是基本数据类型,只能是类对象。Java 基本数据类型：(boolean, byte, char, short, int, long, float, double)
- 每个基本数据类型都有对应的包装类:(Boolean, Byte, Character, Short, Integer, Long, Float, Double)

<CodeGroup>
<CodeGroupItem title="LinearSearch02.java" active>

```java
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
```

</CodeGroupItem>
<CodeGroupItem title="LinearSearch02Test.java">

```java
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
```

</CodeGroupItem>
</CodeGroup>

### 自定义学生类 Student 测试

<CodeGroup>
<CodeGroupItem title="Student.java" active>

```java
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
```

</CodeGroupItem>
<CodeGroupItem title="LinearSearch02.java">

```java
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
```

</CodeGroupItem>
<CodeGroupItem title="StudentTest.java">

```java
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
```

</CodeGroupItem>
</CodeGroup>
