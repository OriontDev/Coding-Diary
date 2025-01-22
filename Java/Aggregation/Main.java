public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("The Bible", 1500); 
        Book book2 = new Book("War and Peace", 1200);
        Book book3 = new Book("Romeo and Juliet", 480);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Central City Library", 2010, books);

        System.out.println("The "+library.displayInfo());
        System.out.println("Books available : ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }

        book1.displayInfo();
    }
}