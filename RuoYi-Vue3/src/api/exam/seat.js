import request from '@/utils/request'

// 查询考场座位列表
export function listSeat(query) {
  return request({
    url: '/exam/seat/list',
    method: 'get',
    params: query
  })
}

// 查询考场座位详细
export function getSeat(id) {
  return request({
    url: '/exam/seat/' + id,
    method: 'get'
  })
}

// 新增考场座位
export function addSeat(data) {
  return request({
    url: '/exam/seat',
    method: 'post',
    data: data
  })
}

// 修改考场座位
export function updateSeat(data) {
  return request({
    url: '/exam/seat',
    method: 'put',
    data: data
  })
}

// 删除考场座位
export function delSeat(id) {
  return request({
    url: '/exam/seat/' + id,
    method: 'delete'
  })
}
