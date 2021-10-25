
public class CinemaTicket{
    static String cinemaName = "Helios";
    
    String filmName;
    int row;
    int seat;
    int price;
    
    public void setFilmname(String newName){
        filmName = newName;
    
    }
    
    public void setRow(int newRow){
        row = newRow;
    }
    
    public void setSeat(int newSeat){
        seat = newSeat;
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public void ticketData(){
        System.out.println("Ticket details:" + cinemaName + "\r" + "Film: " 
        + filmName + "\r" + "Row: " + row + "\r" + "Seat: " + seat + "\r" + "Price: " + price);
        
    
    };
    
    
    
}
    
   
