import java.util.Scanner;

class MainT {

    public static void main(String[] args) {
        int[] valuesArr = new int[]{18, 62, 68, 82, 65, 9};
        //常规遍历
        for (int i = 0; i < valuesArr.length; i++) {
            int each = valuesArr[i];
            System.out.println(each);
        }



        //增强型for循环遍历
        for (int each : valuesArr) {
            System.out.println(each);
        }

    }
//
//    public static void main(String[] args) {
////
////        Scanner s = new Scanner(System.in);
////        String str = s.next();
////        System.out.println(str);
//        int[] a;
//
//        a = new int[5];
//
//        a[0] = 1;
//        a[1] = 1;
//        a[2] = 1;
//        a[3] = 1;
//        System.out.println(a[4]);
//
//
//
//    }
}
