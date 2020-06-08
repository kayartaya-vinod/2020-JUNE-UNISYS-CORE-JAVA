package co.vinod.programs;

import java.sql.Connection;

import com.unisys.apps.SayHello;
// import com.unisys.service.HelloService;

public class Main {

	public static void main(String[] args) {

		Connection conn;
		// HelloService service = new HelloService();
		SayHello sh = new SayHello();
		sh.run();
		
	}

}
