package com.designpatterns.Singleton;

public class Singleton {
    /*
    Creational Design Pattern, i.e. creating objects of a class
    We will create only one/ single instance of the class
    Imp : DB Connection Class, Config Manager Class, Logger Class
    Making the constructor private so new class cant be created;
    to create a new class, we will write a static function
     */

    public static void main(String[] args)
    {
        Logger logger1=Logger.getLogger();
        logger1.log("1");
        Logger logger2=Logger.getLogger();
        logger2.log("2");
    }
}

class Logger{
    private static int ctr=0;
    private static Logger loggerInstance=null;
        private Logger(){
        ctr++;
        System.out.println("no of instances: "+ctr);
    }

    public static Logger getLogger(){

        if(loggerInstance==null)
        {
            synchronized (Logger.class) {
                if(loggerInstance==null)
                loggerInstance = new Logger();
            }
        }
        return loggerInstance;
    }

    public void log(String msg)
    {
        System.out.println(msg);
    }
}
