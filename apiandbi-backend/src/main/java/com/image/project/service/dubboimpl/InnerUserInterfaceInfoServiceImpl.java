package com.image.project.service.dubboimpl;

import com.image.AiAccess.dev.dubbomodel.UserInterfaceInfo;
import com.image.AiAccess.dev.dubboservice.InnerUserInterfaceInfoService;
import com.image.project.service.impl.UserInterfaceInfoServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author JXY
 * @version 1.0
 * @since 2024/5/27
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoServiceImpl userInterfaceInfoService;

    @Override
    public Boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public UserInterfaceInfo getUserInterfaceInfo(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.getUserInterfaceInfo(interfaceInfoId, userId);
    }
}
