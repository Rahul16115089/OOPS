package Oops.DesignPattern.ObserverPattern.Observable;

import Oops.DesignPattern.ObserverPattern.Observer.Observer;

import java.util.List;

public class Stock implements Observable {

    private Integer volume;

    private String name;

    private Integer price;

    private List<Observer> observers;

    public Stock(String name, List<Observer> observers){
        this.name = name;
        this.observers = observers;
    }

    @Override
    public void subscribeObserver(Observer o) {
        for (Observer observer: observers) {
            if(observer.equals(o))return;
        }
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index > -1)observers.remove(index);
    }

    @Override
    public void notifyObservers(Integer uVolume, Integer uPrice) {
        this.volume = uVolume;
        this.price = uPrice;
        for (Observer observer: observers) {
            observer.update(this.volume,this.name,this.price);
        }
    }


}
