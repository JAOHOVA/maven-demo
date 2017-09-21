package com.m2i.formation;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger l = Logger.getLogger(App.class);

	public static void main(String[] args) {
		try {
			l.info("Entrée dans MethodeMAIN : ");
			int i =10/0;
			l.info("Sortie de MethodeMAIN : ");
		} catch (Exception e) {
			l.error("Erreur dans la méthode :" + e);
		}
	}
}
