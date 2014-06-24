package org.w.test.simple;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @version 1.0
 *          Created by w on 6/22/2014.
 */
public class HelloWorld {

    public void testMap() {
        Map<String, String> hashMap = Maps.newHashMap();
        hashMap.put("hello", "world");
        System.out.println(hashMap.get("hello"));
    }
}
