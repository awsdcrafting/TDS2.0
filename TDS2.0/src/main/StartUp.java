package main;

import java.io.InputStream;

public class StartUp
{
    private static final StartUp SINGLETON = new StartUp();
    
    private StartUp()
    {}
    
    public static void main(String[] args)
    {
        preInit(args);
        
        init();
        
        postInit();
        
        exit();
    }
    
    /**
     * creates the objects
     * 
     * @param args
     */
    private static void preInit(String[] args)
    {   
        
    }
    
    /**
     * initializes the objects
     */
    private static void init()
    {   
        
    }
    
    /**
     * prepares the game for user interaction
     */
    private static void postInit()
    {   
        
    }
    
    private static void exit()
    {
        
        System.exit(0);
    }
    
    public static InputStream getResource(String resource)
    {
        return SINGLETON.getClass().getResourceAsStream(resource);
    }
}
