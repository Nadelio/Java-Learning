//package Main;

// import Main.Main;
// import Main.Main.main;

// import java.util.*; // import all basic util methods for java // EX: Math class
// import java.lang.*; // import all basic lang methods for java // EX: Arrays class
// import java.*.*; // imports all packages, all classes, and all methods in built-in java library

public class Main
{

    // public > grab from anywhere
    // private > only grab from in class or in class' children or parent
    // protected > private + package members
    // none > public

    // static > same across all instances
    // final > cannot be modified during runtime

    private static final int MAINVALUE = 20; // doesn't change at all across instances or during runtime
    private static int mainValue = 0; // instance variable
    private int mainValue1; // different across all instances

    public static enum MANY
    {
        RUN, // 0
        WALK, // 1
        CRAWL, // 2
        NOTMOVING // 3
    }

    public Main(){} // default constructor, NEEDS TO BE SAME NAME AS CLASS

    public Main(int value) // needs to be the same name as class
    {
        this.mainValue1 = value;
    }

    public static void add(int value)
    {
        mainValue += value;
    }

    public static void main(String [] args)
    {
        Main m1 = new Main(1);
        Main m2 = new Main(2);

        System.out.println(Main.mainValue);
        Main.add(m1.getValue()); // mainValue = 1;
        System.out.println(Main.mainValue);
        Main.add(m2.getValue()); // mainValue = 3;
        System.out.println(Main.mainValue);
    }

    public int getValue(){ return mainValue1; }

    // int
    // float
    // long
    // double
    // String
    // Char[] = String
    // Char
    // ArrayList<T>
    // T[]
    // T = any type/placeholder type
    // and more!
    
    // private String s;

    // try{} catch(Exception e){s = e.toString(); //store in crashlog.txt} 
    // System.out.println(s);

    private Main m = null; // can also throw NullPointerException
    private String s = null; // System.out.println(s); -> throw NullPointerException -> no value, can't do shit
}