package name.ealen.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zyl
 * @Date: 2020/7/17 7:10
 */
@Data
@Entity
@Table(name="sct_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private Long custId;

    @Column(name="cust_address")
    private String custAddress;

    @Column(name="cust_industry")
    private String custIndustr;

    @Column(name="cust_level")
    private String custLevel;

    @Column(name="cust_name")
    private String custName;

    @Column(name="cust_phone")
    private String custPhone;

    @Column(name="cust_source")
    private String custSource;

    @OneToMany(targetEntity = LinkMan.class)
//    @JoinColumn
    private Set<LinkMan> linkManSet = new HashSet<>();
}
