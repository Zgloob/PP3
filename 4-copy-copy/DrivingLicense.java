
/**
 4.5
 */
public class DrivingLicense{
    private String driversName;
    private String driversSurname;
    private String adress;
    private int postalCode;
    private String city;
    private int licenseNumber;
    private int yearOfIssue;
    private String category;
    
    DrivingLicense(String driversName,String driversSurname, String adress,int postalCode, String city, int licenseNumber,int yearOfIssue, String category ){
        this.driversName = driversName;
        this.driversSurname =  driversSurname;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.licenseNumber = licenseNumber;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    }
    
    void setDriversName(String driversName){
        this.driversName = driversName;}
    
    
    public String getDriversName(){
        return driversName;
    }
    
    
    void setDriversAdress(String adress){
        this.adress = adress;
    }
    
    public String getDriversAdress(){
        return adress;
    }
    
    void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }
    
    public int getPostalCode(){
        return postalCode;
    }
    
    void setCity(String city){
        this.city = city;
    }
    
    public String getCity(){
        return city;
    }
    
    void setLicenseNumber(int licenseNumber){
       this.licenseNumber = licenseNumber;
    }
    
    public int getLicenseNumber(){
        return licenseNumber;
    }
    
    void setYearOfIssue(int yearOfIssue){
        if (yearOfIssue >= 1980 && yearOfIssue <= 2021){
            this.yearOfIssue = yearOfIssue;
        }
        else{
            System.out.println("Error");
        }
    }
    
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    
    void setCategory(String category){
        this.category = category;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void DisplayInfo(){
        System.out.println(); 
    }
    
    public String toString(){
        return  getDriversName() + " " + getDriversAdress() + " " + getPostalCode() + " " + getCity() + " " + getLicenseNumber() + " " + getYearOfIssue() + " " + getCategory();
        
    }
    
    //public static void main(String[] args){
        //DrivingLicense license1 = new DrivingLicense("Mike","Kowalski","Warszawska 36",38500,"Kraków",455466,2007,"B");
        //toString();
        
    //}

        
        
        
    
}
