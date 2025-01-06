import request from '@/utils/request'

// 查询考试科目列表列表
export function listExamlist(query) {
  return request({
    url: '/exam/examlist/list',
    method: 'get',
    params: query
  })
}

// 查询考试科目列表详细
export function getExamlist(id) {
  return request({
    url: '/exam/examlist/' + id,
    method: 'get'
  })
}

// 新增考试科目列表
export function addExamlist(data) {
  return request({
    url: '/exam/examlist',
    method: 'post',
    data: data
  })
}

// 修改考试科目列表
export function updateExamlist(data) {
  return request({
    url: '/exam/examlist',
    method: 'put',
    data: data
  })
}

// 删除考试科目列表
export function delExamlist(id) {
  return request({
    url: '/exam/examlist/' + id,
    method: 'delete'
  })
}
