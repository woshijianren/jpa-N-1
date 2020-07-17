package name.ealen.entity;
//userDto

import lombok.Data;
import name.ealen.entity.Role;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 主键
    private Long id;
    // 创建者id
    private Long creator;
    // 创建时间
    private Date createDate;

    // 修改者id
    private Long updator;

    // 修改时间
    private Date updateDate;

    // 用户code
    private String userCode;

    // 用户名
    private String userName;

    // 账户
    private String userAccount;

    // 密码
    private String userPassword;

    // 用户电话
    private String userPhone;

    // 权限
    private String userRights;

    // 角色id
    private int roleId;

    // 区划code
    private String regionCode;

    // 状态,false 状态正常
    private Boolean status;

    //用户到期时间
    private Date finiteTime;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", insertable = false, updatable = false)
    private Role roles;


}


