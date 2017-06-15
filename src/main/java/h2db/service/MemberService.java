package h2db.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import h2db.entity.MemberEntity;


public class MemberService {

	public MemberService() {
	}

	public static void main(String[] args) {

		System.err.println("lamune 프로그램 실행 = MemberService#main() " ); //:TODO(lamune): Debug

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			bizLogic(em);
			tx.commit();

		} catch ( Exception ex ) {
			ex.printStackTrace();
			tx.rollback();

		} finally {
			em.close();
		}
	}


	private static void bizLogic(EntityManager em) {

		MemberEntity tmpMemberEntity = new MemberEntity();

		tmpMemberEntity.setId("id006");
		tmpMemberEntity.setName("name006");
		tmpMemberEntity.setAge(12);

		em.persist(tmpMemberEntity);

	}

}
