package com.Jonathan.Controlador;

import java.io.IOException;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_Jonathan_model.Cliente;

/**
 * Servlet implementation class ServeletControler
 */
public class ServeletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doGet(request, response);
		String acction= request.getParameter("btn");
		Cliente c= new Cliente();
		EntityManager em;
		
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
		em= emf.createEntityManager();
		
		try {
		
		String id= request.getParameter("Id");
		String nombre= request.getParameter("Nombre");
		String apellido= request.getParameter("Apellido");
		String edad= request.getParameter("Edad");
		String Direcion= request.getParameter("Direcion");
		String dui= request.getParameter("Dui");
		String nit= request.getParameter("Nit");
		String grupoDeClaseProgramacion3Alquepertenece= request.getParameter("grupoDeClaseProgramacion3Alquepertenece");
		String ultimaNotaObtenidaEnProgramacion2= request.getParameter("ultimaNotaObtenidaEnProgramacion2");
		
		
		c.setId(Integer.parseInt(id));
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setEdad(Integer.parseInt(edad));
		c.setDireccion(Direcion);
		c.setDui(dui);
		c.setNit(nit);
		c.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		c.setUltimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(acction.equals("Agregar")) {
	
		
			em.getTransaction().begin();
		//insertar nuevos clientes
			em.persist(c);
		
			em.flush();
		
			em.getTransaction().commit();
		
	
		
		
		}else if (acction.equals("actualizar")){
		
			
				em.getTransaction().begin();
			
			//editar clientes insertados anteriormente 
				em.merge(c);
				
				em.flush();
			
				em.getTransaction().commit();
			
		
			
		}else if (acction.equals("Eliminar")){
		
		
		
			em.getTransaction().begin();
		
			// eliminar inserciones
			
			c= em.getReference(Cliente.class,c.getId());
			em.getTransaction().begin();
			em.remove(c);
			
			em.flush();
		
			em.getTransaction().commit();
		
		
		
	}
		response.sendRedirect("index.jsp");
		}
		

}
