public class Writer{
    private String writerName;
    private String writerLastName;
    private String genre;
    
    Writer(String writerName, String writerLastName, String genre){
        this.writerName = writerName;
        this.writerLastName = writerLastName;
        this.genre = genre;
    }
    
    public String getWriterName(){
        return this.writerName;
    }
    public String getWriterLastName(){
        return this.writerLastName;
    }
    public String getGenre(){
        return this.genre;
    }
    
    
    public void setWriterName(String writerName){
        this.writerName = writerName;
    }
    public void setWriterLastName(String writerLastName){
        this.writerLastName = writerLastName;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    
}
