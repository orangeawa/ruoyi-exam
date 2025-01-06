package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ClassList;

/**
 * 班级列表Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface ClassListMapper 
{
    /**
     * 查询班级列表
     * 
     * @param name 班级列表主键
     * @return 班级列表
     */
    public ClassList selectClassListByName(String name);

    /**
     * 查询班级列表列表
     * 
     * @param classList 班级列表
     * @return 班级列表集合
     */
    public List<ClassList> selectClassListList(ClassList classList);

    /**
     * 新增班级列表
     * 
     * @param classList 班级列表
     * @return 结果
     */
    public int insertClassList(ClassList classList);

    /**
     * 修改班级列表
     * 
     * @param classList 班级列表
     * @return 结果
     */
    public int updateClassList(ClassList classList);

    /**
     * 删除班级列表
     * 
     * @param name 班级列表主键
     * @return 结果
     */
    public int deleteClassListByName(String name);

    /**
     * 批量删除班级列表
     * 
     * @param names 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClassListByNames(String[] names);
}
