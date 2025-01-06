package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClassExamMapper;
import com.ruoyi.system.domain.ClassExam;
import com.ruoyi.system.service.IClassExamService;

/**
 * 班级考试列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class ClassExamServiceImpl implements IClassExamService 
{
    @Autowired
    private ClassExamMapper classExamMapper;

    /**
     * 查询班级考试列表
     * 
     * @param id 班级考试列表主键
     * @return 班级考试列表
     */
    @Override
    public ClassExam selectClassExamById(Long id)
    {
        return classExamMapper.selectClassExamById(id);
    }

    /**
     * 查询班级考试列表列表
     * 
     * @param classExam 班级考试列表
     * @return 班级考试列表
     */
    @Override
    public List<ClassExam> selectClassExamList(ClassExam classExam)
    {
        return classExamMapper.selectClassExamList(classExam);
    }

    /**
     * 新增班级考试列表
     * 
     * @param classExam 班级考试列表
     * @return 结果
     */
    @Override
    public int insertClassExam(ClassExam classExam)
    {
        return classExamMapper.insertClassExam(classExam);
    }

    /**
     * 修改班级考试列表
     * 
     * @param classExam 班级考试列表
     * @return 结果
     */
    @Override
    public int updateClassExam(ClassExam classExam)
    {
        return classExamMapper.updateClassExam(classExam);
    }

    /**
     * 批量删除班级考试列表
     * 
     * @param ids 需要删除的班级考试列表主键
     * @return 结果
     */
    @Override
    public int deleteClassExamByIds(Long[] ids)
    {
        return classExamMapper.deleteClassExamByIds(ids);
    }

    /**
     * 删除班级考试列表信息
     * 
     * @param id 班级考试列表主键
     * @return 结果
     */
    @Override
    public int deleteClassExamById(Long id)
    {
        return classExamMapper.deleteClassExamById(id);
    }
}
