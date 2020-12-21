import javax.sound.midi.Soundbank;

/**
 * @author 李国栋
 * @create 2020-10-10 4:49 下午
 */
public class LinearSearch_1 {
    public static int search(int[] data,int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

//        int [] arr={1,23,45,4,29,5,28,38,43,4,64,64,69,46,4};
//        int index=LinearSearch_1.search(arr,5);
//        System.out.println(index);

        Student stu1 = new Student("王武",18);
        Student stu2 = new Student("王武",19);
        Student stu3 = new Student("王武",20);
        Student stu4 = new Student("王武",21);
        Student stu5 = new Student("王武",22);

        Student stu = new Student("王武",22);

        Student [] data = {stu1,stu2,stu3,stu4,stu5};

        System.out.println(LinearSearch.search(data,stu));


    }
}
