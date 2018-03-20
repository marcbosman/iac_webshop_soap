package acceptgiro.service;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		System.out.println("Service start op!");
		Endpoint.publish("http://localhost:8081/soap", new AcceptgiroServiceImpl());
	}
}