package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PasserelleServicesWebXMLCorentin;
import jim.classes.Point;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class PasserelleServiceWebXMLTestCorentin {
	
	@Test
	public void testConnecter() {
		String msg = PasserelleServicesWebXMLCorentin.connecter("admin", "adminnnnnnnn");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.connecter("admin", Outils.sha1("mdpadmin"));
		assertEquals("Administrateur authentifié.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.connecter("europa", Outils.sha1("mdputilisateur"));
		assertEquals("Utilisateur authentifié.", msg);
	}
		
	@Test
	public void testCreerUnUtilisateur() {
		String msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("jim", "delasalle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : pseudo trop court (8 car minimum) ou déjà existant.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("turlututu", "delasalle.sio.elevesgmail.com", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);

		msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("turlututu", "delasalle.sio.eleves@gmailcom", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("turlututu", "delasalle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("turlututu", "delasallesioeleves@gmail.com", "1122334455");
		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel avec votre mot de passe.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.creerUnUtilisateur("turlututu", "de.la.salle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : pseudo trop court (8 car minimum) ou déjà existant.", msg);	
	}
	
	@Test
	public void testSupprimerUnUtilisateur() {
		String msg;
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("europa", Outils.sha1("mdputilisateurrrrrr"), "toto");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("europa", Outils.sha1("mdputilisateur"), "toto");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("admin", Outils.sha1("mdpadminnnnn"), "toto");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("admin", Outils.sha1("mdpadmin"), "toto");
		assertEquals("Erreur : pseudo utilisateur inexistant.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("admin", Outils.sha1("mdpadmin"), "neon");
		assertEquals("Erreur : suppression impossible ; cet utilisateur possède encore des traces.", msg);	
		
		msg = PasserelleServicesWebXMLCorentin.supprimerUnUtilisateur("admin", Outils.sha1("mdpadmin"), "turlututu");
		assertEquals("Suppression effectuée ; un courriel va être envoyé à l'utilisateur.", msg);	
	}
	
	@Test
	public void testChangerDeMdp() {
		String msg = PasserelleServicesWebXMLCorentin.changerDeMdp("europa", Outils.sha1("mdputilisateur"), "passepasse", "passepassepasse");
		assertEquals("Erreur : le nouveau mot de passe et sa confirmation sont différents.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.changerDeMdp("europa", Outils.sha1("mdputilisateurrrr"), "passepasse", "passepasse");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.changerDeMdp("europa", Outils.sha1("mdputilisateur"), "mdputilisateurrrr", "mdputilisateurrrr");
		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel de confirmation.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.changerDeMdp("europa", Outils.sha1("mdputilisateurrrr"), "mdputilisateur", "mdputilisateur");
		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel de confirmation.", msg);
	}	

	@Test
	public void testDemanderMdp() {
		String msg = PasserelleServicesWebXMLCorentin.demanderMdp("jim");
		assertEquals("Erreur : pseudo inexistant.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.demanderMdp("europa");
		assertEquals("Vous allez recevoir un courriel de confirmation avec votre nouveau mot de passe.", msg);
	}

	@Test
	public void testDemanderUneAutorisation() {
		String msg = PasserelleServicesWebXMLCorentin.demanderUneAutorisation("europa", Outils.sha1("mdputilisateurrrrrr"), "toto", "", "");
		assertEquals("Erreur : données incomplètes.", msg);

		msg = PasserelleServicesWebXMLCorentin.demanderUneAutorisation("europa", Outils.sha1("mdputilisateurrrrrr"), "toto", "coucou", "charles-edouard");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.demanderUneAutorisation("europa", Outils.sha1("mdputilisateur"), "toto", "coucou", "charles-edouard");
		assertEquals("Erreur : pseudo utilisateur inexistant.", msg);
		
		msg = PasserelleServicesWebXMLCorentin.demanderUneAutorisation("europa", Outils.sha1("mdputilisateur"), "galileo", "coucou", "charles-edouard");
		assertEquals("galileo va recevoir un courriel avec votre demande.", msg);	
	}

	@Test
	public void testRetirerUneAutorisation() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnvoyerPosition() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testDemarrerEnregistrementParcours() {
		fail("Not yet implemented");
	}

	@Test
	public void testArreterEnregistrementParcours() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSupprimerUnUnParcours() {
		fail("Not yet implemented");
	}
	
} // fin du test
