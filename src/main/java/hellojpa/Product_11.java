package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Product_11 {

    @Id @GeneratedValue
    private Long Id;

    private String name;

//    @ManyToMany(mappedBy = "products")
//    private List<Member_11> members = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<MemberProduct_11> memberProducts = new ArrayList<>();

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
