package com.bfit.bfitee.mapper;

import com.bfit.bfitee.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question(id, title, description, gmt_create, gmt_modified, creator, comment_count, view_count, like_count, tag) " +
            "values (#{id},#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tag})")
    void insert(Question question);

    @Select("select * from question")
    List<Question> list();
}
