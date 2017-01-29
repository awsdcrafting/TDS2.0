package io.github.craftqq.EventFramework;

public abstract class Event
{
    private int priority;
    
    public Event(int priority)
    {
        this.priority = priority;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public abstract void cancelEvent();
}
