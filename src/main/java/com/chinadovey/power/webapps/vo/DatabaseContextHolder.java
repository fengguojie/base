package com.chinadovey.power.webapps.vo;

public class DatabaseContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDbType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDbType() {
    	System.err.println(contextHolder.get());
        return contextHolder.get();
    }

    public static void clearDbType() {
    	System.err.println("holder remove");
        contextHolder.remove();
    }

}
