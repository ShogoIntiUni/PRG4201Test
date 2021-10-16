/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4201test;

/**
 *
 * @author minamotonoshougo
 */
public class ThreadTwo extends Thread {
    
     Pulse pulse=new Pulse();
    public ThreadTwo(Pulse p)
    {
        pulse=p;
        
    }
    
    public void run()
    {
        try
        {
             
            pulse.two();
              
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
     
    }
