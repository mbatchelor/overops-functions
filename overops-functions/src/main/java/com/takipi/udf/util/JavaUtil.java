package com.takipi.udf.util;

public class JavaUtil {
	public static final char DELIM_QUALIFIED = '.';
	public static final char DELIM_INTERNAL = '/';

	public static String toInternalName(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}

		return name.replace(DELIM_QUALIFIED, DELIM_INTERNAL);
	}

	public static String toQualifiedName(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}

		return name.replace(DELIM_INTERNAL, DELIM_QUALIFIED);
	}

	public static String toSimpleClassName(String className) {
		String qualifiedName = toQualifiedName(className);
		int delimIndex = qualifiedName.lastIndexOf(DELIM_QUALIFIED);

		if (delimIndex >= 0) {
			return qualifiedName.substring(delimIndex + 1);
		} else {
			return className;
		}
	}
}
