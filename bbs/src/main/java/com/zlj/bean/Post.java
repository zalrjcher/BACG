package com.zlj.bean;

import java.util.Date;

/**
 * @author zlj
 * @introduce
 */
public class Post {
    private int id ;
    private String title;
    private int userId;
    private Date careateTime;
    private String replyNum;

    public Date getCareateTime() {
        return careateTime;
    }

    public void setCareateTime(Date careateTime) {
        this.careateTime = careateTime;
    }

    public String getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(String replyNum) {
        this.replyNum = replyNum;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", careateTime=" + careateTime +
                ", replyNum='" + replyNum + '\'' +
                '}';
    }
}
