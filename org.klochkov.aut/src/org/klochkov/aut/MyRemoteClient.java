package org.klochkov.aut;

import java.rmi.*;

public class MyRemoteClient {


	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
		MyRemote service = (MyRemote) Naming.lookup("rmi://172.23.42.56/RemoteHello");
		String s = service.sayHello();
		System.out.println(s);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
