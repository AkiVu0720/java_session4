package rikkei.academy;

import java.util.Scanner;

public class Bai_Tap_1 {

    public static final int MIN = -100 ;
    public static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua mang: ");
        int arrLength = Integer.parseInt(scanner.nextLine());
        int arry[] = array(arrLength);
        printArray(arry);
        arry = arrayDelete(arry,scanner);
        printArray(arry);
    }
    public  static  int[] array(int lenghtArray){
        int[] array = new int[lenghtArray];
        for (int i = 0; i < lenghtArray; i++) {
            array[i] =MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return  array;
    }
    public static void printArray (int arr[]){
        System.out.println("Cac phan tu trong mang: ");
        for (int number : arr ) {
            System.out.print(number +" ");
        }
        System.out.println("\n");
    }
    public static boolean isNumber(int arr [],int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                return true;
            }
        }
        return  false;
    }
    public static  int[] arrayDelete (int arr [],Scanner scanner){
        int [] newArray = new int[arr.length -1 ];
        System.out.print("Nhap so muon xoa: ");
        int numberDel = Integer.parseInt(scanner.nextLine());

        if (isNumber(arr,numberDel)){
            for (int i = 0, j =0; i < newArray.length; i++,j++) {
                if (arr[j] == numberDel){
                    j++;
                }
                newArray[i] = arr[j];
            }
            arr = newArray;
        }else {
            System.out.println("So can xoa khong co trong mang");
        }

        return arr;
    }
}
