/**
 * Author: Jeff Maki
 * This is a basic interface for Observable objects
 */
public interface Observable {
    public void addObserver(Object object);
    public void removeObserver(Object object);
    public void notifyObservers(String hint);
}
