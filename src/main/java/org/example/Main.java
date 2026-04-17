package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("Hello World");
            findStringLength();
            reverseStringLength();
        }

        public  static void findStringLength(){
         String s = "Bharath";
         int length = s.length();
         System.out.println("The length of the string : "+length);
        }

    public  static void reverseStringLength(){
        String s = "Bharath";
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }
    }

}