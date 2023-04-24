package com.bootcoding.dsa.OOPS;

public class PrintPaper {

            String color;
            int size;
            int price;
            String Brand;
            public static void main(String[] args){
                PrintPaper p1 = new PrintPaper();
                PrintPaper p2 = new PrintPaper();
                p1.color ="White";
//                p1.size = "A4";
                p1.price = 4;
                p1.Brand = "Classmate";
                System.out.println(p1.color ="White" +p1.color);
                System.out.println(p1.price = 4 +p1.size);
                System.out.println(p1.Brand = "Classmate" +p1.Brand);

                 p2.color ="Green";
                 p2.size = 25*10;
                 p2.price = 2;
                 p2.Brand = "Atlas";
                System.out.println( p2.color ="Green"+p2.color);
                System.out.println(p2.size = 25*10 +p2.size);
                System.out.println(p2.Brand = "Atlas" +p2.Brand);




        }

    }

