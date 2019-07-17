package org.redhillgroup.learn.access.modifiers.child;

import org.redhillgroup.learn.access.modifiers.TestB;

public class TestC {

    public static void main(String[] args) {
        //Can only access public method in TestB because it's in a different package and is not a subclass of TestB.
        TestB.methodPublic();
    }

}

