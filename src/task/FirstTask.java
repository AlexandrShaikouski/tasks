package task;

import java.util.Scanner;

public class FirstTask {
    private static Scanner scanner = new Scanner(System.in);
    private static FirstTask ft = new FirstTask();
    private static double cathetusFirst, cathetusSecond;
    private static final int[] A = new int[]{4,5,2,3,22,11,55,33,677,44,33,22};
    private static final int K = 5;
    private static String str = " Mad worLd ";
    private static double[] d1 = {3.2, 5.21, 6.7, 2.32, 22.4, 88.21, 33.2};
    private static double[] d2 = {3.2, 5.21, 6.7, 22.4, 88.21};

    public static void main(String[] args) {
        System.out.println("Hello World\n");                                                           // 1 clause

        System.out.println("Alexandr Shaikouski\n" +                           // 2 clause
                           "102 Kazinca Str.\n" +                       // 2 clause
                           "+375-25-618-24-21\n");                                            // 2 clause

        System.out.println("Enter size cathetus ");                                               // 3 clause
        System.out.print("First cathetus equels: ");                                                      // 3 clause
        cathetusFirst = scanner.nextDouble();                                                          // 3 clause
        System.out.print("Second cathetus equels ");                                                      // 3 clause
        cathetusSecond = scanner.nextDouble();                                                         // 3 clause
        System.out.println();                                                                          // 3 clause

        System.out.println("Hypotenuse equels " + ft.getHypotenuse(cathetusFirst, cathetusSecond));     // 3 clause
        System.out.println("Square equels     " + ft.getSquare(cathetusFirst, cathetusSecond));         // 3 clause
        System.out.println();

        System.out.println("Sum of natural numbers " + K + " equels " + ft.getSummMultiples());// 4 clause
        System.out.println();

        ft.showFiveMethodOfString(str);                                                                // 5 clause
        System.out.println();

        ft.monotoneSequence(d1);                                                                       // 6 clause
        ft.monotoneSequence(d2);                                                                       // 6 clause

    }

    public double getHypotenuse(double cathetusFirst, double cathetusSecond){
        double hypotenuse = Math.sqrt(Math.pow(cathetusFirst,2) + Math.pow(cathetusSecond,2));
        return hypotenuse;
    }                      // 3 clause
    public double getSquare(double cathetusFirst, double cathetusSecond){
        double square = cathetusFirst * cathetusSecond / 2;
        return square;
    }                          // 3 clause

    public int getSummMultiples(){
        int summMultiples = 0;
        for(int value : A){
            if(value%K == 0){
                summMultiples += value;
            }
        }
        return summMultiples;
    }                                                                 // 4 clause

    public void showFiveMethodOfString(String str){
        System.out.println(str.toUpperCase());

        if(str.endsWith("Ld ")){
            System.out.println(str);
        }else{
            System.out.println("Wrong");
        }
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        String [] strings = str.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
    }                                                // 5 clause

    public void monotoneSequence(double[] arr){
        int numberIncrease = 0;
        int numberDecrease = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                numberDecrease++;
                System.out.println("Sequence is not increasing");
                break;
            }else if(arr[i] < arr[i+1]){
                numberIncrease++;
            }else continue;
            if(numberDecrease == numberIncrease && numberDecrease != 0){
                System.out.println("Sequence is not increasing");
                break;
            }
            if(i == arr.length - 2){
                System.out.println("Sequence is  increasing");
            }
        }
    }                                                    // 6 clause
}
