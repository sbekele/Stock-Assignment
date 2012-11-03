import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jeff Maki
 * Stock class, implements Observable
 */
public class Stock implements Observable {
    EventManager mediator;
    private List myObservers;
    private String stockSymbol;

    public Stock(String aStockSymbol, DateTime aDateTime, Money aMoney) {
        this.myObservers = new ArrayList <Observer>();

    }

    public void addObserver(Object object) {
        this.myObservers.add(object);
    }

    public void removeObserver(Object object) {
        this.myObservers.remove(object);
    }

    public void notifyObservers(String hint) {
        for (Observer observer : this.myObservers) {
            observer.update(this, hint);
        }
    }

}
