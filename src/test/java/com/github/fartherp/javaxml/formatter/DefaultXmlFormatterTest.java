/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.javaxml.formatter;

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
        assertNotNull(str);
    }

}
