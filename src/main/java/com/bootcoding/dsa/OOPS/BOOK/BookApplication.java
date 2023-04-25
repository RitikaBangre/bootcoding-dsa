package com.bootcoding.dsa.OOPS.BOOK;

public class BookApplication {
    public static void main(String[]args){
        Author author = new Author();
        author.name = "Bootcoding";
        author.education = "BE CSE";
        author.phoneNo = 7524756903l;
        Book book = new Book();
        book.title ="Game of throns";
        book.price = 250.00;
        book.publisher = "Javed Publications";
        book.author= author;
        System.out.println("Book title: "+book.title);
        System.out.println("Book author: "+book.author);
        System.out.println("Book publisher: "+book.publisher);
        System.out.println("Book price: "+book.price);
        System.out.println("Book author's name: "+author.name);
        System.out.println("Author's education: "+author.education);
        System.out.println("Author's phone no: "+author.phoneNo);
    }

}
