package com.image.project.service.dubboimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.image.AiAccess.dev.dubbomodel.InterfaceInfo;
import com.image.AiAccess.dev.dubboservice.InnerInterfaceInfoService;
import com.image.project.common.ErrorCode;
import com.image.project.exception.BusinessException;
import com.image.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author JXY
 * @version 1.0
 * @since 2024/5/27
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        if (StringUtils.isAnyBlank(path, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("method", method).eq("url", path);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
