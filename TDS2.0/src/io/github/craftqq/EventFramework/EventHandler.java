package io.github.craftqq.EventFramework;

public abstract class EventHandler
{
    private int priority;
    
    public EventHandler(int priority)
    {
        this.priority = priority;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public abstract boolean handleEvent(Event e);
}
