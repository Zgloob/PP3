public class Ebook extends Book{
    private String fileName;
    
    Ebook(String title, String author, String fileName, Publisher publisher,int publishYear, Writer writer){
        super(title,author,publisher,publishYear,writer);
        this.fileName = fileName;
        
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public void display(){
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("File Name: " + this.fileName);
    System.out.println("Publisher: " + this.publisher.getName() + this.publisher.getCity());
    System.out.println("Year of publication: " + getPublishYear());
    System.out.println("Writer: " + this.writer.getWriterName() + " " + this.writer.getWriterLastName());
    System.out.println("Writer's favourite genre: " + this.writer.getGenre());
    }
    
    public static void main(String args[]) {
        Book b3 = new Book("Ksiega","Jack Johnes",new Publisher("NBC","Scranton"), 2005,new Writer("Jakub","Żulczyk", "crime"));
        Ebook e1 = new Ebook("Office", "Michael Scott","office.pdf", new Publisher("NBC","Scranton"),2005,new Writer("Jakub","Żulczyk", "crime"));
        Ebook e2 = new Ebook("Office 2", "Jim Halpert","office2.pdf", new Publisher("NBC","Scranton"),2006,new Writer("Jakub","Żulczyk", "crime"));
    }
}
