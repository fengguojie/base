package com.chinadovey.power.webapps.io;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	
	public static String getFileName() throws IOException{
		File filePath = new File("d:/i0/test");
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		File realfile = new File(filePath+File.separator+"mary.txt");
		if (!realfile.exists()) {
			realfile.createNewFile();
		}
		return filePath+File.separator+realfile.getName();
	}
	public static String createFile(String fileName) throws IOException{
		File filePath = new File("d:/i0/test");
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		File realfile = new File(filePath+File.separator+fileName);
		if (!realfile.exists()) {
			realfile.createNewFile();
		}
		return filePath+File.separator+realfile.getName();
	}
	public static void main(String[] args) throws IOException {
		
	}

}
