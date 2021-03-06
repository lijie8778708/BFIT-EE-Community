package com.bfit.bfitee.model;

import lombok.Data;

@Data
public class Question {

    private Long id;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private String description;

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
