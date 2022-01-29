package com.mp.sample.ftl.directive;

import java.io.IOException;
import java.io.Writer;

/**
 * @Auther d
 * @Date 2022/1/30 2:54
 * @Describe
 **/
public class UpperCaseFilterWriter extends Writer {

    private final Writer out;

    UpperCaseFilterWriter (Writer out) {
        this.out = out;
    }

    public void write(char[] cbuf, int off, int len)
            throws IOException {
        char[] transformedCbuf = new char[len];
        for (int i = 0; i < len; i++) {
            transformedCbuf[i] = Character.toUpperCase(cbuf[i + off]);
        }
        out.write(transformedCbuf);
    }

    public void flush() throws IOException {
        out.flush();
    }

    public void close() throws IOException {
        out.close();
    }
}


