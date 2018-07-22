package com.yhc.quick.pojo;

public class UserRemember {
    private String userId;

    private String id;

    private Integer rememberTimes;

    private String topicId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getRememberTimes() {
        return rememberTimes;
    }

    public void setRememberTimes(Integer rememberTimes) {
        this.rememberTimes = rememberTimes;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }
}