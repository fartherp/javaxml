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

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testRootElementNullGetFormattedContent() throws Exception {
		Document document = new Document("-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
		document.getFormattedContent(1);
	}

    @Test
    public void testGetFormattedContent() throws Exception {
        Document document = getDocument();
        String str = document.getFormattedContent(1);
        assertNotNull(str);
    }

	@Test
	public void testNameGetFormattedContent() throws Exception {
		Document document = getNameDocument();
		String str = document.getFormattedContent(1);
		assertNotNull(str);
		assertEquals(document.getName(), "testName");
		assertEquals(document.getModule(), "dao");
	}

    public static Document getDocument() {
        Document document = new Document("-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
        XmlElement answer = new XmlElement("mapper");
        String namespace = "com.github.codegenerator.Mapper";
        answer.addAttribute(new Attribute("namespace", namespace));
        document.setRootElement(answer);
        return document;
    }

	public static Document getNameDocument() {
		Document document = new Document("testName");
		XmlElement answer = new XmlElement("mapper");
		String namespace = "com.github.codegenerator.Mapper";
		answer.addAttribute(new Attribute("namespace", namespace));
		document.setRootElement(answer);
		document.setModule("dao");
		return document;
	}
}
