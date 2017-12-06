package org.eop.spring.boot.property.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class IsbnEditor extends PropertyEditorSupport {

	//从字符串转对象
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new IsbnBean(text));
	}
	
	//从对象转字符串
	@Override
	public String getAsText() {
		return ((IsbnBean)getValue()).getIsbn();
	}
}
