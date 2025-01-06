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
import com.ruoyi.system.domain.ExamList;
import com.ruoyi.system.service.IExamListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考试科目列表Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/exam/examlist")
public class ExamListController extends BaseController
{
    @Autowired
    private IExamListService examListService;

    /**
     * 查询考试科目列表列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamList examList)
    {
        startPage();
        List<ExamList> list = examListService.selectExamListList(examList);
        return getDataTable(list);
    }

    /**
     * 导出考试科目列表列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:export')")
    @Log(title = "考试科目列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamList examList)
    {
        List<ExamList> list = examListService.selectExamListList(examList);
        ExcelUtil<ExamList> util = new ExcelUtil<ExamList>(ExamList.class);
        util.exportExcel(response, list, "考试科目列表数据");
    }

    /**
     * 获取考试科目列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(examListService.selectExamListById(id));
    }

    /**
     * 新增考试科目列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:add')")
    @Log(title = "考试科目列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamList examList)
    {
        return toAjax(examListService.insertExamList(examList));
    }

    /**
     * 修改考试科目列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:edit')")
    @Log(title = "考试科目列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamList examList)
    {
        return toAjax(examListService.updateExamList(examList));
    }

    /**
     * 删除考试科目列表
     */
    @PreAuthorize("@ss.hasPermi('exam:examlist:remove')")
    @Log(title = "考试科目列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(examListService.deleteExamListByIds(ids));
    }
}
