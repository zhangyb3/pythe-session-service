package com.pythe.pojo;

import java.util.Date;

public class TblTeacher {
    private Long teacherId;

    private String username;

    private String userimg;

    private String password;

    private String phonenum;

    private Integer gradeid;

    private String mnp1Openid;

    private Date created;

    private Date updated;

    private String openid;

    private Integer status;

    private String knowlegespace;

    private Integer level;

    private String unionId;

    private String idCode;

    private String idImg;

    private String teacherCertificateImg;

    private String incumbencyImg;

    private String diploma;

    private Integer gender;

    private String organization;

    private String description;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getMnp1Openid() {
        return mnp1Openid;
    }

    public void setMnp1Openid(String mnp1Openid) {
        this.mnp1Openid = mnp1Openid == null ? null : mnp1Openid.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKnowlegespace() {
        return knowlegespace;
    }

    public void setKnowlegespace(String knowlegespace) {
        this.knowlegespace = knowlegespace == null ? null : knowlegespace.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getIdImg() {
        return idImg;
    }

    public void setIdImg(String idImg) {
        this.idImg = idImg == null ? null : idImg.trim();
    }

    public String getTeacherCertificateImg() {
        return teacherCertificateImg;
    }

    public void setTeacherCertificateImg(String teacherCertificateImg) {
        this.teacherCertificateImg = teacherCertificateImg == null ? null : teacherCertificateImg.trim();
    }

    public String getIncumbencyImg() {
        return incumbencyImg;
    }

    public void setIncumbencyImg(String incumbencyImg) {
        this.incumbencyImg = incumbencyImg == null ? null : incumbencyImg.trim();
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma == null ? null : diploma.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}