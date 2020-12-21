/**
 * @author 李国栋
 * @create 2020-11-11 9:46 上午
 */
public class LinearSearch {

    private LinearSearch(){}

    public static <E> int search (E [] data,E target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer [] arr={1,23,45,4,29,5,28,38,43,4,64,64,69,46,4};
        int index=LinearSearch.search(arr,5);
        System.out.println(index);
    }
}
