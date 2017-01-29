package io.github.craftqq.EventFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class EventManager
{
    private PriorityQueue<Event> eventQueue;
    private ArrayList<EventHandler> handlers;
    private static final EventComparator EC_SINGLE = new EventComparator();
    private static final EventHandlerComparator EHC_SINGLE = new EventHandlerComparator();
    
    public EventManager()
    {
        eventQueue = new PriorityQueue<Event>(EC_SINGLE);
        handlers = new ArrayList<EventHandler>();
    }
    
    public boolean queueEvent(Event e)
    {
        if((e != null) && e.isready())
        {
            eventQueue.add(e);
            return true;
        }
        return false;
    }
    
    public boolean cancelEvent(Event e)
    {
        if(e != null && eventQueue.remove(e))
        {
            e.cancel();
            return true;
        }
        return false;
    }
    
    public boolean registerEventHandler(EventHandler e)
    {
        if((e != null) && !handlers.contains(e))
        {
            handlers.add(e);
            Collections.sort(handlers, EHC_SINGLE);
            return true;
        }
        return false;
    }
    
    public boolean removeEventHandler(EventHandler e)
    {
        if(e!=null)
        {
            return handlers.remove(e);
        }
        return false;
    }
    
    public boolean fireEvent(Event e)
    {
        Iterator<EventHandler> it = handlers.iterator();
        boolean eventHandled = false;
        while(it.hasNext()&&e.isready())
        {
            EventHandler handler = it.next();
            if(handler.handleEvent(e)) eventHandled = true;
        }
        return eventHandled;
    }
    
    public void fireQueuedEvents()
    {
        while(!eventQueue.isEmpty())
        {
            Event e = eventQueue.poll();
            fireEvent(e);
        }
    }
}

class EventComparator implements Comparator<Event>
{
    @Override
    public int compare(Event e1, Event e2)
    {
        return e2.getPriority() - e1.getPriority();
    }
}

class EventHandlerComparator implements Comparator<EventHandler>
{
    @Override
    public int compare(EventHandler e1, EventHandler e2)
    {
        return e2.getPriority() - e1.getPriority();
    }
}
