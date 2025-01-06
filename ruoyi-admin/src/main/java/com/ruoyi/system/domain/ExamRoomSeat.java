package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考场座位对象 exam_room_seat
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public class ExamRoomSeat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 座位唯一id */
    private Long id;

    /** 考场id */
    @Excel(name = "考场id")
    private Long examRoomId;

    /** 座位号 */
    @Excel(name = "座位号")
    private Long seatNumber;

    /** 学生id */
    @Excel(name = "学生id")
    private Long studentId;

    /** 考试id */
    @Excel(name = "考试id")
    private Long examId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExamRoomId(Long examRoomId) 
    {
        this.examRoomId = examRoomId;
    }

    public Long getExamRoomId() 
    {
        return examRoomId;
    }
    public void setSeatNumber(Long seatNumber) 
    {
        this.seatNumber = seatNumber;
    }

    public Long getSeatNumber() 
    {
        return seatNumber;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setExamId(Long examId) 
    {
        this.examId = examId;
    }

    public Long getExamId() 
    {
        return examId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("examRoomId", getExamRoomId())
            .append("seatNumber", getSeatNumber())
            .append("studentId", getStudentId())
            .append("examId", getExamId())
            .toString();
    }
}
