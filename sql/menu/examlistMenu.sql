-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表', '1061', '1', 'examlist', 'exam/examlist/index', 1, 0, 'C', '0', '0', 'exam:examlist:list', '#', 'admin', sysdate(), '', null, '考试科目列表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'exam:examlist:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'exam:examlist:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'exam:examlist:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'exam:examlist:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考试科目列表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'exam:examlist:export',       '#', 'admin', sysdate(), '', null, '');