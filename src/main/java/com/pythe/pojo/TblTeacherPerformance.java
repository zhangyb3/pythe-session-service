package com.pythe.pojo;

import java.util.Date;

public class TblTeacherPerformance {
    private Long teacherId;

    private Date updated;

    private Integer status;

    private Integer level;

    private Integer score;

    private Integer lastMission;

    private String description;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastMission() {
        return lastMission;
    }

    public void setLastMission(Integer lastMission) {
        this.lastMission = lastMission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}