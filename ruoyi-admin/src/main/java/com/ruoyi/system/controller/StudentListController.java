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
import com.ruoyi.system.domain.StudentList;
import com.ruoyi.system.service.IStudentListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生列表Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/class/student")
public class StudentListController extends BaseController
{
    @Autowired
    private IStudentListService studentListService;

    /**
     * 查询学生列表列表
     */
    @PreAuthorize("@ss.hasPermi('class:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(StudentList studentList)
    {
        startPage();
        List<StudentList> list = studentListService.selectStudentListList(studentList);
        return getDataTable(list);
    }

    /**
     * 导出学生列表列表
     */
    @PreAuthorize("@ss.hasPermi('class:student:export')")
    @Log(title = "学生列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StudentList studentList)
    {
        List<StudentList> list = studentListService.selectStudentListList(studentList);
        ExcelUtil<StudentList> util = new ExcelUtil<StudentList>(StudentList.class);
        util.exportExcel(response, list, "学生列表数据");
    }

    /**
     * 获取学生列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('class:student:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(studentListService.selectStudentListById(id));
    }

    /**
     * 新增学生列表
     */
    @PreAuthorize("@ss.hasPermi('class:student:add')")
    @Log(title = "学生列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StudentList studentList)
    {
        return toAjax(studentListService.insertStudentList(studentList));
    }

    /**
     * 修改学生列表
     */
    @PreAuthorize("@ss.hasPermi('class:student:edit')")
    @Log(title = "学生列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StudentList studentList)
    {
        return toAjax(studentListService.updateStudentList(studentList));
    }

    /**
     * 删除学生列表
     */
    @PreAuthorize("@ss.hasPermi('class:student:remove')")
    @Log(title = "学生列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(studentListService.deleteStudentListByIds(ids));
    }
}
