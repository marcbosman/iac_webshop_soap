package acceptgiro.service;

import javax.jws.WebService;

import acceptgiro.domain.Acceptgiro;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@WebService
public class AcceptgiroServiceImpl implements AcceptgiroService {
	
	@Override
	public Acceptgiro doAcceptgiro(String Klantnaam, String Klantadres, double Bedrag) {
		System.out.println("Request wordt verwerkt!");
		Random rand = new Random();
		int uniek_getal = rand.nextInt(99999) + 10000;
		try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Acceptgiro(1, Klantnaam, Klantadres, Bedrag, uniek_getal);
	}
}
