import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jeff Maki
 * Implements Observer, Observable
 */
public class EventManager implements Observer, Observable {
    private List myObservers;

    public EventManager() {

    }

    public void addObserver(Object object) {
        if (this.myObservers == null) {
            List<Observer> this.myObservers = new ArrayList<Observer>();
        }
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

    public void update(Observable observable, String hint) {

    };

}
