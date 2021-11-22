public class Writer{
    private String name;
    private String surname;
    private int age;
    private String preferedGenre;
    
    
    public void Writer(String name, String surname, int age, String preferedGenre){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.preferedGenre = preferedGenre;
    }
    
    
    
    public String toString(){
        return "Writer: " + this.name + " " +  this.surname;
        
    }
    

}
