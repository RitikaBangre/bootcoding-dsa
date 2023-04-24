package com.bootcoding.dsa.OOPS;

public class ObjectAsParameter {

    String brand;
    String color;
    double price;
    public void print(){
        System.out.println("Color:"+ color);
        System.out.println("Brand:"+ brand);
        System.out.println("Price:"+ price);
    }
    public ObjectAsParameter(){

    }
    public ObjectAsParameter(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {

        for(int i = 0; i < 500; i++){
            System.out.println(i +1);
            createRemote("White", 95.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Black", 125.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Blue", 115.00);
        }

        ObjectAsParameter r = new ObjectAsParameter("Videocon", "Gray", 55.00);
        ObjectAsParameter.isRemoteBlack(r);
    }

    private static void createRemote(String color, double price) {
        ObjectAsParameter r = new ObjectAsParameter();
        r.color = color;
        r.price = price;
        r.brand = "Samsung";
        r.print();
    }

        public static boolean isRemoteBlack(ObjectAsParameter remote) {
            if (remote.color.equals("Black")) {
                return true;
            }
            return false;
        }
    }
