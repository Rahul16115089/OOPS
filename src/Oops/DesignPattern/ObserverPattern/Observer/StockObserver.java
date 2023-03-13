package Oops.DesignPattern.ObserverPattern.Observer;

import Oops.DesignPattern.ObserverPattern.Display.DisplayScreen;
import Oops.DesignPattern.ObserverPattern.Observable.Observable;

public class StockObserver implements Observer, DisplayScreen {

    private String observerName;

    private Integer count;

    private String name;

    private Integer price;

    private Observable observable;

    public StockObserver(String name,Observable observable){
        this.observerName = name;
        this.observable = observable;
        observable.subscribeObserver(this);
    }

    @Override
    public void update(Integer count, String name, Integer price) {
        this.name = name;
        this.count = count;
        this.price = price;
        display();
    }

    @Override
    public void display() {
        System.out.println(observerName+" here are updates on Stock : "+name+" Count : "+count+ " Price "+price);
    }

}
