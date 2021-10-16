/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author minamotonoshougo
 */
public class Connection {
  private static  LogIn login;
  private static Register register;
  private static UserPage userpage;
  private static AdminPage adminpage;
  private static Display display;
  private static Search search;
  private static Delete delete;
    static void LogInRegister(boolean change){
       if(change){
           register=new Register();
           register.setVisible(true);
       } 
       else{
       login=new LogIn();
          login.setVisible(true);}
       
          
    }
    static void BackToLogIn(){
        login=new LogIn();
        login.setVisible(true);
    }
    static void LogInAdminpage(boolean change){
        if(change){
            adminpage=new AdminPage();
            adminpage.setVisible(true);}
        else{
            login=new LogIn();
            login.setVisible(true);
            
        }
    }
    static void LogInUserpage(boolean change){
        if(change){
            userpage=new UserPage();
            userpage.setVisible(true);}
        else{
            login=new LogIn();
            login.setVisible(true);
        }
            
        }
    
    static void AdminDisplay(boolean change){
        if(change){
            display=new Display();
            display.setVisible(true);}
        else{
            adminpage=new AdminPage();
            adminpage.setVisible(true);
        }
        }
    static void AdminSearch(boolean change){
         if(change){
             search=new Search();
             search.setVisible(true);}
         else{
             adminpage=new AdminPage();
             adminpage.setVisible(true);
            }
    }
    static void AdminDelete(boolean change){
            if(change){
                delete=new Delete();
                delete.setVisible(true);}
            else{
                adminpage=new AdminPage();
                adminpage.setVisible(true);
            }
                
            }
    static void DisplaySearch(boolean change){
        if(change){
            search=new Search();
            search.setVisible(true);
        }
        else display=new Display();
        display.setVisible(true);          
    }
    static void DisplayDelete(boolean change){
        if(change){
            delete=new Delete();
            delete.setVisible(true);
        }
        else{
            display=new Display(); 
            display.setVisible(true);
        }
    }
    static void SearchDelete(boolean change){
        if(change){
            delete =new Delete();
            delete.setVisible(true);
        }
        else{
            search=new Search();
            search.setVisible(true);
        }
    }
    }

