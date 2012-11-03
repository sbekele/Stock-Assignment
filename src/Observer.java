/**
 * Author: Jeff Maki
 * This is a basic interface for Observer objects
 */
public interface Observer {
    public void update(Observable observable, String hint);
}
