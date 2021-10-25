
/**3.14
 */
public class TemperatureConverter{
    int celciusTemp;
    int kelvinTemp;
    int fahrenheitTemp;
    
    public void CelciusToKelvin(int celciusTemp){
        System.out.println(celciusTemp + " degrees Celcius is: " + (celciusTemp + 273.15) + " degrees Kelvin");
    }
    
    public void KelvinToCelcius(int kelvinTemp){
        System.out.println(kelvinTemp + " degrees Kelvin is: " + (kelvinTemp - 273.15) + " degrees Celcius");
        
    }
    
    public void CelciusToFahreinheit(int celciusTemp){
        System.out.println(celciusTemp + " degrees Celcius is: " + ((celciusTemp * 9/5) + 32) + " degrees Fahrenheit");
        
    }
    
    public void FahrenheitToCelcius(int fahrenheitTemp){
        System.out.println(fahrenheitTemp + " degrees Fahrenheit is: " + ((fahrenheitTemp - 32) * 5/9) + " degrees Celcius");
        
    }
    
    public void KelvinToFahrenheit(int kelvinTemp){
        System.out.println(kelvinTemp + " degrees Kelvin is: " + ((kelvinTemp - 273.15) * 9/5 + 32) + " degrees Fahrenheit");
        
    }
    
    public void FahrenheitToKelvin(int fahrenheitTemp){
        System.out.println(fahrenheitTemp + " degrees Fahrenheit is: " + ((kelvinTemp - 32) * 5/9 + 273.15) + " degrees Celcius");
        
    }
}
