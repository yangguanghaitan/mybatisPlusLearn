package com.mp.sample.ftl;

import freemarker.cache.URLTemplateLoader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Auther d
 * @Date 2022/1/31 9:56
 * @Describe
 **/
public class MyTemplateLoader extends URLTemplateLoader {
    private URL root;

    public MyTemplateLoader(URL root) {
        super();
        this.root = root;
    }

    @Override
    protected URL getURL(String template) {
        try {
            URL tu = new URL(root,  "./" + template);
            return tu;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
