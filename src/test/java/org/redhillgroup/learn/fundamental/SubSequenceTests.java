package org.redhillgroup.learn.fundamental;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/*
Using Java subSequence method.
 */
public class SubSequenceTests {
    String testString;

    @Before
    public void init() {

        testString = "Budgets are essential and must be followed";
    }

    @Test
    public void subSequenceIsTypeCharSequence() {
        String testString = "Budgets are essential and must be followed!";
        assertThat(testString.subSequence(3, 15), CoreMatchers.<CharSequence>instanceOf(CharSequence.class));
    }

    @Test
    public void subSequnceRetunedMatches() {
        String matchString = "gets are ess";
        assertThat(testString.subSequence(3, 15).toString(), equalTo(matchString));
    }


    //Test that invoking string.subSequence(begin,end) is exactly the same as string.subString(begin,end)
    @Test
    public void methodSubSequenceIsSameAsSubstring() {
        assertThat(testString.subSequence(26, 42).toString(), equalTo(testString.substring(26, 42)));
        System.out.println(testString.subSequence(26, 42).toString());
        System.out.println(testString.substring(26, 42));
    }


}
