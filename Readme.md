# 生成XML文件

## Document
java公用信息
### Sample Code
```
Document document = new Document("-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
XmlElement answer = new XmlElement("mapper");
String namespace = "com.github.codegenerator.Mapper";
answer.addAttribute(new Attribute("namespace", namespace));
document.setRootElement(answer);
```

## XmlElement
1. 实例: Field field = new Field("age", new JavaTypeInfo("java.lang.Integer"));
2. 初始值: setInitializationString(String initializationString);
3. transient: setTransient(boolean transient);
4. volatile: setVolatile(boolean volatile);
### Sample Code
```
XmlElement xmlElement = new XmlElement("select");
Attribute attribute = new Attribute("id", "findAll");
xmlElement.addAttribute(attribute);
TextElement textElement = new TextElement("select * from table");
xmlElement.addElement(textElement);
```

## TextElement
### Sample Code
```
TextElement textElement = new TextElement("select * from table");
```
## Attribute
### Sample Code
```
Attribute attribute = new Attribute("id", "update");
```
