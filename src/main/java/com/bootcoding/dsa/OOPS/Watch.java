package com.bootcoding.dsa.OOPS;


    public class Watch {
        double price;
        String color;
        String brand;
        String shape;
        String type;

        //class doen't hold value or memory
        //watch color=black;
        public void isWorking() {
            System.out.println("No.cell lekar aaoo!");
        }

        public void changeTime() {
            System.out.println("Changed Time of Watch!....");
        }

        public static void main(String[] args) {
            Watch w1 = new Watch();
            Watch w2 = new Watch();
            w1.color = "Black";
            w1.price = 1200;
            w1.brand = "Fastrack";
            w1.shape = "Square";
            w1.type = "Wrist";


            w2.color = "White";
            w2.price = 12000;
            w2.brand = "Rolex";
            w2.shape = "Circle";
            w2.type = "Wrist";

            System.out.println("w1.color = " + w1.color);
            System.out.println("w1.price = " + w1.price);
            System.out.println("w1.brand = " + w1.brand);
            System.out.println("w1.shape = " + w1.shape);
            System.out.println("w1.type = " + w1.type);

            w2.changeTime();
            w2.isWorking();
        }
    }











