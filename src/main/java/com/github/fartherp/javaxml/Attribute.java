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

/**
 * the XML of attribute. the format is <code>name</code>="<code>value</code>"
 * <p><code>Element attribute = new Attribute("id", "getList");</code></p>
 * <p><code>attribute.getFormattedContent(1);</code></p>
 * <p>the result is <b>id="getList"</b></p>
 * @author CK.
 * @date 2015/6/5.
 */
public class Attribute implements Element {
    private String name;

    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
	public String getFormattedContent(int indentLevel) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("=\"");
        sb.append(value);
        sb.append('\"');
        return sb.toString();
    }
}
