package com.ATB7xPackage;

public class Lab011 {

    public static void main(String[] args) {

        String name = "Mamidi Deepak";

        char ch;

       String reversedName="";

        for(int i=0; i<name.length(); i++){

            ch = name.charAt(i);

            reversedName = ch + reversedName;
        }

        System.out.println("reversedName is : "+reversedName);
    }
}
