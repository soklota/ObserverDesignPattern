//Author Sydney Oklota
import java.util.ArrayList;

public class Golfer implements Subject {

private ArrayList<Observer> observers;
private String name = " ";

/**
 * creates arraylist and assigns name to golfer
 * @param golfer golfer
 */
public Golfer(String golfer){
    observers = new ArrayList<Observer>();
    this.name = golfer;
}

/**
 * registers observer, adding them to the array list
 * @param observer array list of observers
 */
public void registerObserver(Observer observer){
    observers.add(observer);
}

/**
 * removes observer from the array list
 * @param observer array list of observers
 */
public void removeObserver(Observer observer){
    observers.remove(observer);
}

/**
 * creates a loop and updates arraylist with strokes and par
 * @param strokes number of strokes
 * @param par number of pars
 */
public void notifyObservers(int strokes, int par){
    for(Observer observer : observers) {
        observer.update(strokes, par);
    }
}

/**
 * calls notifyobservers
 * @param strokes number of strokes
 * @param par number of pars
 */
public void enterScore(int strokes, int par){
    notifyObservers(strokes, par);
}

/**
 * name of golfer
 * @return name of golfer
 */
public String getName(){

   return this.name;
}





}
