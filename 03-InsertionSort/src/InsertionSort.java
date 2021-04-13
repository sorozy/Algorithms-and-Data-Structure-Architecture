/**
 * @author 李国栋
 * @create 2020-12-02 10:05 上午
 */
public class InsertionSort {

    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort (E [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j-1 >= 0 && arr[j].compareTo(arr[j-1])<0 ;j--) {
                swap(arr,j,j-1);
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
//        Integer [] arr = {1,4,2,3,6,5};
//
//        InsertionSort.sort(arr);
//        for (int i : arr) {
//            System.out.print(i+"  ");
//        }
//        System.out.println("\n");
//
//        Student [] stu = {
//                new Student("jack",76),
//                new Student("jerry",4),
//                new Student("moniya",18),
//                new Student("coff",16),
//
//        };
//
//        InsertionSort.sort(stu);
//        for (Student student : stu) {
//            System.out.println(student);
//        }
        int [] arr = {10000,100000,1000000,10000000,100000000,1000000000};

        for (int i = 0; i < arr.length; i++) {
            Integer [] ar = ArrayGenerator.generateOrderedArray(arr[i]);
            SortingHelper.sortTest("InsertionSort",ar);
        }




    }


}