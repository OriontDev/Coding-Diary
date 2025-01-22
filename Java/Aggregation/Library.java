public class Library{
    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public String displayInfo(){
        return year+" "+name;
    }

    
}