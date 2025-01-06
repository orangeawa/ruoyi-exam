import request from '@/utils/request'

// 查询班级考试列表列表
export function listClassAndExam(query) {
  return request({
    url: '/exam/classAndExam/list',
    method: 'get',
    params: query
  })
}

// 查询班级考试列表详细
export function getClassAndExam(id) {
  return request({
    url: '/exam/classAndExam/' + id,
    method: 'get'
  })
}

// 新增班级考试列表
export function addClassAndExam(data) {
  return request({
    url: '/exam/classAndExam',
    method: 'post',
    data: data
  })
}

// 修改班级考试列表
export function updateClassAndExam(data) {
  return request({
    url: '/exam/classAndExam',
    method: 'put',
    data: data
  })
}

// 删除班级考试列表
export function delClassAndExam(id) {
  return request({
    url: '/exam/classAndExam/' + id,
    method: 'delete'
  })
}
