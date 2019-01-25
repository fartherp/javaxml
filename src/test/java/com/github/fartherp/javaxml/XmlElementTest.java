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
public class XmlElementTest {
    @Test
    public void testGetFormattedContent() throws Exception {
        XmlElement xmlElement = new XmlElement("select");
        Attribute attribute = new Attribute("id", "findAll");
        xmlElement.addAttribute(attribute);
        TextElement textElement = new TextElement("select * from table");
        xmlElement.addElement(textElement);
        String str = xmlElement.getFormattedContent(1);
        assertNotNull(str);
    }

}