package com.company;

public class tasks {
    public static void main(String[] args) {
	new B();
    }
}
class A{
    {
        System.out.println("a class no static block");
    }
    static {
        System.out.println("a class static block");
    }
    String text = NoStaticText(";)");
    static String Statictext = StaticText(":)");

    private String NoStaticText (String text){
        System.out.println("a class perem");
        return text;
    }

    private static String StaticText (String text){
        System.out.println("a class static perem");
        return text;
    }

    public A(){
        System.out.println("a class constructor");
    }
}
class B extends A{
    {
        System.out.println("b class no static block");
    }
    static {
        System.out.println("b class static block");
    }
    String text = NoStaticText(";)");
    static String Statictext = StaticText(":)");

    private String NoStaticText (String text){
        System.out.println("b class perem");
        return text;
    }

    private static String StaticText (String text){
        System.out.println("b class static perem");
        return text;
    }

    public B(){
        System.out.println("b class constructor");
    }
}

