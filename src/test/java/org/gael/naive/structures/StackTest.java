package org.gael.naive.structures;

import org.junit.Test;

public class StackTest {
    /*
     cases: pop from empty
     push to empty
     size after shuffled operations
     right order

     */
    @Test
    public void test1() throws Exception {
        Stack<String> strings = new Stack<String>();

        strings.push("1");
        strings.push("2");
        strings.print();
        String popedElement = strings.pop();
        System.out.println(popedElement);
        strings.push("3");
        strings.print();
    }

}
