package com.app.dream11.core.service;

import com.app.dream11.model.BaseRequest;
import com.app.dream11.model.IEventDataProvider;
import java.util.HashMap;
import java.util.Map;
import o.onActionViewExpanded;
/* loaded from: classes.dex */
public class CommonGetProperties extends HashMap<String, Object> {
    public CommonGetProperties(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        putAll(commonRequest(onactionviewexpanded, iEventDataProvider));
    }

    private Map<String, Object> commonRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        HashMap hashMap = new HashMap();
        BaseRequest baseRequest = new BaseRequest(onactionviewexpanded, iEventDataProvider);
        hashMap.put("siteId", Integer.valueOf(baseRequest.getSiteId()));
        hashMap.put("device", baseRequest.getDevice());
        hashMap.put("appsFlyerId", baseRequest.getAppsFlyerId());
        hashMap.put("deviceId", onactionviewexpanded.getInitSettings());
        hashMap.put("appsFlyerChannelName", baseRequest.getAppsFlyerChannelName());
        return hashMap;
    }
}
