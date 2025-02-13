package com.image.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.image.AiAccess.dev.dubbomodel.UserInterfaceInfo;

import java.util.List;

/**
* @author 86187
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2024-05-25 00:26:47
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




