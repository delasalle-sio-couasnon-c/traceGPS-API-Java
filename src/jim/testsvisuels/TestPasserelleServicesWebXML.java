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
		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
		msg = PasserelleServicesWebXMLGuillaume.getLesUtilisateursQuiMautorisent("indigo", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		// affichage de la réponse
		System.out.println(msg);
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	System.out.println(unUtilisateur.toString());
		}


		
		// test visuel de la méthode getLesParcoursDunUtilisateur
		

		// test visuel de la méthode getLesParcoursDunUtilisateur
//		ArrayList<Trace> lesTraces = new ArrayList<Trace>();
//		msg = PasserelleServicesWebXMLYvan.getLesParcoursDunUtilisateur("europa", "13e3668bbee30b004380052b086457b014504b3e", "callisto", lesTraces);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre de traces
//		System.out.println("Nombre de traces : " + lesTraces.size());
//		// affichage de toutes les traces
//		for (Trace uneTrace : lesTraces)
//		{	System.out.println(uneTrace.toString());
//		}

		
		// test visuel de la méthode getUnParcoursEtSesPoints
		

	
	} // fin Main
} // fin class
