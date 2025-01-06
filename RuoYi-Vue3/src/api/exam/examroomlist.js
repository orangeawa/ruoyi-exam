import request from '@/utils/request'

// 查询考场列列表
export function listExamroomlist(query) {
  return request({
    url: '/exam/examroomlist/list',
    method: 'get',
    params: query
  })
}

// 查询考场列详细
export function getExamroomlist(id) {
  return request({
    url: '/exam/examroomlist/' + id,
    method: 'get'
  })
}

// 新增考场列
export function addExamroomlist(data) {
  return request({
    url: '/exam/examroomlist',
    method: 'post',
    data: data
  })
}

// 修改考场列
export function updateExamroomlist(data) {
  return request({
    url: '/exam/examroomlist',
    method: 'put',
    data: data
  })
}

// 删除考场列
export function delExamroomlist(id) {
  return request({
    url: '/exam/examroomlist/' + id,
    method: 'delete'
  })
}
