package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Locker_10 {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
