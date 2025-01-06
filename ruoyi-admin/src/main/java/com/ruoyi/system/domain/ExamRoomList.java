package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考场列对象 exam_room_list
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public class ExamRoomList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 考场唯一id */
    private Long id;

    /** 考场名称 */
    @Excel(name = "考场名称")
    private String name;

    /** 考场容量 */
    @Excel(name = "考场容量")
    private Long capacity;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCapacity(Long capacity) 
    {
        this.capacity = capacity;
    }

    public Long getCapacity() 
    {
        return capacity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("capacity", getCapacity())
            .toString();
    }
}
