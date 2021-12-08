package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Team_13 extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<Member_13> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member_13> getMembers() {
        return members;
    }

    public void setMembers(List<Member_13> members) {
        this.members = members;
    }
}
