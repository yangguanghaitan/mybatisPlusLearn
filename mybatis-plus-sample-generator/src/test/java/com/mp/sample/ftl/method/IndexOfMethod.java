package com.mp.sample.ftl.method;

import freemarker.template.SimpleNumber;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

import java.util.List;

/**
 * @Auther d
 * @Date 2022/1/30 2:32
 * @Describe 自定义方法在模板中使用
 **/
public class IndexOfMethod implements TemplateMethodModel {

    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() != 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        return new SimpleNumber(
                ((String) args.get(1)).indexOf((String) args.get(0)));
    }
}
