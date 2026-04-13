package de.htw.berlin.Matchlog;

public class EntityClass {
    
    String title;
    String location;
    double ticketprice;

    public EntityClass(String title, String location, double ticketprice) {
        this.title = title;
        this.location = location;
        this.ticketprice = ticketprice;
    }

    public EntityClass(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(double ticketprice) {
        this.ticketprice = ticketprice;
    }
    
}
