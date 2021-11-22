public class Book{
    private String title;
    private int numberOfPages;
    private String genre;
    private Writer author;
    
    
    public void Book(String title, int numberOfPages, String genre, Writer author){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
    }
    
    public String toString(){
        return"Author: " + this.author + "\nTitle: " + this.title + "\nGenre: " + this.genre + "\nNumber of pages: " + this.numberOfPages;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public static void main(){
        Writer w1 = new Writer();
        Book b1 = new Book();
        
        System.out.println(b1);
    }
}
