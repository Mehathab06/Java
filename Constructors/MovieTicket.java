package Constructors;

class Ticket{
    String MovieName;
    int SeatNumber;
    int price;

    Ticket(String name,int num,int rs){
        this.MovieName = name;
        this.SeatNumber = num;
        this.price = rs;
    }

    void display(){
        System.out.println("MovieName: "+ MovieName);
        System.out.println("SeatNumber: "+SeatNumber);
        System.out.println("Price: "+price);
    }
}
public class MovieTicket {
    public static void main(String[] args){
        Ticket t1 = new Ticket("Salaar",24,385);
        t1.display();

    }
}
