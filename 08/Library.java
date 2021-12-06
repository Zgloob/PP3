import java.util.ArrayList;

public class Library{
    private ArrayList<Book> objects = new ArrayList<Book>();
    
    public static void main(){
        Book b1 = new Book("Ślepnąc od świateł","Jakub Żulczyk",new Publisher("NBC","Scranton"),2005);
        Ebook e1 = new Ebook("Office", "Michael Scott","office.pdf",new Publisher("NBC","Scranton"),2006);
        Ebook e2 = new Ebook("Office 2", "Jim Halpert","office2.pdf",new Publisher("NBC","Scranton"),2007);
        Audiobook a1 = new Audiobook("Joe","Patrick Warburton",45,53,new Publisher("NBC","Scranton"),2008);
        Audiobook a2 = new Audiobook("Clevland","Seth Green",45,53,new Publisher("NBC","Scranton"),2009);
        
        Library l1 = new Library();
        l1.objects.add(b1);
        l1.objects.add(e1);
        l1.objects.add(e2);
        l1.objects.add(a1);
        l1.objects.add(a2);
        
        for(Book b: l1.objects){
            b.display();
        }
    }
    
}
