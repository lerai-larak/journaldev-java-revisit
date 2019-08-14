package org.redhillgroup.learn.fundamental;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringImmutabilityTests {
    @Test
    public void stringContentIsEmpty() {
        String s = "redhill";
        s = "";
        assertThat(s.contains(""), is(false));
    }

    @Test
    public void testStringTypeIsImmutable() {
        String one = "String1";
        String two = "String1";

        StringImmutability check = new StringImmutability();
        assertThat(check.isSameObject(one, two), is(true));
    }

}
