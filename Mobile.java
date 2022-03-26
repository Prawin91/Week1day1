package week1.day1;

public class Mobile {
	
	
	public void makecall() {
		System.out.println("makecall");
	}
	public void sendMsg() {
	  System.out.println("sendMsg");
	}	
	public static void main(String[] args) {
		System.out.println("main method");
		
		Mobile newmobile = new Mobile();
		
		newmobile.makecall();
		newmobile.sendMsg();		
	}
}
