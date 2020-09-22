package com.company;

public class Main {

    public static void main(String[] args) {
	 String palindrom = "А за работу дадут? - Оба раза! ";
	 palindrom = palindrom.toLowerCase().replaceAll("[^а-я]","");
        System.out.println(palindrom);
        String reversed = "";
        for (int i = palindrom.length()-1; i >= 0 ; i--) {
            reversed += palindrom.charAt(i);
        }
        System.out.println(reversed);
        boolean result = palindrom.equals(reversed);
        System.out.println(result);
    }
}
