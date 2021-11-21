public class Song{
    private String author;
    private String title;
    private int bpm;
    private String genre;
    
    
    public Song(String author,String title,int bpm,String genre){
        this.author = author;
        this.title = title;
        this.bpm = bpm;
        this.genre = genre;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    
    
    public void setBpm(int bpm){
        this.bpm = bpm;
    }
    public int getBpm(){
        return this.bpm;
    }
    
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
    
    public String displayInfo(){
        return this.author + " - " + this.title + "\n" + this.bpm + "\n" + this.genre;
    }
    
    public static void main(){
        Song s1 = new Song("Avicii","Levels",128,"House");
        Song s2 = new Song("Martin Garrix","Those were the days",105,"Deep House");
        
        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
        s1.getAuthor();
    }
}
