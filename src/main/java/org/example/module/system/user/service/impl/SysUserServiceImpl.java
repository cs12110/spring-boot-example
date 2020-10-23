package org.example.module.system.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.module.system.user.domain.SysUser;
import org.example.module.system.user.mapper.SysUserMapper;
import org.example.module.system.user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author linzhaoming
 * @since 2020-10-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public SysUser getUserByUserName(String userName) {
        return this.getOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getUserName, userName));
    }

}