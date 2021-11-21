public class ComputerFile{
    private String fileType;
    private int size;
    private String location;
    private String name;
    
    public String displayInfo(){
        return this.fileType + "\n" + this.size + "\n" + this.location + "\n" + this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
}
