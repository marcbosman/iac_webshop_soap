package acceptgiro.service;

import acceptgiro.domain.Acceptgiro;

public interface AcceptgiroService {
	Acceptgiro doAcceptgiro(String Klantnaam, String Klantadres, double Bedrag);
}
