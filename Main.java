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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pulse MainPulse=new Pulse();
        ThreadOne one=new ThreadOne(MainPulse);
         ThreadTwo two=new ThreadTwo(MainPulse);
         one.start();
         two.start();
    }
    
}
