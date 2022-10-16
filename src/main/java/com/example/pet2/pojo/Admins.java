package com.example.pet2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName admins
 */
@TableName(value ="admins")
public class Admins implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员的名字
     */
    private String adminname;

    /**
     * 密码
     */
    private String adminpwd;

    /**
     * 真实的名字
     */
    private String realname;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String birthday;

    /**
     * 
     */
    private String sex;

    /**
     * 头像
     */
    private String pic;

    /**
     * 评论，介绍
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 管理员的名字
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * 管理员的名字
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    /**
     * 密码
     */
    public String getAdminpwd() {
        return adminpwd;
    }

    /**
     * 密码
     */
    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }

    /**
     * 真实的名字
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 真实的名字
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     */
    public String getSex() {
        return sex;
    }

    /**
     * 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Admins other = (Admins) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdminname() == null ? other.getAdminname() == null : this.getAdminname().equals(other.getAdminname()))
            && (this.getAdminpwd() == null ? other.getAdminpwd() == null : this.getAdminpwd().equals(other.getAdminpwd()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdminname() == null) ? 0 : getAdminname().hashCode());
        result = prime * result + ((getAdminpwd() == null) ? 0 : getAdminpwd().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminname=").append(adminname);
        sb.append(", adminpwd=").append(adminpwd);
        sb.append(", realname=").append(realname);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", pic=").append(pic);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}