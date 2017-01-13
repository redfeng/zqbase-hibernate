package com.zqxx.system.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.zqxx.common.entity.BaseEntity;

@Entity  
@Table(name="sys_user")  
public class SysUser extends BaseEntity{  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @NotEmpty(message="用户名不能为空")  
    private String username;  
    @NotEmpty(message="密码不能为空")  
    private String password;  
    private String salt;	//密码盐值
    private String officeId; //机构id
    private String no;		// 工号
	private String name;	// 姓名
	private String email;	// 邮箱
	private String phone;	// 电话
	private String mobile;	// 手机
	private String userType;// 用户类型
	private String photo;	// 头像
	
	@ManyToMany  
    @JoinTable(name="t_user_role",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="role_id")})  
    private List<SysRole> roleList;//一个用户具有多个角色  
      
      
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	 public List<SysRole> getRoleList() {  
        return roleList;  
    }  
    public void setRoleList(List<SysRole> roleList) {  
        this.roleList = roleList;  
    }  
      
    @Transient  
    public Set<String> getRolesName(){  
        List<SysRole> roles=getRoleList();  
        Set<String> set=new HashSet<String>();  
        for (SysRole role : roles) {  
            set.add(role.getRolename());  
        }  
        return set;  
    }
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}  
      
}  
