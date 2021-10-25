
/**
 * 3.16
 */
public class InternetDevice{
    
    String deviceName;
    boolean connected;
    static int connectedDevices = 0;
    
    public InternetDevice(String deviceName){
        this.deviceName = deviceName;
                    }
    
    public boolean isConnected(){
        return connected;
        
    }
    
    void connect(){
        if(isConnected()) 
        System.out.println("Device is connected");
        else{
            connected = true;
            connectedDevices++;
        }
    }
    
    void disconnect(){
        if(! isConnected())
        System.out.println("Device is disconnected");
        else{
            connected = false;
            connectedDevices--;
        }
    }
    
    void displayStatus(){
        System.out.println(deviceName + "is now: " + (isConnected() ? "connected" : "disconnected"));
    }
    
    static void displayConnections(){
        System.out.println("Currently there are: " + connectedDevices + "connected devices");
        
    }
        }
    
