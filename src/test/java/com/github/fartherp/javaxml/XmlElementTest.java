/**
 *    Copyright (c) 2015-2019 CK.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.fartherp.javaxml;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author CK
 * @date 2017/12/28
 */
public class XmlElementTest {
    @Test
    public void testGetFormattedContent() throws Exception {
		XmlElement xmlElement = original();
        String str = xmlElement.getFormattedContent(1);
        assertNotNull(str);
        assertEquals(xmlElement.getName(), "select");
    }

	@Test
	public void testOriginalConstructorGetFormattedContent() throws Exception {
		XmlElement xmlElement = original();
		XmlElement newXmlElement = new XmlElement(xmlElement);
		String originalStr = newXmlElement.getFormattedContent(1);
		String str = newXmlElement.getFormattedContent(1);
		assertEquals(originalStr, str);
	}

	@Test
	public void testElementsEmptyGetFormattedContent() throws Exception {
		XmlElement xmlElement = elementsEmpty();
		String str = xmlElement.getFormattedContent(1);
		assertNotNull(str);
	}

	@Test
	public void testEndFalseGetFormattedContent() throws Exception {
		XmlElement xmlElement = elementsEmpty();
		xmlElement.setEnd(false);
		String str = xmlElement.getFormattedContent(1);
		assertNotNull(str);
	}

	private XmlElement elementsEmpty() {
		return new XmlElement("value");
	}

    private XmlElement original() {
		XmlElement xmlElement = new XmlElement("select");
		Attribute attribute = new Attribute("id", "findAll");
		xmlElement.addAttribute(attribute);
		TextElement textElement = new TextElement("select * from table");
		xmlElement.addElement(textElement);
		return xmlElement;
	}
}
