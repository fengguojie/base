package com.chinadovey.power.webapps.jellard;

import java.io.File;
import java.io.IOException;

/**
 * File 类
 * 输入/输出流（所谓的出入都是以内存参照的）
 * @author feng
 */
public class FileTest {
	
	
	public static void main(String[] args) {
		File file = new File(".");//当前路径
		System.out.println(file.getName());//.
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());//D:\Bean\Workspace\dovey-test-server\.
		System.out.println(file.getAbsoluteFile());//D:\Bean\Workspace\dovey-test-server\.
		String path = file.getAbsolutePath();
		System.out.println(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
