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

/**
 * the XML of text content.
 * <p><code>Element attribute = new TextElement("select * from table");</code></p>
 * <p><code>attribute.getFormattedContent(1);</code></p>
 * <p>the result is <b>select * from table</b></p>
 * Author: CK.
 * Date: 2015/6/6.
 */
public class TextElement implements Element {

    private String content;

    public TextElement(String content) {
        this.content = content;
    }

    public String getFormattedContent(int indentLevel) {
        StringBuilder sb = new StringBuilder();
        OutputUtil.xmlIndent(sb, indentLevel);
        sb.append(content);
        return sb.toString();
    }
}
