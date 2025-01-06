package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ExamListMapper;
import com.ruoyi.system.domain.ExamList;
import com.ruoyi.system.service.IExamListService;

/**
 * 考试科目列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class ExamListServiceImpl implements IExamListService 
{
    @Autowired
    private ExamListMapper examListMapper;

    /**
     * 查询考试科目列表
     * 
     * @param id 考试科目列表主键
     * @return 考试科目列表
     */
    @Override
    public ExamList selectExamListById(Long id)
    {
        return examListMapper.selectExamListById(id);
    }

    /**
     * 查询考试科目列表列表
     * 
     * @param examList 考试科目列表
     * @return 考试科目列表
     */
    @Override
    public List<ExamList> selectExamListList(ExamList examList)
    {
        return examListMapper.selectExamListList(examList);
    }

    /**
     * 新增考试科目列表
     * 
     * @param examList 考试科目列表
     * @return 结果
     */
    @Override
    public int insertExamList(ExamList examList)
    {
        return examListMapper.insertExamList(examList);
    }

    /**
     * 修改考试科目列表
     * 
     * @param examList 考试科目列表
     * @return 结果
     */
    @Override
    public int updateExamList(ExamList examList)
    {
        return examListMapper.updateExamList(examList);
    }

    /**
     * 批量删除考试科目列表
     * 
     * @param ids 需要删除的考试科目列表主键
     * @return 结果
     */
    @Override
    public int deleteExamListByIds(Long[] ids)
    {
        return examListMapper.deleteExamListByIds(ids);
    }

    /**
     * 删除考试科目列表信息
     * 
     * @param id 考试科目列表主键
     * @return 结果
     */
    @Override
    public int deleteExamListById(Long id)
    {
        return examListMapper.deleteExamListById(id);
    }
}
