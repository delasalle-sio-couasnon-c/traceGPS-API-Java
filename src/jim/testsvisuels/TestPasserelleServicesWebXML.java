package jim.testsvisuels;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PasserelleServicesWebXMLYvan;
import jim.classes.PasserelleServicesWebXMLCorentin;
import jim.classes.PasserelleServicesWebXMLGuillaume;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

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
		

		// test visuel de la méthode getLesParcoursDunUtilisateur
		ArrayList<Trace> lesTraces = new ArrayList<Trace>();
		msg = PasserelleServicesWebXMLYvan.getLesParcoursDunUtilisateur("europa", "13e3668bbee30b004380052b086457b014504b3e", "callisto", lesTraces);
		// affichage de la réponse
		System.out.println(msg);
		// affichage du nombre de traces
		System.out.println("Nombre de traces : " + lesTraces.size());
		// affichage de toutes les traces
		for (Trace uneTrace : lesTraces)
		{	System.out.println(uneTrace.toString());
		}

		
		// test visuel de la méthode getUnParcoursEtSesPoints
		
		
<<<<<<< HEAD
//		msg = PasserelleServicesWebXMLCorentin.connecter("admin", "adminnnnnnnn");
//		//Erreur : authentification incorrecte.
//		System.out.println(msg);
//		msg = PasserelleServicesWebXMLCorentin.connecter("admin", Outils.sha1("mdpadmin"));
//		//Administrateur authentifié.
//		System.out.println(msg);
//		msg = PasserelleServicesWebXMLCorentin.connecter("europa", Outils.sha1("mdputilisateur"));
//		//Utilisateur authentifié.
//		System.out.println(msg);
		
		// test visuel de la méthode envoyerPosition
		Date laDate = Outils.convertirEnDateHeure("24/01/2018 13:42:21");
		
		PointDeTrace lePoint = new PointDeTrace(23, 0, 48.15, -1.68, 50, laDate, 80);
		msg = PasserelleServicesWebXMLGuillaume.envoyerPosition("europa", Outils.sha1("mdputilisateurrrrrr"), lePoint);
		System.out.println(msg);
=======
		//msg = PasserelleServicesWebXMLCorentin.connecter("admin", "adminnnnnnnn");
		//Erreur : authentification incorrecte.
		//System.out.println(msg);
		//msg = PasserelleServicesWebXMLCorentin.connecter("admin", Outils.sha1("mdpadmin"));
		//Administrateur authentifié.
		//System.out.println(msg);
		//msg = PasserelleServicesWebXMLCorentin.connecter("europa", Outils.sha1("mdputilisateur"));
		//Utilisateur authentifié.
		//System.out.println(msg);
>>>>>>> branch 'master' of https://github.com/delasalle-sio-couasnon-c/traceGPS-API-Java.git
	
	} // fin Main
} // fin class
