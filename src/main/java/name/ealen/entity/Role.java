package name.ealen.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

//roleDto
@Entity
@Table(name = "sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    // 主键
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // 创建者id
    private Long creator;

    // 创建时间
    private Date createDate;

    // 修改者id
    private Long updator;

    // 修改时间
    private Date updateDate;

    // 角色code
    @NotBlank(message = "角色code不能为空")
    private String roleCode;

    // 角色名
    @NotBlank(message = "角色名不能为空")
    private String roleName;

    // 权限
    private String roleRights;

    // 状态
    private Boolean status;
}