package hellojpa;

import org.hibernate.Hibernate;

import javax.persistence.*;

public class JpaMain_14 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

//            Member_14 member = new Member_14();
//            member.setUsername("hello");
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
////            Member_14 findMember = em.find(Member_14.class, member.getId());
//            Member_14 findMember = em.getReference(Member_14.class, member.getId());
//            System.out.println("before findMember = " + findMember.getClass());
//            System.out.println("findMember.username = " + findMember.getUsername());
//            System.out.println("after findMember = " + findMember.getClass());

//            Member_14 member1 = new Member_14();
//            member1.setUsername("member1");
//            em.persist(member1);
//
//            Member_14 member2 = new Member_14();
//            member2.setUsername("member2");
//            em.persist(member2);
//
//            em.flush();
//            em.clear();
//
//            Member_14 m1 = em.find(Member_14.class, member1.getId());
//            Member_14 m2 = em.getReference(Member_14.class, member2.getId());
//
//            System.out. println("m1 == m2" + (m1.getClass() == m2.getClass()));

//            Member_14 member = new Member_14();
//            member.setUsername("member1");
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
//            Member_14 refMember = em.getReference(Member_14.class, member.getId());
//            System.out.println("refMember = " + refMember.getClass());
//
//            Member_14 findMember = em.find(Member_14.class, member.getId());
//            System.out.println("findMember = " + findMember.getClass());
//
//            System.out.println("refMember == findMember = " + (refMember == findMember));

//            Member_14 member = new Member_14();
//            member.setUsername("member1");
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
//            Member_14 refMember = em.getReference(Member_14.class, member.getId());
//            System.out.println("refMember = " + refMember.getClass());
//
//            em.clear();
//
//            refMember.getUsername();

            Member_14 member = new Member_14();
            member.setUsername("member1");
            em.persist(member);

            em.flush();
            em.clear();

            Member_14 refMember = em.getReference(Member_14.class, member.getId());
            System.out.println("refMember = " + refMember.getClass());
//            refMember.getUsername();
//            System.out.println("isLoaded = " + emf.getPersistenceUnitUtil().isLoaded(refMember));
            Hibernate.initialize(refMember);

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
