package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ExamRoomSeat;

/**
 * 考场座位Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
public interface ExamRoomSeatMapper 
{
    /**
     * 查询考场座位
     * 
     * @param id 考场座位主键
     * @return 考场座位
     */
    public ExamRoomSeat selectExamRoomSeatById(Long id);

    /**
     * 查询考场座位列表
     * 
     * @param examRoomSeat 考场座位
     * @return 考场座位集合
     */
    public List<ExamRoomSeat> selectExamRoomSeatList(ExamRoomSeat examRoomSeat);

    /**
     * 新增考场座位
     * 
     * @param examRoomSeat 考场座位
     * @return 结果
     */
    public int insertExamRoomSeat(ExamRoomSeat examRoomSeat);

    /**
     * 修改考场座位
     * 
     * @param examRoomSeat 考场座位
     * @return 结果
     */
    public int updateExamRoomSeat(ExamRoomSeat examRoomSeat);

    /**
     * 删除考场座位
     * 
     * @param id 考场座位主键
     * @return 结果
     */
    public int deleteExamRoomSeatById(Long id);

    /**
     * 批量删除考场座位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamRoomSeatByIds(Long[] ids);
}
