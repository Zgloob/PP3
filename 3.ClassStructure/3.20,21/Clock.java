/**3.20,3.21
 */
public class Clock{   
    int hour;
    int minute;
    int alarmMinute;
    int alarmHour;
    
    public Clock(){
        this.hour = 0;
        this.minute = 0;
        
    }
    
    Clock(int hour, int minutes) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    public void setClock(int newHour, int newMinute){
        this.hour = newHour;
        this.minute = newMinute;
    }
    
    public void setAlarm(int alarmHour, int alarmMinute){
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }
    
    public void addOneMinute(){
        this.minute++;
        if (this.minute==60){
            this.minute = 0;
            this.hour++;
            if(this.hour == 24){
                this.hour = 0;
            }
        }
        
    }
    
    void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    
    

     
}
