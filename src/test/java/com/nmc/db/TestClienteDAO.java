package com.nmc.db;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ncm.db.ClienteDAO;
import com.ncm.modelos.Cliente;

public class TestClienteDAO extends TestNCM {
	private static Logger logger = Logger.getLogger("TestClienteDAO");

	@BeforeClass
	public static void setUpClass() {
		setUpContext();
	}
	
//	@Test
//	public void testListaCountries() {
//
//		logger.log(Level.INFO, "Entrando al test...");
//
//		try {
//			ClienteDAO cliDAO = ClienteDAOFactory.getDAO("mysql");
//			List<Cliente> listaCountry= cliDAO.getLista();
//			
//			
//			assertTrue(listaCountry != null && !listaCountry.isEmpty());
//
//		} catch (Exception ex) {
//			fail();
//			ex.printStackTrace();
//			System.out.println("Error en DAO:" + ex);
//		}
//
//		logger.log(Level.INFO, "Fin de test...");
//	}
//	
	
}