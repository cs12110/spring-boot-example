package org.example.module.system.resource.controller;

import org.example.common.base.BaseController;
import org.example.common.domain.entity.Router;
import org.example.common.domain.response.Result;
import org.example.module.system.resource.domain.entity.SysResource;
import org.example.module.system.resource.mapper.SysResourceMapper;
import org.example.module.system.resource.service.impl.SysResourceServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统资源 前端控制器
 * </p>
 *
 * @author linzhaoming
 * @since 2020-11-02
 */
@RestController
@RequestMapping("/sys/resource")
public class SysResourceController extends BaseController<SysResourceServiceImpl, SysResourceMapper, SysResource> {

    @GetMapping("/routers")
    public Result getRouters() {
        List<Router> routerList = getBaseService().listRouterByUsername(getCurrentUsername());
        return Result.success(routerList);
    }

}
