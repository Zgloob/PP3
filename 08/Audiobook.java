public class Audiobook extends Book{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, String author,int minutes, int seconds, Publisher publisher, int publishYear,Writer writer){
        super(title, author, publisher,publishYear,writer);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    public void display(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Audiobook duration: " + this.minutes + ":" + this.seconds);
        System.out.println("Publisher: " + this.publisher.getName() + this.publisher.getCity());
        System.out.println("Year of publication: " + getPublishYear());
    }
    
    public static void main(String args[]) {
        Book b4 = new Book("Family guy","Seth Macfarlane",new Publisher("Fox","Los Angeles"),2012,new Writer("Jakub","Żulczyk", "crime"));
        Audiobook a1 = new Audiobook("Joe","Patrick Warburton",45,53,new Publisher("FOX 21th","New York"),2013,new Writer("Jakub","Żulczyk", "crime"));
        Audiobook a2 = new Audiobook("Clevland","Seth Green",45,53, new Publisher("Fox 21th","Clevland"),2014,new Writer("Jakub","Żulczyk", "crime"));
    }
}
