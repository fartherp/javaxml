/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.javaxml.formatter;

import com.github.fartherp.javaxml.Document;
import org.testng.annotations.Test;

import static com.github.fartherp.javaxml.DocumentTest.getDocument;
import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/28
 */
public class DefaultXmlFormatterTest {
    @Test
    public void testGetFormattedContent() throws Exception {
        XmlFormatter xmlFormatter = new DefaultXmlFormatter();
        String str = xmlFormatter.getFormattedContent(getDocument());
        assertEquals(str, "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >\r\n<mapper namespace=\"com.github.codegenerator.Mapper\" />");
    }

}