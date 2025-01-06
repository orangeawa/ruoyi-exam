package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ExamRoomSeatMapper;
import com.ruoyi.system.domain.ExamRoomSeat;
import com.ruoyi.system.service.IExamRoomSeatService;

/**
 * 考场座位Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@Service
public class ExamRoomSeatServiceImpl implements IExamRoomSeatService 
{
    @Autowired
    private ExamRoomSeatMapper examRoomSeatMapper;

    /**
     * 查询考场座位
     * 
     * @param id 考场座位主键
     * @return 考场座位
     */
    @Override
    public ExamRoomSeat selectExamRoomSeatById(Long id)
    {
        return examRoomSeatMapper.selectExamRoomSeatById(id);
    }

    /**
     * 查询考场座位列表
     * 
     * @param examRoomSeat 考场座位
     * @return 考场座位
     */
    @Override
    public List<ExamRoomSeat> selectExamRoomSeatList(ExamRoomSeat examRoomSeat)
    {
        return examRoomSeatMapper.selectExamRoomSeatList(examRoomSeat);
    }

    /**
     * 新增考场座位
     * 
     * @param examRoomSeat 考场座位
     * @return 结果
     */
    @Override
    public int insertExamRoomSeat(ExamRoomSeat examRoomSeat)
    {
        return examRoomSeatMapper.insertExamRoomSeat(examRoomSeat);
    }

    /**
     * 修改考场座位
     * 
     * @param examRoomSeat 考场座位
     * @return 结果
     */
    @Override
    public int updateExamRoomSeat(ExamRoomSeat examRoomSeat)
    {
        return examRoomSeatMapper.updateExamRoomSeat(examRoomSeat);
    }

    /**
     * 批量删除考场座位
     * 
     * @param ids 需要删除的考场座位主键
     * @return 结果
     */
    @Override
    public int deleteExamRoomSeatByIds(Long[] ids)
    {
        return examRoomSeatMapper.deleteExamRoomSeatByIds(ids);
    }

    /**
     * 删除考场座位信息
     * 
     * @param id 考场座位主键
     * @return 结果
     */
    @Override
    public int deleteExamRoomSeatById(Long id)
    {
        return examRoomSeatMapper.deleteExamRoomSeatById(id);
    }
}
