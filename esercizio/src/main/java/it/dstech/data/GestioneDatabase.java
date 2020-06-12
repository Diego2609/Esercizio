package it.dstech.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import it.dstech.model.Utente;

public class GestioneDatabase {
	private EntityManager em;

	public GestioneDatabase(EntityManagerFactory emf) {
		this.em = emf.createEntityManager();
	}

	public Utente aggiungiUtente(Utente utente) {
		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		return utente;
	}

	public List<Utente> listaUtenti() {
		List<Utente> lista = em.createQuery("SELECT u FROM Utente u ORDER BY u.cognome", Utente.class).getResultList();
		return lista;
	}
}
