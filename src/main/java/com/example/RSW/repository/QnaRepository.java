package com.example.RSW.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.RSW.vo.Qna;

@Mapper
public interface QnaRepository {
    Qna findBySimilarQuestion(@Param("inputText") String inputText);
}
