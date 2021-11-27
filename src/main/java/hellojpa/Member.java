package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(name = "constraintName", columnNames = {"name"}))
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR", //시퀀스 제너레이터 이름
        sequenceName = "MEMBER_SEQ", //매핑할 데이터베이스 시퀀스 이름
        initialValue = 1, //시작값
        allocationSize = 50) //메모리를 통해 할당할 범위 사이즈
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

    @Column(name = "name", nullable = false)
    private String username;

//@Entity
//@TableGenerator(
//        name = "MEMBER_SEQ_GENERATOR",
//        table = "MY_SEQUENCES",
//        pkColumnValue = "MEMBER_SEQ", allocationSize = 1)
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
//    private Long id;
//
//    @Column(name = "name", nullable = false)
//    private String username;

//@Entity
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name", nullable = false)
//    private String username;

    //    private Integer age;
//
//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//
//    private LocalDate testLocalDate;
//    private LocalDateTime testLocalDateTime;
//
//    @Lob
//    private String description;
//
    public Member() {
    }

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
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public RoleType getRoleType() {
//        return roleType;
//    }
//
//    public void setRoleType(RoleType roleType) {
//        this.roleType = roleType;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Date getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(Date lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}

//package hellojpa;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Member {
//
//    @Id
//    private Long id;
//    private String name;
//
//    public Member() {
//    }
//
//    public Member(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
