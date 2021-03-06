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

import com.github.fartherp.javaxml.utils.OutputUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * the XML of XML element.
 * @author CK.
 * @date 2015/6/6.
 */
public class XmlElement implements Element {

    private List<Attribute> attributes;

    private List<Element> elements;

    /** 每个节点名称 */
    private String name;

    /** 是否包含结束标签,true:不需要,false:需要 */
    private boolean end;

    public XmlElement(String name) {
        this(name, true);
    }

    public XmlElement(String name, boolean end) {
        attributes = new ArrayList<>();
        elements = new ArrayList<>();
        this.name = name;
        this.end = end;
    }

    public XmlElement(XmlElement original) {
        attributes = new ArrayList<>();
        attributes.addAll(original.attributes);
        elements = new ArrayList<>();
        elements.addAll(original.elements);
        this.name = original.name;
        this.end = original.end;
    }

    @Override
	public String getFormattedContent(int indentLevel) {
        StringBuilder sb = new StringBuilder();

        // 生成名称对应标签
        OutputUtil.xmlIndent(sb, indentLevel);
        sb.append('<');
        sb.append(this.name);

        // 放入标签属性
        for (Attribute att : this.attributes) {
            // 属性间一个空格
            sb.append(' ');
            sb.append(att.getFormattedContent(0));
        }

        if (this.elements.size() > 0) {
            sb.append(">");
            for (Element element : this.elements) {
                OutputUtil.newLine(sb);
                sb.append(element.getFormattedContent(indentLevel + 1));
            }
            // 生成名称对应的结束标签
            OutputUtil.newLine(sb);
            OutputUtil.xmlIndent(sb, indentLevel);
            sb.append("</");
            sb.append(this.name);
            sb.append('>');
        } else {
            if (end) {
                sb.append(" />");
            } else {
                sb.append('>');
                OutputUtil.newLine(sb);
                OutputUtil.newLine(sb);
                sb.append("</");
                sb.append(this.name);
                sb.append('>');
            }
        }

        return sb.toString();
    }

    public void addAttribute(Attribute attribute) {
        attributes.add(attribute);
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public String getName() {
        return name;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
