/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.javaxml.formatter;

import com.github.fartherp.javaxml.Document;

/**
 * XML文件格式化接口（默认）
 * Author: CK.
 * Date: 2015/6/6.
 */
public class DefaultXmlFormatter implements XmlFormatter {

    public String getFormattedContent(Document document) {
        return document.getFormattedContent(0);
    }
}
