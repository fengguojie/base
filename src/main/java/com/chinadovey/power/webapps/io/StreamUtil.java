package com.chinadovey.power.webapps.io;

import java.awt.event.FocusEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 一个字符流16位（char）  一个字节流8位(byte)
 * 输入流：只能读 InputStream Reader(输入流模型:水管  有水滴)
 * 输出流：只能写 OutpuStream Writer(输出流模型:水管  没有水滴)
 * 节点流：构造器的参数是具体的一个物理节点
 * 处理刘：构造器的参数是节点流
 * @author fengguojie
 */
public class StreamUtil {
	
	/**
	 * 文件字节输入流(inputStream) 三个主要方法
	 * 1：abstract int read()读取单个字节，返回当前读取的字节数据
	 * 2：int read(byte[] b) 读取b.length个字节 放入数组b中，返回实际读取的个数
	 * 3：int read(byte[] b, int off, int len) 读取len个字节放入数组b 放入的位置是从off开始的，返回实际读取的个数
	 * 其中调用2相当于int read(byte[] b，0，b.length) 等价于调用3
	 * mark,skip,reset,markSupported(四个方法 不常用)
	 * @throws IOException 
	 */
	public void fileInputStreamDemo() throws IOException{
		//1:文件输入流（inputStream子类）
		String fileName = FileUtil.getFileName();
		FileInputStream fis = new FileInputStream(fileName);
		byte[] b = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(b)) > 0) {
			System.out.println(new String(b, 0, hasRead));
		}
		fis.close();
		
		
	}
	/**
	 * 文件字符输入流(Reader) 三个主要方法
	 * 1：int read()读取单个字节，返回当前读取的字符数据
	 * 2：int read(char[] b) 读取b.length个字符 放入数组b中，返回实际读取的个数
	 * 3：abstract int read(char[] b, int off, int len) 读取len个字符放入数组b 放入的位置是从off开始的，返回实际读取的个数
	 * 其中调用2相当于int read(char[] b，0，b.length) 等价于调用3
	 * mark,skip,reset,markSupported(四个方法 不常用)
	 * @throws IOException 
	 */
    public void fileReaderDemo() throws IOException{
    	//1:文件输入流（Reader子类）
		String fileName = FileUtil.getFileName();
		FileReader fr = new FileReader(fileName);
		char[] b = new char[1024];
		int hasRead = 0;
		while ((hasRead = fr.read(b)) > 0) {
			System.out.println(new String(b, 0, hasRead));
		}
		fr.close();
	}
    /**
	 * 文件字节输出流(outStream) 三个主要方法
	 * 1：abstract void write() 将指定的字节输出到输出流中
	 * 2：void write(byte[] b) 将字节数组输出到输出流中
	 * 3：void write(byte[] b, int off, int len) 将len个字节放入输出流中  放入的位置是从off开始的
     * @throws IOException 
	 */
    public void fileOutStreamDemo() throws IOException{
    	//1:文件输入流（inputStream子类）
		String fileName = FileUtil.getFileName();
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream("D:\\i0\\test\\test.txt");
		byte[] b = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(b)) > 0) {
			fos.write(b,0,hasRead);
		}
		fos.close();
		fis.close();
	}
    /**
	 * 文件字符输出流(outStream) 三个主要方法
	 * 1：abstract void write() 将指定的字符输出到输出流中
	 * 2：void write(char[] b) 将字符数组输出到输出流中
	 * 3：void write(char[] b, int off, int len) 将len个字符放入输出流中  放入的位置是从off开始的
	 * char[] 可以用 String 替换
	 * @throws IOException 
	 */
    public void fileWriterStreamDemo() throws IOException{
    	FileWriter fw = new FileWriter("D:\\i0\\test\\poem.txt");
    	fw.write("静夜思\r\n");
    	fw.write("窗前明月光\r\n");
    	fw.write("疑是地上霜\r\n");
    	fw.write("举头望明月\r\n");
    	fw.write("低头思故乡\r\n");
    	fw.close();
    }
    
    public void printStreamDemo() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("D:\\i0\\test\\printStreamPrac.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("普通字符串");
		ps.println(new StreamUtil());
		ps.close();
	}
	
	public static void main(String[] args) {
		try {
			StreamUtil util = new StreamUtil();
			util.printStreamDemo();
        } catch (IOException e) {
			e.printStackTrace();
		}
	}

}
