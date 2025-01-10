package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.*;

public class IphoneObervableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount=0;
    
    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStock){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount += newStock;
    }

    public int getStockCount(){
        return stockCount;
    }
    
}