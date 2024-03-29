//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // task 1
        System.out.print("a= ");
        int a= scanner.nextInt();
        System.out.print("b= ");
        int b= scanner.nextInt();
        if (a==b){
            System.out.println("a=b");
        } else {
            if (a>b){
                System.out.println("a>b");
            } else {System.out.println("a<b");}
        }
        int sum= a+b;
        int minus= a-b;
        int multiply=a*b;
        float decrease =a/b;
        System.out.println("a+b=" +sum);
        System.out.println("a-b="+ minus);
        System.out.println("a*b="+ multiply);
        System.out.println("a/b="+ decrease);
        //task 2
        System.out.print("Введите строку 1 ");
        String str1= scanner.next();
        System.out.print("Введите строку 2 ");
        String str2= scanner.next();
        if (str1.equals(str2)){
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки НЕидентичны");
        }
        //task 3
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Четные числа");
        for (int i=0; i<9; i++){
            if (arr[i]%2==0){System.out.println(arr[i]);}
        }
    }
}