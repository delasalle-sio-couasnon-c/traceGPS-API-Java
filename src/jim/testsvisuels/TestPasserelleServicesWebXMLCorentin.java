package jim.testsvisuels;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PasserelleServicesWebXMLCorentin;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXMLCorentin {

	public static void main(String[] args) throws ParseException {
		
		String msg;
	
		// test visuel de la méthode getTousLesUtilisateurs
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getTousLesUtilisateurs("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}

		// test visuel de la méthode getLesUtilisateursQueJautorise


		// test visuel de la méthode getLesUtilisateursQuiMautorisent

		
		// test visuel de la méthode getLesParcoursDunUtilisateur

		

		// test visuel de la méthode getUnParcoursEtSesPoints
//		Trace laTrace = new Trace();
//		msg = PasserelleServicesWebXMLCorentin.getUnParcoursEtSesPoints("europa", "bf65a3f3eae46af8192408b64b6f1e8db1cbc6d8", 4, laTrace);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage de la trace
//		System.out.println(laTrace.toString());
		
		
		// test visuel de la méthode envoyerPosition
		Date laDate = Outils.convertirEnDateHeure("24/01/2018 13:42:21");
		
		PointDeTrace lePoint = new PointDeTrace(23, 0, 48.15, -1.68, 50, laDate, 80);
		msg = PasserelleServicesWebXMLCorentin.envoyerPosition("europa", Outils.sha1("mdputilisateurrrrrr"), lePoint);
		System.out.println(msg);

	} // fin Main
} // fin class
