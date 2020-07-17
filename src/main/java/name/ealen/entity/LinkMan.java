package name.ealen.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: zyl
 * @Date: 2020/7/17 7:06
 */
@Data
@Table(name="cst_linkman")
@Entity
public class LinkMan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lkm_id")
    private Long lkmId;

    @Column(name="lkm_name")
    private String lkmName;

    @Column(name="lkm_gender")
    private String lkmGender;

    @Column(name = "lkm_phone")
    private String lkmPhone;

    @Column(name = "lkm_mobile")
    private String lkmMobile;

    @Column(name="lkm_email")
    private String lkmEmail;

    @Column(name="lkm_position")
    private String lmkPosition;

    @Column(name="lkm_memo")
    private String lkmMemo;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;
}
