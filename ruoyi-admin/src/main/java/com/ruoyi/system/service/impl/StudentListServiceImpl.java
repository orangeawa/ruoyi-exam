package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentListMapper;
import com.ruoyi.system.domain.StudentList;
import com.ruoyi.system.service.IStudentListService;

/**
 * 学生列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class StudentListServiceImpl implements IStudentListService 
{
    @Autowired
    private StudentListMapper studentListMapper;

    /**
     * 查询学生列表
     * 
     * @param id 学生列表主键
     * @return 学生列表
     */
    @Override
    public StudentList selectStudentListById(Long id)
    {
        return studentListMapper.selectStudentListById(id);
    }

    /**
     * 查询学生列表列表
     * 
     * @param studentList 学生列表
     * @return 学生列表
     */
    @Override
    public List<StudentList> selectStudentListList(StudentList studentList)
    {
        return studentListMapper.selectStudentListList(studentList);
    }

    /**
     * 新增学生列表
     * 
     * @param studentList 学生列表
     * @return 结果
     */
    @Override
    public int insertStudentList(StudentList studentList)
    {
        return studentListMapper.insertStudentList(studentList);
    }

    /**
     * 修改学生列表
     * 
     * @param studentList 学生列表
     * @return 结果
     */
    @Override
    public int updateStudentList(StudentList studentList)
    {
        return studentListMapper.updateStudentList(studentList);
    }

    /**
     * 批量删除学生列表
     * 
     * @param ids 需要删除的学生列表主键
     * @return 结果
     */
    @Override
    public int deleteStudentListByIds(Long[] ids)
    {
        return studentListMapper.deleteStudentListByIds(ids);
    }

    /**
     * 删除学生列表信息
     * 
     * @param id 学生列表主键
     * @return 结果
     */
    @Override
    public int deleteStudentListById(Long id)
    {
        return studentListMapper.deleteStudentListById(id);
    }
}
