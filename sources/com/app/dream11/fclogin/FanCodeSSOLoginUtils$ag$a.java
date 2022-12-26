package com.app.dream11.fclogin;

import com.app.dream11.fclogin.ContentResolverHelper;
import com.app.dream11.fclogin.FanCodeSSOLoginUtils;
import java.io.Serializable;
import java.util.HashMap;
import o.Visibility;
import o.getTargetTypes;
import o.isSideAnchor;
/* loaded from: classes.dex */
public final class FanCodeSSOLoginUtils$ag$a {
    public /* synthetic */ FanCodeSSOLoginUtils$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private FanCodeSSOLoginUtils$ag$a() {
    }

    private final isSideAnchor ag$a() {
        return (isSideAnchor) FanCodeSSOLoginUtils.values().getValue();
    }

    public final String valueOf(boolean z) {
        if (z) {
            return FanCodeSSOLoginUtils.FCUserType.NEW_PRE_OB.getUserType();
        }
        return FanCodeSSOLoginUtils.FCUserType.EXISTING.getUserType();
    }

    public final boolean valueOf(HashMap<String, Serializable> hashMap) {
        if (hashMap == null) {
            return false;
        }
        Serializable serializable = hashMap.get(ContentResolverHelper.ContentResolverData.ACCESS_TOKEN.getData());
        String str = serializable instanceof String ? (String) serializable : null;
        Serializable serializable2 = hashMap.get(ContentResolverHelper.ContentResolverData.REFRESH_TOKEN.getData());
        String str2 = serializable2 instanceof String ? (String) serializable2 : null;
        Serializable serializable3 = hashMap.get(ContentResolverHelper.ContentResolverData.USER_ID.getData());
        String str3 = serializable3 instanceof String ? (String) serializable3 : null;
        Integer mode = str3 != null ? Visibility.Mode.toString(str3) : null;
        if (str == null || str2 == null || mode == null) {
            return false;
        }
        if (FanCodeSSOLoginUtils.ag$a.ag$a().aj$a() == mode.intValue()) {
            if (str.length() > 0) {
                return str2.length() > 0;
            }
            return false;
        }
        return false;
    }
}
