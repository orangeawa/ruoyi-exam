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
import com.ruoyi.system.domain.ClassExam;
import com.ruoyi.system.service.IClassExamService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班级考试列表Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/exam/classAndExam")
public class ClassExamController extends BaseController
{
    @Autowired
    private IClassExamService classExamService;

    /**
     * 查询班级考试列表列表
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:list')")
    @GetMapping("/list")
    public TableDataInfo list(ClassExam classExam)
    {
        startPage();
        List<ClassExam> list = classExamService.selectClassExamList(classExam);
        return getDataTable(list);
    }

    /**
     * 导出班级考试列表列表
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:export')")
    @Log(title = "班级考试列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ClassExam classExam)
    {
        List<ClassExam> list = classExamService.selectClassExamList(classExam);
        ExcelUtil<ClassExam> util = new ExcelUtil<ClassExam>(ClassExam.class);
        util.exportExcel(response, list, "班级考试列表数据");
    }

    /**
     * 获取班级考试列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(classExamService.selectClassExamById(id));
    }

    /**
     * 新增班级考试列表
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:add')")
    @Log(title = "班级考试列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ClassExam classExam)
    {
        return toAjax(classExamService.insertClassExam(classExam));
    }

    /**
     * 修改班级考试列表
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:edit')")
    @Log(title = "班级考试列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ClassExam classExam)
    {
        return toAjax(classExamService.updateClassExam(classExam));
    }

    /**
     * 删除班级考试列表
     */
    @PreAuthorize("@ss.hasPermi('exam:classAndExam:remove')")
    @Log(title = "班级考试列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(classExamService.deleteClassExamByIds(ids));
    }
}
