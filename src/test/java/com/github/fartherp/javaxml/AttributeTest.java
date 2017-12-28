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
public class AttributeTest {
    @Test
    public void testGetFormattedContent() throws Exception {
        Attribute attribute = new Attribute("id", "update");
        assertEquals(attribute.getFormattedContent(1), "id=\"update\"");
    }

}