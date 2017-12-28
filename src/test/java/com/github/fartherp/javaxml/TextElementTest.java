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
public class TextElementTest {
    @Test
    public void testGetFormattedContent() throws Exception {
        TextElement textElement = new TextElement("select * from table");
        assertEquals(textElement.getFormattedContent(1), "  select * from table");
    }

}