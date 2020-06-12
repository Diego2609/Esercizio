package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.data.GestioneDatabase;

@WebServlet(name = "controlloAzione", urlPatterns = { "/controlloAzione", "/" })
public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		int azione = Integer.parseInt(req.getParameter("azione"));
		switch (azione) {
		case 1:
			req.getRequestDispatcher("aggiungiUtente.jsp").forward(req, resp);
			break;
		case 2:
			req.setAttribute("listaUtenti", gestioneDB.listaUtenti());
			req.getRequestDispatcher("vediUtenti.jsp").forward(req, resp);
			break;
		}
	}
}
