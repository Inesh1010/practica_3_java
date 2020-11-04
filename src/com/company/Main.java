package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int array[] = {6, 8, 9, 3};
        int result = 0;

        //Сумма циклом for (пункт 3)
        for(int i=0;i<array.length;i++)
            result+=array[i];
        System.out.println(result); */

        //Сумма циклом while (пункт 3)

        int i=0;
        while(i!=4) {
            result += array[i];
            i++;
        }
        System.out.println(result);


        //Сумма циклом do while (пункт 3)
        int i = 0;
        do{
            result+=array[i];
            i++;
        }while(i!=4);
        System.out.println(result);

        //Аргументы командной строки (пункт 4)

        System.out.println("\nConsole arguments: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.print("\n");


        //Вывод гармонического ряда (пункт 5)
        for(int i=1;i<11;i++){
            System.out.println(String.format("%.3f", (1.0/i) ));
        }




        //Random (пункт 6)
        Random ran_gen = new Random();

        int arr_size = ran_gen.nextInt(21) + 5;
        int[] rand_arr = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            rand_arr[i] = 1 + (int)(Math.random() * 100);
        }

        System.out.print("\nINITIAL RANDOM ARRAY: ");

        for (int element : rand_arr) {
            System.out.print(element + " ");
        }

        Arrays.sort(rand_arr);

        System.out.print("\nSORTED RANDOM ARRAY: ");

        for (int element : rand_arr) {
            System.out.print(element + " ");
        }


        //Факториал (пункт 7)
        Scanner myobj = new Scanner(System.in);
        int ch = myobj.nextInt();

        int fact = 1;
        for (int i = 1; i <= ch; i++) {
            fact *= i;
        }
        System.out.println(fact);
        myobj.close();


    }
    //change
}
