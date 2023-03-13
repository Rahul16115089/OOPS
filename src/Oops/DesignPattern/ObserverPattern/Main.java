package Oops.DesignPattern.ObserverPattern;

import Oops.DesignPattern.ObserverPattern.Observable.Observable;
import Oops.DesignPattern.ObserverPattern.Observable.Stock;
import Oops.DesignPattern.ObserverPattern.Observer.Observer;
import Oops.DesignPattern.ObserverPattern.Observer.StockObserver;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Observable Tata = new Stock("TATA",new ArrayList<>());
        Observable Icici = new Stock("ICICI",new ArrayList<>());

        Observer A = new StockObserver("Rahul",Tata);
        Tata.notifyObservers(3,4);
        Observer AI = new StockObserver("Rahul",Icici);
        Icici.notifyObservers(8,9);
        Observer B = new StockObserver("Preet",Tata);
        Observer C = new StockObserver("Rohan",Tata);
        Tata.notifyObservers(4,5);
        Observer CI = new StockObserver("Rohan",Icici);
        Icici.notifyObservers(4,6);
        Tata.removeObserver(A);
        Tata.notifyObservers(9,10);
    }

}
