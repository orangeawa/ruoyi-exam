package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClassListMapper;
import com.ruoyi.system.domain.ClassList;
import com.ruoyi.system.service.IClassListService;

/**
 * 班级列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class ClassListServiceImpl implements IClassListService 
{
    @Autowired
    private ClassListMapper classListMapper;

    /**
     * 查询班级列表
     * 
     * @param name 班级列表主键
     * @return 班级列表
     */
    @Override
    public ClassList selectClassListByName(String name)
    {
        return classListMapper.selectClassListByName(name);
    }

    /**
     * 查询班级列表列表
     * 
     * @param classList 班级列表
     * @return 班级列表
     */
    @Override
    public List<ClassList> selectClassListList(ClassList classList)
    {
        return classListMapper.selectClassListList(classList);
    }

    /**
     * 新增班级列表
     * 
     * @param classList 班级列表
     * @return 结果
     */
    @Override
    public int insertClassList(ClassList classList)
    {
        return classListMapper.insertClassList(classList);
    }

    /**
     * 修改班级列表
     * 
     * @param classList 班级列表
     * @return 结果
     */
    @Override
    public int updateClassList(ClassList classList)
    {
        return classListMapper.updateClassList(classList);
    }

    /**
     * 批量删除班级列表
     * 
     * @param names 需要删除的班级列表主键
     * @return 结果
     */
    @Override
    public int deleteClassListByNames(String[] names)
    {
        return classListMapper.deleteClassListByNames(names);
    }

    /**
     * 删除班级列表信息
     * 
     * @param name 班级列表主键
     * @return 结果
     */
    @Override
    public int deleteClassListByName(String name)
    {
        return classListMapper.deleteClassListByName(name);
    }
}
