package hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;

//@Entity
public class MemberProduct_11 {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member_11 member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product_11 product;

    private int count;
    private int price;

    private LocalDateTime orderDateTime;

}
