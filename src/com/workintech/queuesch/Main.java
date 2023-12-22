package com.workintech.queuesch;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Main {



    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }
        public static boolean checkForPalindrome(String text) {
            System.out.println("initial text:" + text);
            text = text.replaceAll("[.,'?\\-\\s]","").toLowerCase(Locale.ENGLISH);

            Stack<Character> stackOriginal = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            char[] chars = text.toCharArray();
            for(char c: chars){
                stackOriginal.push(c);
                queue.add(c);
            }
            System.out.println(stackOriginal);
            System.out.println(queue);

            while(!queue.isEmpty()){
                Character character = queue.remove();
                System.out.println("removedItem: "+character);
                if(character != stackOriginal.pop()){
                    return false;
                }
            }

            return true;
        }

    }

