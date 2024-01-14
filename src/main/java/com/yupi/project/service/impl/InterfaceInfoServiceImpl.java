package com.yupi.project.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.project.common.ErrorCode;
import com.yupi.project.exception.BusinessException;
import com.yupi.project.mapper.InterfaceInfoMapper;
import com.yupi.project.service.InterfaceInfoService;
import com.yupi.yuapicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 接口信息服务实现类
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * @from <a href="https://booboil.top">booboil</a>
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        //自动生成校验
//     Long id = interfaceInfo.getId();
//     String name = interfaceInfo.getName();
//     String description = interfaceInfo.getDescription();
//     String url = interfaceInfo.getUrl();
//     String requestParams = interfaceInfo.getRequestParams();
//     String requestHeader = interfaceInfo.getRequestHeader();
//     String responseHeader = interfaceInfo.getResponseHeader();
//     Integer status = interfaceInfo.getStatus();
//     String method = interfaceInfo.getMethod();
//     Long userId = interfaceInfo.getUserId();
//     Date createTime = interfaceInfo.getCreateTime();
//     Date updateTime = interfaceInfo.getUpdateTime();
//     Integer isDelete = interfaceInfo.getIsDelete();


        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            //isAnyBlank() 任意一个为“  ”，“”，null，都为true
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




