import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //swappingTwoNumbers();
        //checkPrimeOrEven();
        int[] array = {1,2,3,4,4,5,6,6};
        duplicateElements(array);
        for(int n = 1; n <= 42; n++){
            System.out.print(isMultipleOf4(n)?n:" ");
        }
        powerOf2();
    }
    public static void checkPrimeOrEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is odd or even");
        int a = scan.nextInt();
        if((a & 1) == 0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
    }
    public static void swappingTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scan.nextInt();
        System.out.println("Enter number 2");
        int b = scan.nextInt();
        System.out.println("before swapping");
        System.out.println(a+" "+b);
        System.out.println("after swapping");
        a = a ^ b;//stores the output of a ^ b in a
        b = a ^ b;//stores the output of a ^ b in b
        a = a ^ b;//stores the output of final a ^ b in a
        System.out.println(a+" "+ b);
        scan.close();
    }
    public static void duplicateElements(int[] input){
        int i;
        int duplicate = 0;
        for(i = 0; i < input.length;i++){
            duplicate = duplicate ^ input[i] ^ i;
        }
        System.out.print(i);
    }
    public static boolean isMultipleOf4(int n){
        if(n==1)
            return false;
        int check = 0;
        for(int i = 1; i <= n;i++){
            check = check ^ i;
        }
        return (check == n);
    }
    public static void powerOf2(){
        Scanner scan = new Scanner(System.in);
        int power = scan.nextInt();
        if(power>0&&(power&(power-1))==0){
            System.out.println("it is power of 2");
        }
        else{
            System.out.println("it is not power of 2");
        }
    }
    //type casting
    //widening type casting
    static void wideningType(){
        int num = 10;
        System.out.println(num);
        long data = num;
        System.out.println(data);
    }
    //narrow type casting
    static void narrowType(){
        double num = 10;
        System.out.println(num);
        int data = (int) num;
        System.out.println(data);
    }
    //String to int
    static void stringToInt(){
        String data = "10";
        System.out.println(data);
        int num = Integer.parseInt(data);
        System.out.println(num);
    }
    //int to String
    static void intToString(){
        int num = 10;
        System.out.println(num);
        String data = String.valueOf(num);
        System.out.println(data);
    }
    //type conversion


}
