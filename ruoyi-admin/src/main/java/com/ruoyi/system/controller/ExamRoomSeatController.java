package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ExamRoomSeat;
import com.ruoyi.system.service.IExamRoomSeatService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考场座位Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/exam/seat")
public class ExamRoomSeatController extends BaseController
{
    @Autowired
    private IExamRoomSeatService examRoomSeatService;

    /**
     * 查询考场座位列表
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamRoomSeat examRoomSeat)
    {
        startPage();
        List<ExamRoomSeat> list = examRoomSeatService.selectExamRoomSeatList(examRoomSeat);
        return getDataTable(list);
    }

    /**
     * 导出考场座位列表
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:export')")
    @Log(title = "考场座位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamRoomSeat examRoomSeat)
    {
        List<ExamRoomSeat> list = examRoomSeatService.selectExamRoomSeatList(examRoomSeat);
        ExcelUtil<ExamRoomSeat> util = new ExcelUtil<ExamRoomSeat>(ExamRoomSeat.class);
        util.exportExcel(response, list, "考场座位数据");
    }

    /**
     * 获取考场座位详细信息
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(examRoomSeatService.selectExamRoomSeatById(id));
    }

    /**
     * 新增考场座位
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:add')")
    @Log(title = "考场座位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamRoomSeat examRoomSeat)
    {
        return toAjax(examRoomSeatService.insertExamRoomSeat(examRoomSeat));
    }

    /**
     * 修改考场座位
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:edit')")
    @Log(title = "考场座位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamRoomSeat examRoomSeat)
    {
        return toAjax(examRoomSeatService.updateExamRoomSeat(examRoomSeat));
    }

    /**
     * 删除考场座位
     */
    @PreAuthorize("@ss.hasPermi('exam:seat:remove')")
    @Log(title = "考场座位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(examRoomSeatService.deleteExamRoomSeatByIds(ids));
    }
}
