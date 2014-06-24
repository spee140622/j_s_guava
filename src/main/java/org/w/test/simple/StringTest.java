package org.w.test.simple;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @version 1.5
 *          Created by wenzhouyang on 6/22/2014.
 */
public class StringTest {

    public void t1() {
        Joiner joiner = Joiner.on(",").skipNulls();
        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add(null);
        list.add("3");
        String s = joiner.join(list);
        System.out.println(s);

        joiner = Joiner.on(",").useForNull("100");
        s = joiner.join(list);
        System.out.println(s);
    }

    public void t2() {
        String s1 = "1,2,3,4,5,6,7,,10,";
        Splitter splitter = Splitter.on(",");
        Iterable<String> s = splitter.split(s1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.t1();
        stringTest.t2();
    }
}
