package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 班级考试列表对象 class_exam
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public class ClassExam extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级与考试关联唯一id */
    private Long id;

    /** 班级代码 */
    @Excel(name = "班级代码")
    private String className;

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
    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
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
            .append("className", getClassName())
            .append("examId", getExamId())
            .toString();
    }
}
