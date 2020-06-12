package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.data.GestioneDatabase;
import it.dstech.model.Utente;

@WebServlet(name = "aggiungiLibro", urlPatterns = { "/aggiungiUtente" })
public class AggiungiUtente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi accedere a questa pagina tramite la pagina iniziale");
		req.getRequestDispatcher("paginaIniziale.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		Utente utente = new Utente();
		utente.setNome(req.getParameter("nome"));
		utente.setCognome(req.getParameter("cognome"));
		utente.setNumero(Integer.parseInt(req.getParameter("numero")));
		if (gestioneDB.aggiungiUtente(utente) != null) {
			req.setAttribute("messaggio", "Utente aggiunto");
			req.getRequestDispatcher("/paginaIniziale.jsp").forward(req, resp);
		} else {
			req.setAttribute("messaggio", "Utente non aggiunto");
		}
	}
}
