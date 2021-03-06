package com.education.system.mapper;

import com.education.system.entity.StudentTranscript;
import com.education.system.entity.StudentTranscriptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTranscriptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int countByExample(StudentTranscriptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int deleteByExample(StudentTranscriptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int insert(StudentTranscript record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int insertSelective(StudentTranscript record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    List<StudentTranscript> selectByExample(StudentTranscriptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StudentTranscript record, @Param("example") StudentTranscriptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_transcript
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StudentTranscript record, @Param("example") StudentTranscriptExample example);
}