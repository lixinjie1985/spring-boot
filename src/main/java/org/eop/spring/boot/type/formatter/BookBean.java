package org.eop.spring.boot.type.formatter;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class BookBean {

	private String text;
	
	public BookBean(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
}
