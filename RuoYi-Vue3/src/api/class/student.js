import request from '@/utils/request'

// 查询学生列表列表
export function listStudent(query) {
  return request({
    url: '/class/student/list',
    method: 'get',
    params: query
  })
}

// 查询学生列表详细
export function getStudent(id) {
  return request({
    url: '/class/student/' + id,
    method: 'get'
  })
}

// 新增学生列表
export function addStudent(data) {
  return request({
    url: '/class/student',
    method: 'post',
    data: data
  })
}

// 修改学生列表
export function updateStudent(data) {
  return request({
    url: '/class/student',
    method: 'put',
    data: data
  })
}

// 删除学生列表
export function delStudent(id) {
  return request({
    url: '/class/student/' + id,
    method: 'delete'
  })
}
