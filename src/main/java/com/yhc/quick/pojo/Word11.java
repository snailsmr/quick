package com.yhc.quick.pojo;

public class Word11 {
    private String id;

    private String word;

    private String topicId;

    private String phon;

    private String pron;

    private String para;

    private String build;

    private String example;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon == null ? null : phon.trim();
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String pron) {
        this.pron = pron == null ? null : pron.trim();
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para == null ? null : para.trim();
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build == null ? null : build.trim();
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example == null ? null : example.trim();
    }
}