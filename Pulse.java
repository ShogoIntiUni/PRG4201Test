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

public class Pulse {
    boolean flag=true;
    static int pulse;
    public synchronized void one() throws InterruptedException
    {
         while(!flag)
         {
               wait();
         }
         Sensor();
         Thread.sleep(1500);
         flag=false;
         notify();  
    }
    
        public synchronized void two() throws InterruptedException
    {
         while(flag)
         {
               wait();
         }
         Signal();
         Thread.sleep(1500);
         flag=false;
         notify();  
    }
    
    public void Sensor()
    {
            pulse=(int)Math.random()*200;
            System.out.println("Current heart rate is : "+pulse);
    }
    
    public void Signal()
    {
        if(pulse>=150)
            System.out.println("Send a signal to slow down heart beating");
        else if(pulse<=70)
            System.out.println("Send a signal to speed up heart beating");
        else
            System.out.println("No signal needed for now");
    }
    
   
}
