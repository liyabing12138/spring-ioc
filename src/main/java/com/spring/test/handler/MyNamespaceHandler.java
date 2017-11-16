package com.spring.test.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.spring.test.parser.PeopleBeanDefinitionParser;

public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser()); 
	}

}
