package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ExamRoomList;

/**
 * 考场列Service接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface IExamRoomListService 
{
    /**
     * 查询考场列
     * 
     * @param id 考场列主键
     * @return 考场列
     */
    public ExamRoomList selectExamRoomListById(Long id);

    /**
     * 查询考场列列表
     * 
     * @param examRoomList 考场列
     * @return 考场列集合
     */
    public List<ExamRoomList> selectExamRoomListList(ExamRoomList examRoomList);

    /**
     * 新增考场列
     * 
     * @param examRoomList 考场列
     * @return 结果
     */
    public int insertExamRoomList(ExamRoomList examRoomList);

    /**
     * 修改考场列
     * 
     * @param examRoomList 考场列
     * @return 结果
     */
    public int updateExamRoomList(ExamRoomList examRoomList);

    /**
     * 批量删除考场列
     * 
     * @param ids 需要删除的考场列主键集合
     * @return 结果
     */
    public int deleteExamRoomListByIds(Long[] ids);

    /**
     * 删除考场列信息
     * 
     * @param id 考场列主键
     * @return 结果
     */
    public int deleteExamRoomListById(Long id);
}
