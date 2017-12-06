package org.eop.spring.boot.type.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class BookFormatter implements Formatter<BookBean> {

	//序列化
	@Override
	public String print(BookBean object, Locale locale) {
		return object.getText();
	}

	//反序列化
	@Override
	public BookBean parse(String text, Locale locale) throws ParseException {
		return new BookBean(text);
	}

}
