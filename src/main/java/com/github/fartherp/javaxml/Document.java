/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.javaxml;

import com.github.fartherp.javaxml.utils.OutputUtil;

/**
 * 文档信息
 * Author: CK.
 * Date: 2015/6/6.
 */
public class Document implements Element {

    protected String name;

    /** 公共属性：-//mybatis.org//DTD Mapper 3.0//EN */
    private String publicId;

    /** 系统属性：http://mybatis.org/dtd/mybatis-3-mapper.dtd */
    private String systemId;

    /** XML根目录元素：mapper/configuration */
    private XmlElement rootElement;

    /** 所属模块 **/
    private String module;

    public Document(String name) {
        this.name = name;
    }

    public Document(String publicId, String systemId) {
        this.publicId = publicId;
        this.systemId = systemId;
    }

    public String getFormattedContent(int indentLevel) {
        if (rootElement == null) {
            throw new IllegalArgumentException("根元素不能为空");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

        if (publicId != null && systemId != null) {
            OutputUtil.newLine(sb);
            sb.append("<!DOCTYPE ");
            sb.append(rootElement.getName());
            sb.append(" PUBLIC \"");
            sb.append(publicId);
            sb.append("\" \"");
            sb.append(systemId);
            sb.append("\" >");
        }

        OutputUtil.newLine(sb);
        sb.append(rootElement.getFormattedContent(0));
        return sb.toString();
    }

    public void setRootElement(XmlElement rootElement) {
        this.rootElement = rootElement;
    }

    public String getName() {
        return name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
