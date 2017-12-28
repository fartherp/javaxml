/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.javaxml;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/28
 */
public class DocumentTest {
    @Test
    public void testGetFormattedContent() throws Exception {
        Document document = getDocument();
        String str = document.getFormattedContent(1);
        assertEquals(str, "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >\r\n<mapper namespace=\"com.github.codegenerator.Mapper\" />");
    }

    public static Document getDocument() {
        Document document = new Document("-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
        XmlElement answer = new XmlElement("mapper");
        String namespace = "com.github.codegenerator.Mapper";
        answer.addAttribute(new Attribute("namespace", namespace));
        document.setRootElement(answer);
        return document;
    }

}