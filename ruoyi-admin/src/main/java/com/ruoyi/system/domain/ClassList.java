package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 班级列表对象 class_list
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public class ClassList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级代码 */
    @Excel(name = "班级代码")
    private String name;

    /** 班级人数 */
    @Excel(name = "班级人数")
    private Long number;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("number", getNumber())
            .toString();
    }
}
