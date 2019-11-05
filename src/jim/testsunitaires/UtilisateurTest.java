package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import jim.classes.Outils;
import jim.classes.Utilisateur;

public class UtilisateurTest {
	
	private Utilisateur utilisateur1;
	private Utilisateur utilisateur2;
	
	@Before
	public void setUp() throws Exception {
		utilisateur1 = new Utilisateur();
		
		int unId = 111;
		String unPseudo = "toto";
		String unMdpSha1 = "abcdef";
		String uneAdrMail = "toto@free.fr";
		String unNumTel = "1122334455";
		int unNiveau = 1;
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		int unNbTraces = 3;
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
	}

	@Test
	public void testGetId() {
		int id1 = utilisateur1.getId();
		assertEquals("Test getId", 0, id1);
		
		int id2 = utilisateur2.getId();
		assertEquals("Test getId", 111, id2);
	}

	@Test
	public void testSetId() {
		utilisateur1.setId(1);
		assertEquals("TestSetLatitude", 1, utilisateur1.getId());
	}

	@Test
	public void testGetPseudo() {
		assertEquals("Test getPseudo", "", utilisateur1.getPseudo());
		assertEquals("Test getPseudo", "toto", utilisateur2.getPseudo());
	}

	@Test
	public void testSetPseudo() {
		utilisateur1.setPseudo("Yvan");
		assertEquals("Test setPseudo", "Yvan", utilisateur1.getPseudo());
	}

	@Test
	public void testGetMdpSha1() {
		String mdp1 = utilisateur1.getMdpSha1();
		assertEquals("Test GetMdpSha1", "", mdp1);
		
		String mdp2 = utilisateur2.getMdpSha1();
		assertEquals("Test GetMdpSha1", "abcdef", mdp2);	
	}

	@Test
	public void testSetMdpSha1() {
		utilisateur1.setMdpSha1("cococoucou");
		assertEquals("Test SetMdpSha1", "cococoucou", utilisateur1.getMdpSha1());
	}

	@Test
	public void testGetAdrMail() {
		assertEquals("Test getAdresse", "", utilisateur1.getAdrMail());
		assertEquals("Test getPseudo", "toto@free.fr", utilisateur2.getAdrMail());;
	}

	@Test
	public void testSetAdrMail() {
		utilisateur1.setAdrMail("delasalle.sio.fortounatto.y@gmail.com");;
		assertEquals("Test setPseudo", "delasalle.sio.fortounatto.y@gmail.com", utilisateur1.getAdrMail());
	}

	@Test
	public void testGetNumTel() {
		assertEquals("Test GetNumTel", "", utilisateur1.getNumTel());
		assertEquals("Test GetNumTel", "1122334455", utilisateur2.getNumTel());
	}

	@Test
	public void testSetNumTel() {
		utilisateur1.setNumTel("9988776655");
		assertEquals("Test SetNumTel", "9988776655", utilisateur1.getNumTel());
	}

	@Test
	public void testGetNiveau() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNiveau() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDateCreation() {
		Date debut1 = utilisateur1.getDateCreation();
		assertNull("Test getDateCreation", debut1);
		
		String debut2 = Outils.formaterDateHeureFR(utilisateur2.getDateCreation());
		assertEquals("Test getDateCreation", "21/06/2016 14:00:00", debut2);	
	}

	@Test
	public void testSetDateCreation() throws ParseException {
		utilisateur1.setDateCreation(Outils.convertirEnDateHeure("26/06/2016 14:00:00"));
		assertEquals("Test setDateCreation", "26/06/2016 14:00:00", Outils.formaterDateHeureFR(utilisateur1.getDateCreation()));	
	}

	@Test
	public void testGetNbTraces() {
		assertEquals("Test GetNbTraces", 0, utilisateur1.getNbTraces());
		assertEquals("Test GetNbTraces", 3, utilisateur2.getNbTraces());
	}

	@Test
	public void testSetNbTraces() {
		utilisateur1.setNbTraces(2);
		assertEquals("Test SetNbTraces", 2, utilisateur1.getNbTraces());
	}

	@Test
	public void testGetDateDerniereTrace() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDateDerniereTrace() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		String msg = "";
	    msg += "id : " + "0" + "\n";
	    msg += "pseudo : " + "" + "\n";
	    msg += "mdpSha1 : " + "" + "\n";
	    msg += "adrMail : " + "" + "\n";
	    msg += "numTel : " + "" + "\n";
	    msg += "niveau : " + "0" + "\n";
	    msg += "nbTraces : " + "0" + "\n";
	    assertEquals("Test toString", msg, utilisateur1.toString());
	    
		msg = "";
	    msg += "id : " + "111" + "\n";
	    msg += "pseudo : " + "toto" + "\n";
	    msg += "mdpSha1 : " + "abcdef" + "\n";
	    msg += "adrMail : " + "toto@free.fr" + "\n";
	    msg += "numTel : " + "11.22.33.44.55" + "\n";
	    msg += "niveau : " + "1" + "\n";
	    msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
	    msg += "nbTraces : " + "3" + "\n";
	    msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
	    assertEquals("Test toString", msg, utilisateur2.toString());
	}

}
