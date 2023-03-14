public class Main {
    public static void main(String[] args) {
        //Здесь я показываю метод equals между авторами
        Author theFirstAuthor = new Author("Лев", "Толстой");
        Author theSecondAuthor = new Author("Лев", "Булгаков");
        System.out.println(theFirstAuthor.equals(theSecondAuthor));
        //Здесь метод equals между книгами
        Book theFirstBook = new Book("Война и мир", theFirstAuthor, 1880);
        Book theSecondBook = new Book("Война и мир", theFirstAuthor, 1880);
        System.out.println(theFirstBook.equals(theSecondBook));
        //Ниже метод hashCode
        System.out.println(theFirstAuthor.hashCode());
        System.out.println(theSecondAuthor.hashCode());
        System.out.println(theFirstBook.hashCode());
        System.out.println(theSecondBook.hashCode());
        //Ниже метод toString
        System.out.println(new Book("Война и мир", theFirstAuthor, 1880));
        System.out.println(new Book("Мастер и Маргарита", theSecondAuthor, 1960));


//        System.out.println(new Book("Сказки", theThirdAuthor, 1881));
//        Author theThirdAuthor = new Author("Александр", "Александр");
//        Author a4 = theThirdAuthor;
//        System.out.println(theThirdAuthor.equals(a4));
//        System.out.println();
//        System.out.print(theFirstBook.getNameBook());
//        System.out.print(" " + theFirstBook.getNameAuthor().getTheFirstNameAuthor());
//        System.out.print(" " + theFirstBook.getNameAuthor().getTheSecondNameAuthor());
//        System.out.print(" " + theFirstBook.getPublishingYear());
//        theFirstBook.setPublishingYear(1885);
//        System.out.println();
//        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
//        System.out.print(theSecondBook.getNameBook());
//        System.out.print(" " + theSecondBook.getNameAuthor().getTheFirstNameAuthor());
//        System.out.print(" " + theSecondBook.getNameAuthor().getTheSecondNameAuthor());
//        System.out.print(" " + theSecondBook.getPublishingYear());
    }
}