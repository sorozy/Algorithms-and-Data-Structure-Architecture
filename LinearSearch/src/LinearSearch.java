import javax.sound.midi.Soundbank;

/**
 * @author 李国栋
 * @create 2020-10-10 4:49 下午
 */
public class LinearSearch {
    public static int search(int[] data,int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] arr={1,23,45,4,29,5,28,38,43,4,64,64,69,46,4};
        int index=LinearSearch.search(arr,5);
        System.out.println(index);
    }
}
