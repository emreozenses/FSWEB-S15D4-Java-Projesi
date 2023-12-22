package com.workintech.cdecimaltobinary;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(decimalToBinary(6));

    }


    public static String decimalToBinary(Integer num){

        Stack<Integer> stack = new Stack<Integer>();
        String text="";

        for(int i=0;(num/2)>0;i++){

            if (num%2 == 0){
                stack.push(0);
            }
            else{
                stack.push(1);
            }
            num = num/2;
            if (num==1){
                stack.push(1);
            }

        }

        while(!stack.isEmpty()){
            Integer ch = stack.pop();
            text += ch;
         }


        return text;

    }
}
