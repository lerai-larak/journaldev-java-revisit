package org.redhillgroup.learn.fundamental;

public class StringImmutability {

    //Java strings are immutable and a string pool is used to store (in heap memory) the references
    //It saves a lot of space
    public boolean isSameObject(String obj1, String obj2) {
        return obj1 == obj2;
    }
}
