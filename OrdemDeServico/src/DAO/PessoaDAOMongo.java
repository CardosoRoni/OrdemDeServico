package DAO;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.mongodb.DB;

import Model.Pessoa;

public class PessoaDAOMongo  implements PessoaDAO{
	
	private final DB db;
	
	public MongoCollection conta() {
		Jongo jongo = new Jongo(db);
		return jongo.getCollection("pessoas");
	}

	public DB getDb() {
		return db;
	}

	public PessoaDAOMongo(DB db) {
		super();
		this.db = db;
	}

	@Override
	public void update(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserir(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}
