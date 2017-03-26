package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.DB;
import com.mongodb.MongoClient;


import DAO.PessoaDAO;
import DAO.PessoaDAOMongo;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroServlet() {
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
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String defeito = request.getParameter("defeito");
		String itens = request.getParameter("itens");
		String data = request.getParameter("data");
		String valor = request.getParameter("valor");
		

		if (nome.equals("") & endereco.equals("") & telefone.equals("") & defeito.equals("") & itens.equals("") & 
				data.equals("") & valor.equals("")){
			response.getWriter().append("Preencha os campos");
		} else {
			MongoClient mongo = new MongoClient();// criando um clienteMongo
			DB db = mongo.getDB("pessoa");// seleciona o banco no caso "contas"
			PessoaDAO pessoaDAO = new PessoaDAOMongo(db);// o DAO onde gerencia as
														// informaçoes
	}
	}
}
