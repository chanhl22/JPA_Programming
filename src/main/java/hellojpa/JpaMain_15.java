package hellojpa;

import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain_15 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Team_15 team = new Team_15();
            team.setName("teamA");
            em.persist(team);

            Team_15 team2 = new Team_15();
            team2.setName("teamB");
            em.persist(team2);

            Member_15 member = new Member_15();
            member.setUsername("member1");
            member.setTeam(team);
            em.persist(member);

            Member_15 member2 = new Member_15();
            member2.setUsername("member1");
            member2.setTeam(team2);
            em.persist(member2);

            em.flush();
            em.clear();

//            Member_15 m = em.find(Member_15.class, member.getId());
//            System.out.println("m = " + m.getTeam().getClass());
//
//            System.out.println("===============");
//            System.out.println("teamName = " + m.getTeam().getName());
//            System.out.println("===============");

            List<Member_15> members = em.createQuery("select m from Member_15 m", Member_15.class)
                    .getResultList();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }
}
