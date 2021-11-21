public class Books{
    String author;
    String title;
    int numberOfPages;
    int yearOfRelease;
    String genre;
    Books(String author,String title,int numberOfPages,int yearOfRelease,String genre){
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        
    }
    void displayInfo(){
        if ((genre == "science fiction") || (genre =="fantasy")|| (genre == "drama") || (genre == "crime")){
            System.out.println("Author: " + this.author + "\n" + "Title: " + this.title + "\n" +
            "Number of pages: " + this.numberOfPages + "\n" + "Year of release: " + this.yearOfRelease + "\n" +  "Genre: "+ this.genre);
        }
        else{
            System.out.println( "Genre is invalid!");
        }
    }
    public static void main(String[] args){
        Books b1 = new Books("Jim Halpert","The Office",234,2005,"crime");
        b1.displayInfo();
        
        Books b2 = new Books("Jim Hompert","The Office 2",234,2002,"adventure");
        b2.displayInfo();
    }
}
