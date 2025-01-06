import request from '@/utils/request'

// 查询班级列表列表
export function listClist(query) {
  return request({
    url: '/class/clist/list',
    method: 'get',
    params: query
  })
}

// 查询班级列表详细
export function getClist(name) {
  return request({
    url: '/class/clist/' + name,
    method: 'get'
  })
}

// 新增班级列表
export function addClist(data) {
  return request({
    url: '/class/clist',
    method: 'post',
    data: data
  })
}

// 修改班级列表
export function updateClist(data) {
  return request({
    url: '/class/clist',
    method: 'put',
    data: data
  })
}

// 删除班级列表
export function delClist(name) {
  return request({
    url: '/class/clist/' + name,
    method: 'delete'
  })
}
