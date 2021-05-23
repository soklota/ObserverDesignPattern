//Author: Sydney Oklota
public interface Subject{

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(int stroke, int par);

}


