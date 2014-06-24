package org.w.test.simple.str;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @version 1.5
 *          Created by wenzhouyang on 6/23/2014.
 */
public class JoinerTest {

    @Test
    public void test4NullString() throws Exception {
        //字符串连接，如果遇到null值，则跳过
        Joiner joiner = Joiner.on(",").skipNulls();
        List<String> list = Lists.newArrayList("1","2", "3", null, "4");
        String str = joiner.join(list);
        System.out.println(str);
        // result 1,2,3,4

        //拼接后放到stringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(joiner.appendTo(stringBuilder, list));
        System.out.println(stringBuilder);
    }

    @Test
    public void test4NotNullString() throws Exception {
        //拼接遇到null时候，使用默认字符串替换
        Joiner joiner = Joiner.on(",").useForNull("default");
        List<String> list = Lists.newArrayList("a", "b", null, "c");
        System.out.println(joiner.join(list));
        //同理拼接后可以放到stringBuilder中
    }

    @Test
    public void testNormal() throws Exception {
        System.out.println(Joiner.on(",").join("a", "b", "c"));
//        System.out.println(Joiner.on(",").join("a", "b", null)); 当为null的时候会抛出异常


    }
}
