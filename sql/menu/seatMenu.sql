-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位', '1061', '1', 'seat', 'exam/seat/index', 1, 0, 'C', '0', '0', 'exam:seat:list', '#', 'admin', sysdate(), '', null, '考场座位菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'exam:seat:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'exam:seat:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'exam:seat:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'exam:seat:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考场座位导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'exam:seat:export',       '#', 'admin', sysdate(), '', null, '');