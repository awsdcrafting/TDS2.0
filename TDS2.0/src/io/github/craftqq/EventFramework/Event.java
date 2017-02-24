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
    
    /**
     * cancels this event
     */
    public abstract void cancel();
    
    /**
     * checks whether or not this event is ready to be handled
     * 
     * @return true if this event is not canceled and can still be handled
     */
    public abstract boolean isready();
}
