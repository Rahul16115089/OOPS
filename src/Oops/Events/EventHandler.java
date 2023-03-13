package Oops.Events;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EventHandler {

    private Map<String,Map<String, List>> M;
    private Map<String, Queue> eventMap;

    public void addEvent(String eventName,Object action,String place){
        Map<String,List> eventMap = M.get(place);
        List Q = eventMap.get(eventName);
        Q.add(action);
    }

    public void removeEvent(String eventName,String place){
        Map<String,List> eventMap = M.get(place);
        if(eventMap.containsKey(eventName)){
            eventMap.remove(eventName);
        }
    }

    public void emitEvent(String eventName,String place){
        Map<String,List> eventMap = M.get(place);
        if (eventMap.containsKey(eventName)){
            List<Event> Q = eventMap.get(eventName);
            for(Event event : Q){
                event.action(eventName,place);
            }
        }
    }

}



