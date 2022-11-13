package javase;

import java.util.Scanner;

// Kullanıcıdan aldığımız sayıya kadar fibonacci   hesaplayan Java algoritmasını yazalım ?
// Dikkat: metotlarla yapalım.
// Fibonacci: sondan 2 sayının toplamıdır
// 1 1 2 3 5 8 13 21 ...
// Dizi Örneği: Enum- Diziler

public class _26_Fibonacci {
    public static int userScannerData() throws _00_HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = klavye.nextInt();
        if (number < 0)
            throw new _00_HamitMizrakException("Sıfırdan küçük sayı giremezsiniz");
        else if (number == 0 || number == 1)
            return 1;
        return number;
    }
    // 1 1 2 3
    public static long getFibonacci(int number){
        int commonSum=0;
        if(number==1 || number==2)
            return 1;
        else {
            int prevNumberSum=1,nextNumberSum=1;
            for (int i = 2; i <number ; i++) {
                commonSum=prevNumberSum+nextNumberSum;
                prevNumberSum=nextNumberSum;
                nextNumberSum=commonSum;
            }
        }
        return commonSum;
    }


    public static int fibonacciRecursive(int number){
        if(number<2)
            return number;
        else
            return fibonacciRecursive(number-2)+fibonacciRecursive(number-1);
    }


    public static void fibonacciResult() throws _00_HamitMizrakException {
        int number=userScannerData();
        int fibo= fibonacciRecursive(number);
        System.out.println(fibo);
    }

    public static void main(String[] args) throws _00_HamitMizrakException {
        fibonacciResult();
    }
}
