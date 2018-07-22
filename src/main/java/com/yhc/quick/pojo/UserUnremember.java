package com.yhc.quick.pojo;

public class UserUnremember {
    private String userId;

    private String id;

    private Integer unrememberTimes;

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

    public Integer getUnrememberTimes() {
        return unrememberTimes;
    }

    public void setUnrememberTimes(Integer unrememberTimes) {
        this.unrememberTimes = unrememberTimes;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }
}