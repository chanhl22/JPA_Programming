package hellojpa;

import javax.persistence.*;

@Entity
public class Locker_10 {

    @Id @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;

    @OneToOne (mappedBy = "locker")
    private Member_10 member;
}
