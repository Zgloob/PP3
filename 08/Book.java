public class Book{
    private String title;
    private String author;
    protected Publisher publisher;
    private int publishYear;
    protected Writer writer;
    
    Book(String title, String author, Publisher publisher, int publishYear, Writer writer){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.writer = writer;
    }
    
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPublishYear(){
        return this.publishYear;
    }
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }
    
    
    public void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher.getName() + this.publisher.getCity());
        System.out.println("Year of publication: " + this.publishYear);
        System.out.println("Writer: " + this.writer.getWriterName() + " " + this.writer.getWriterLastName());
        System.out.println("Writer's favourite genre: " + this.writer.getGenre());
    }
    
    public static void main(String args[]) {
        Book b1 = new Book("Ślepnąc od świateł","Jakub Żulczyk",new Publisher("Dario","Warszawa"),2019, new Writer("Jakub","Żulczyk", "crime"));
        Book b2 = new Book("Jak mniej myśleć","Christel Petitcollin", new Publisher("Feeria","Kraków"),2020, new Writer("Christel","Petitcollin", "science"));
        
        b1.display();
        b2.display();
    }
}

