package Enquesta;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Enquestes
 */
@WebServlet("/Enquestes")
public class Enquestes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enquestes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// TODO Auto-generated method stub
		// context crear array o mapa con las bebidas
		// Xavi dice cambiar int por integer, pero error porque array todo null
		int[] array ={0,0,0,0}; 
		
		getServletContext().setAttribute("resultats", array); 
	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("enquesta.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String beguda = request.getParameter("beguda");
		int[] array  = (int[]) getServletContext().getAttribute("resultats");		
		
		if(beguda.equals("cerveza")){
			array[0] += 1;
		}else if(beguda.equals("cafe")){
			array[1] += 1;
		}else if(beguda.equals("vi")){
			array[2] += 1;
		}else if(beguda.equals("carajillo")){
			array[3] += 1;
		}
		
		
		
		getServletContext().setAttribute("resultats", array);
		
		response.sendRedirect("Resultats");
	}

}
