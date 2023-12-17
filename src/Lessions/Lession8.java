package Lessions;

import java.util.Scanner;

public class Lession8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        text = text.toLowerCase();
        System.out.println("Введите ключ");
        int key =in.nextInt();
        String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String newtext = "";
        int value;
        for(int i = 0; i<text.length();i++){
            value = alfavit.indexOf(text.charAt(i));
            newtext=newtext+alfavit.charAt(value+key);
        }
        System.out.println(newtext);
    }
}
