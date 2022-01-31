package com.mp.sample.ftl;

import com.mp.sample.ftl.directive.UpperDirective;
import com.mp.sample.ftl.directive.repeat.RepeatDirective;
import com.mp.sample.ftl.method.IndexOfMethod;
import com.mp.sample.ftl.method.Product;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @Auther d
 * @Date 2022/1/29 1:41
 * @Describe 测试Freemarker
 *           数据模型: {@code root}
 *
 **/
public class FreemarkerDemo {
    public static void main(String[] args) throws IOException, TemplateException {
        final Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
//      cfg.setDirectoryForTemplateLoading(new File("D:/workspace/quickBuilder/mybatisPlusLearn/mybatis-plus-sample-generator/src/test/resources/templates"));
        cfg.setDefaultEncoding("UTF-8");
        //设置错误的如何表现
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);//
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        cfg.setFallbackOnNullLoopVariable(false);
        cfg.setTemplateLoader(new MyTemplateLoader(new URL("https://gist.githubusercontent.com/yangguanghaitan/a886221bfab4b54434d9d294af9e950a/raw/d68d4c3c1471046e26aefa89239faf4d64771628/test_zh_CN.ftlh")));

        //数据模型
        Map<String, Object> root = new HashMap<>();
        root.put("user", "Big Joe");
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
        root.put("latestProduct", latest);
        //添加数据
        root.put("indexOfOf", new IndexOfMethod());
        //添加指令
        root.put("upper", new UpperDirective());
        root.put("repeat",new RepeatDirective());
        //模板
        Template temp = cfg.getTemplate("test.ftlh");
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);
    }
}
