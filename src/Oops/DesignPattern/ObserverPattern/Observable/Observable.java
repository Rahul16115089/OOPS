package Oops.DesignPattern.ObserverPattern.Observable;

import Oops.DesignPattern.ObserverPattern.Observer.Observer;

public interface Observable  {

    public void subscribeObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers(Integer uVolume, Integer uPrice);

}
