package teste;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Aluno;
import model.Sala;

public class teste {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("universo");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		Sala sala = new Sala();
		Aluno aluno = new Aluno();

		aluno.setDescricao("Nelson");
		sala.setDescricao("Ingles");

		aluno.setSala(sala);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno);
		sala.setAlunos(alunos);
		manager.persist(sala);
		manager.persist(aluno);

		trx.commit();
	}

}
