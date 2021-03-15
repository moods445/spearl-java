package com.modds.spearl.user.rpc;

import com.modds.spearl.user.api.UserApi;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserApiImpl implements UserApi {

    @Override
    public String getUserName(long uid) {
        return "spearl";
    }
}
