package org.redhillgroup.learn.access.modifiers;



public class TestB {

    public static void main(String[] args[]){

        //TestB is in the same package with TestA so it is able to access the class members, only private members
        //are not accessible.
        TestA.methodPublic();
        TestA.methodProtected();
        TestA.methodDefault();

    }

    public static void methodPublic(){

    }

    protected static void methodProtected(){

    }

    static void methodDefault(){

    }

    private static void methodPrivate(){}


}

