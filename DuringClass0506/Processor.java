public class Processor
{
   private String model;
   private String manufacturer;
   private int yearOfProduction;
   private int numberOfCores;
   private boolean isOn;
   
   public void Processor(String model, String manufacturer, int yearOfProduction,
   int numberOfCores, boolean isOn){
       this.model = model;
       this.manufacturer = manufacturer;
       this.yearOfProduction = yearOfProduction;
       this.numberOfCores = numberOfCores;
       this.isOn = isOn;
   }
}
