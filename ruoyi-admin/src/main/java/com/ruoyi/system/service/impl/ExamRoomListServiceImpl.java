package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ExamRoomListMapper;
import com.ruoyi.system.domain.ExamRoomList;
import com.ruoyi.system.service.IExamRoomListService;

/**
 * 考场列Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class ExamRoomListServiceImpl implements IExamRoomListService 
{
    @Autowired
    private ExamRoomListMapper examRoomListMapper;

    /**
     * 查询考场列
     * 
     * @param id 考场列主键
     * @return 考场列
     */
    @Override
    public ExamRoomList selectExamRoomListById(Long id)
    {
        return examRoomListMapper.selectExamRoomListById(id);
    }

    /**
     * 查询考场列列表
     * 
     * @param examRoomList 考场列
     * @return 考场列
     */
    @Override
    public List<ExamRoomList> selectExamRoomListList(ExamRoomList examRoomList)
    {
        return examRoomListMapper.selectExamRoomListList(examRoomList);
    }

    /**
     * 新增考场列
     * 
     * @param examRoomList 考场列
     * @return 结果
     */
    @Override
    public int insertExamRoomList(ExamRoomList examRoomList)
    {
        return examRoomListMapper.insertExamRoomList(examRoomList);
    }

    /**
     * 修改考场列
     * 
     * @param examRoomList 考场列
     * @return 结果
     */
    @Override
    public int updateExamRoomList(ExamRoomList examRoomList)
    {
        return examRoomListMapper.updateExamRoomList(examRoomList);
    }

    /**
     * 批量删除考场列
     * 
     * @param ids 需要删除的考场列主键
     * @return 结果
     */
    @Override
    public int deleteExamRoomListByIds(Long[] ids)
    {
        return examRoomListMapper.deleteExamRoomListByIds(ids);
    }

    /**
     * 删除考场列信息
     * 
     * @param id 考场列主键
     * @return 结果
     */
    @Override
    public int deleteExamRoomListById(Long id)
    {
        return examRoomListMapper.deleteExamRoomListById(id);
    }
}
