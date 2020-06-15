package com.unisys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private DateUtil() {
	}

	public static Date toDate(String date) {
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			// convert a checked exception into an unchecked exception
			throw new RuntimeException(e); // decorator pattern
		}
	}

	public static String toString(Date date) {
		return sdf.format(date);
	}

}
