package HomeWorkObjectsСlasses;

import HomeWorkObjectsСlasses.Book;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author ("Брюс", "Эккель");
        Book philosophyJava = new Book("Философия Java", 2015, author1);

        System.out.println("Автор - " + author1.getAuthorName() + " " + author1.getAuthorFamily());
        System.out.println("Название - " + philosophyJava.getBookName());
        System.out.println("Год публикации - " + philosophyJava.getPublishingYear());

        Author author2 = new Author ("Герберт", "Шилдт");
        Book javaCompleteGuide = new Book("Java. Полное руководство", 2022, author2);

        System.out.println("Автор - " + author2.getAuthorName() + " " + author2.getAuthorFamily());
        System.out.println("Название - " + javaCompleteGuide.getBookName());
        System.out.println("Год публикации - " + javaCompleteGuide.getPublishingYear());
        javaCompleteGuide.setPublishingYear(2012);

        System.out.println("Год публикации - " + javaCompleteGuide.getPublishingYear());

    }
}
