package com.atsignjar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Number:");
//
//        int num = scanner.nextInt();
//
//        System.out.print("Number:" + num);
//        if(num % 5 == 0 && num % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if(num % 5 == 0)
//            System.out.println("Fizz");
//        else if(num % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(num);

//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while( true /*or use!input.equals("quit"*/){
//            System.out.print("Echo: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("quit"))
//                break;
//
//            if(input.equals("pass"))
//                continue;
//            System.out.println(input);
//
//        }
//
////        do{
////            System.out.print("Input: ");
////            input = scanner.next().toLowerCase();
////            System.out.println(input);
////        }while(!input.equals("quit"));
//
//    }

        String[] fruits = {"Apple ™ ® © ɔ ","Mangone","Bananiel"};

        for (String fruit:fruits) {
                //for each
            System.out.println(fruit);
        }
        
    }
}