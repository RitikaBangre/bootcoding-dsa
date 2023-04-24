package com.bootcoding.dsa.string;

public class StringEx7StringBuilder {
    public static void main(String[]args){
        String s ="rollno"+","+"CSE"+","+"M1"+","+"M2"+","+"M3"+",";
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        sb.append("rollno");
        sb.append(",");
        sb.append("CSE");
        sb.append(",");
        sb.append("M1");
        sb.append(",");
        sb.append("M2");
        sb.append(",");
        sb.append("M3");
        sb.append(",");
System.out.println(sb);
    }
}
