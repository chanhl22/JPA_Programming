package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain_15 {

    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = enf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team_15 team = new Team_15();
            team.setName("TeamA");
            em.persist(team);

            Member_15 member = new Member_15();
            member.setUsername("member1");
            member.setTeam(team);
            em.persist(member);

            em.flush();
            em.clear();

            Member_15 findMember = em.find(Member_15.class, member.getId());
            Team_15 findTeam = findMember.getTeam();
            System.out.println("findTeam = " + findTeam.getName());

            Team_15 newTeam = em.find(Team_15.class, 100L);
            findMember.setTeam(newTeam);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        enf.close();

    }
}
