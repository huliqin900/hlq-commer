package com.commer.app.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer id;

    private Long usernumber;

    private String username;

    private String password;

    private Long classid;

    private Integer credit;

    private Integer identity;

    private String imageurl;

    private Integer sex;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(Long usernumber) {
        this.usernumber = usernumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", usernumber=" + usernumber + ", username=" + username + ", password=" + password
				+ ", classid=" + classid + ", credit=" + credit + ", identity=" + identity + ", imageurl=" + imageurl
				+ ", sex=" + sex + ", createtime=" + createtime + "]";
	}
}
