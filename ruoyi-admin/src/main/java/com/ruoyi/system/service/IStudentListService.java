package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StudentList;

/**
 * 学生列表Service接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface IStudentListService 
{
    /**
     * 查询学生列表
     * 
     * @param id 学生列表主键
     * @return 学生列表
     */
    public StudentList selectStudentListById(Long id);

    /**
     * 查询学生列表列表
     * 
     * @param studentList 学生列表
     * @return 学生列表集合
     */
    public List<StudentList> selectStudentListList(StudentList studentList);

    /**
     * 新增学生列表
     * 
     * @param studentList 学生列表
     * @return 结果
     */
    public int insertStudentList(StudentList studentList);

    /**
     * 修改学生列表
     * 
     * @param studentList 学生列表
     * @return 结果
     */
    public int updateStudentList(StudentList studentList);

    /**
     * 批量删除学生列表
     * 
     * @param ids 需要删除的学生列表主键集合
     * @return 结果
     */
    public int deleteStudentListByIds(Long[] ids);

    /**
     * 删除学生列表信息
     * 
     * @param id 学生列表主键
     * @return 结果
     */
    public int deleteStudentListById(Long id);
}
