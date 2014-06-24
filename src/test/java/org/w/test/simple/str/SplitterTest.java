package org.w.test.simple.str;

import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * @version 1.5
 *          Created by wenzhouyang on 6/24/2014.
 */
public class SplitterTest {
    String str = "foRo--- G qussse";

    @Test
    public void test1() throws Exception {
        Splitter splitter = Splitter.on("-");
        System.out.println(splitter.split(str));

    }
}
