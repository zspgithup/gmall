/**
 * 描述：
 *
 * @author zhangshupeng
 * @crate 2019-10-13 17:11
 */
package com.zhang.gmall.user.service.imp;

import com.zhang.gmall.user.bean.UmsMember;
import com.zhang.gmall.user.mapper.UserMapper;
import com.zhang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }
}
