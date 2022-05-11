package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       while (true){
           String[] nameArr = {"anh", "Linh", "Thuy Hang", "Ha "};
           System.out.println("nhap ten nguoi can tim hoac quit de thoat : ");
//           System.out.println("quit de thoat");
           Scanner scanner = new Scanner(System.in);
           String input = scanner.nextLine();
           Boolean findByName = false;

           for (int i = 0; i < nameArr.length; i++) {
               if (input.replaceAll("[\\s|\\u00A0]+", "").equalsIgnoreCase(nameArr[i].replaceAll("\\s",""))) {
                   System.out.println("tìm thấy tên bạn : " + input + " " + i);
                   findByName = true;
                   break;
               }
           }
           if (input.equalsIgnoreCase("quit")){
               System.exit(0);
           }
           if (!findByName) {
               System.out.println("khong tim thay " + input);
           }

       }
    }
}
