package com.chinadovey.power.webapps.jellard;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Result.FAIL);
	}

}


enum Result{
	
    FAIL(404,"not found"),
	
	SUCCESS(200,"success");
	
	private int statusCode;
	
	private String msg;
	
	private Result(int statusCode,String msg){
		this.statusCode = statusCode;
		this.msg = msg;
	}
	 // 覆盖方法
    @Override
    public String toString() {
        return this.statusCode + "_" + this.msg;
    }
    
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
