package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ClassList;

/**
 * 班级列表Service接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface IClassListService 
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
     * 批量删除班级列表
     * 
     * @param names 需要删除的班级列表主键集合
     * @return 结果
     */
    public int deleteClassListByNames(String[] names);

    /**
     * 删除班级列表信息
     * 
     * @param name 班级列表主键
     * @return 结果
     */
    public int deleteClassListByName(String name);
}
