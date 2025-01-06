package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ClassExam;

/**
 * 班级考试列表Service接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface IClassExamService 
{
    /**
     * 查询班级考试列表
     * 
     * @param id 班级考试列表主键
     * @return 班级考试列表
     */
    public ClassExam selectClassExamById(Long id);

    /**
     * 查询班级考试列表列表
     * 
     * @param classExam 班级考试列表
     * @return 班级考试列表集合
     */
    public List<ClassExam> selectClassExamList(ClassExam classExam);

    /**
     * 新增班级考试列表
     * 
     * @param classExam 班级考试列表
     * @return 结果
     */
    public int insertClassExam(ClassExam classExam);

    /**
     * 修改班级考试列表
     * 
     * @param classExam 班级考试列表
     * @return 结果
     */
    public int updateClassExam(ClassExam classExam);

    /**
     * 批量删除班级考试列表
     * 
     * @param ids 需要删除的班级考试列表主键集合
     * @return 结果
     */
    public int deleteClassExamByIds(Long[] ids);

    /**
     * 删除班级考试列表信息
     * 
     * @param id 班级考试列表主键
     * @return 结果
     */
    public int deleteClassExamById(Long id);
}
