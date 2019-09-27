/**
 * 
 */
package com.pamu.jms.converter;

import javax.jms.Destination;

import org.springframework.core.convert.converter.Converter;

/**
 * @author pamuleti.pullagura
 *
 */
public class StringToDestinationConverter implements Converter<String, Destination>{

	@Override
	public Destination convert(String destination) {
		return null;
		
	}

}
