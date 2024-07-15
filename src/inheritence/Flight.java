package inheritence;

public class Flight {
     int seats;
     int passengers;


    Flight() {
        passengers=10;
        System.out.println("Parent class constutor called");
    }

    Flight(int seats, int passengers) {
        this.seats = seats;
        this.passengers = passengers;
    }

    //setter & getters



}
