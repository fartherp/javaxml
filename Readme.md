# 生成XML文件
[![Build Status](https://travis-ci.org/fartherp/javaxml.svg?branch=master)](https://travis-ci.org/fartherp/javaxml)
[![Coverage Status](https://coveralls.io/repos/github/fartherp/javaxml/badge.svg?branch=master)](https://coveralls.io/github/fartherp/javaxml?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.fartherp/javaxml/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.fartherp/javaxml/)
[![GitHub release](https://img.shields.io/github/release/fartherp/javaxml.svg)](https://github.com/fartherp/javaxml/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## 如何使用？
1. 在项目中加入```javaxml```依赖

    ```Maven```
    ``` xml
    <dependency>
        <groupId>com.github.fartherp</groupId>
        <artifactId>javaxml</artifactId>
        <version>2.0.2</version>
    </dependency>
    ```
    ```Gradle```
    ```
    compile 'com.github.fartherp:javaxml:2.0.2'
    ```

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
