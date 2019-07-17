package org.redhillgroup.learn.access.modifiers.child;

import org.redhillgroup.learn.access.modifiers.TestB;

public class TestD extends TestB {

    public static void main(String[] args) {
        TestB.methodPublic();
        //Can access the protected members of class TestB since this is a subclass.
        TestB.methodProtected();
    }

}

