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
import com.ruoyi.system.domain.ClassList;
import com.ruoyi.system.service.IClassListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班级列表Controller
 * 
 * @author ruoyi
 * @date 2025-01-06
 */
@RestController
@RequestMapping("/class/clist")
public class ClassListController extends BaseController
{
    @Autowired
    private IClassListService classListService;

    /**
     * 查询班级列表列表
     */
    @PreAuthorize("@ss.hasPermi('class:clist:list')")
    @GetMapping("/list")
    public TableDataInfo list(ClassList classList)
    {
        startPage();
        List<ClassList> list = classListService.selectClassListList(classList);
        return getDataTable(list);
    }

    /**
     * 导出班级列表列表
     */
    @PreAuthorize("@ss.hasPermi('class:clist:export')")
    @Log(title = "班级列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ClassList classList)
    {
        List<ClassList> list = classListService.selectClassListList(classList);
        ExcelUtil<ClassList> util = new ExcelUtil<ClassList>(ClassList.class);
        util.exportExcel(response, list, "班级列表数据");
    }

    /**
     * 获取班级列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('class:clist:query')")
    @GetMapping(value = "/{name}")
    public AjaxResult getInfo(@PathVariable("name") String name)
    {
        return success(classListService.selectClassListByName(name));
    }

    /**
     * 新增班级列表
     */
    @PreAuthorize("@ss.hasPermi('class:clist:add')")
    @Log(title = "班级列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ClassList classList)
    {
        return toAjax(classListService.insertClassList(classList));
    }

    /**
     * 修改班级列表
     */
    @PreAuthorize("@ss.hasPermi('class:clist:edit')")
    @Log(title = "班级列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ClassList classList)
    {
        return toAjax(classListService.updateClassList(classList));
    }

    /**
     * 删除班级列表
     */
    @PreAuthorize("@ss.hasPermi('class:clist:remove')")
    @Log(title = "班级列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{names}")
    public AjaxResult remove(@PathVariable String[] names)
    {
        return toAjax(classListService.deleteClassListByNames(names));
    }
}
