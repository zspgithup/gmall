/**
 * 描述：
 *
 * @author zhangshupeng
 * @crate 2019-10-13 17:11
 */
package com.zhang.gmall.user.mapper;

import com.zhang.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();

}
