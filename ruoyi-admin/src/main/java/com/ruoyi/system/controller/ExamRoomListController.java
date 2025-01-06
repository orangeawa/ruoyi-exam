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
import com.ruoyi.system.domain.ExamRoomList;
import com.ruoyi.system.service.IExamRoomListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考场列Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/exam/examroomlist")
public class ExamRoomListController extends BaseController
{
    @Autowired
    private IExamRoomListService examRoomListService;

    /**
     * 查询考场列列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamRoomList examRoomList)
    {
        startPage();
        List<ExamRoomList> list = examRoomListService.selectExamRoomListList(examRoomList);
        return getDataTable(list);
    }

    /**
     * 导出考场列列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:export')")
    @Log(title = "考场列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamRoomList examRoomList)
    {
        List<ExamRoomList> list = examRoomListService.selectExamRoomListList(examRoomList);
        ExcelUtil<ExamRoomList> util = new ExcelUtil<ExamRoomList>(ExamRoomList.class);
        util.exportExcel(response, list, "考场列数据");
    }

    /**
     * 获取考场列详细信息
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(examRoomListService.selectExamRoomListById(id));
    }

    /**
     * 新增考场列
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:add')")
    @Log(title = "考场列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamRoomList examRoomList)
    {
        return toAjax(examRoomListService.insertExamRoomList(examRoomList));
    }

    /**
     * 修改考场列
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:edit')")
    @Log(title = "考场列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamRoomList examRoomList)
    {
        return toAjax(examRoomListService.updateExamRoomList(examRoomList));
    }

    /**
     * 删除考场列
     */
    @PreAuthorize("@ss.hasPermi('exam:examroomlist:remove')")
    @Log(title = "考场列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(examRoomListService.deleteExamRoomListByIds(ids));
    }
}
