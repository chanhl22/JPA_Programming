package hellojpa;

import javax.persistence.*;

//@Entity
public class Member_15 extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    //양방향 매핑 추가
    @ManyToOne(fetch = FetchType.LAZY)
//    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Team_15 team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team_15 getTeam() {
        return team;
    }

    public void setTeam(Team_15 team) {
        this.team = team;
    }
}