package com.hz.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-22 15:28
 **/
public class Factory {
    private Map<String, Website> websites = new HashMap<>();


    public Website getWebsite(String key) {
        if (websites.containsKey(key)) {
            return websites.get(key);
        }
        Website website = new ConcreteWebsite();
        websites.put(key, website);
        return website;
    }
}
