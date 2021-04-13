import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * @author 李国栋
 * @create 2020-11-11 2:35 下午
 */
public class SelectionSort {

    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E [] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 选择 arr [0..n)中最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        Integer [] arr = {1,4,2,3,6,5};

        SelectionSort.sort(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }

        Student [] stu = {
            new Student("jack",76),
            new Student("jerry",4),
            new Student("moniya",18),
            new Student("coff",16),

        };

        SelectionSort.sort(stu);
        for (Student student : stu) {
            System.out.println(student);
        }

    }
}
