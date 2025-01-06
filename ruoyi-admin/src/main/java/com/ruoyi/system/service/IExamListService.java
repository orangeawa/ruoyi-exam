package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ExamList;

/**
 * 考试科目列表Service接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface IExamListService 
{
    /**
     * 查询考试科目列表
     * 
     * @param id 考试科目列表主键
     * @return 考试科目列表
     */
    public ExamList selectExamListById(Long id);

    /**
     * 查询考试科目列表列表
     * 
     * @param examList 考试科目列表
     * @return 考试科目列表集合
     */
    public List<ExamList> selectExamListList(ExamList examList);

    /**
     * 新增考试科目列表
     * 
     * @param examList 考试科目列表
     * @return 结果
     */
    public int insertExamList(ExamList examList);

    /**
     * 修改考试科目列表
     * 
     * @param examList 考试科目列表
     * @return 结果
     */
    public int updateExamList(ExamList examList);

    /**
     * 批量删除考试科目列表
     * 
     * @param ids 需要删除的考试科目列表主键集合
     * @return 结果
     */
    public int deleteExamListByIds(Long[] ids);

    /**
     * 删除考试科目列表信息
     * 
     * @param id 考试科目列表主键
     * @return 结果
     */
    public int deleteExamListById(Long id);
}
