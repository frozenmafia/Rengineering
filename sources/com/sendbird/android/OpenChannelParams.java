package com.sendbird.android;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class OpenChannelParams {
    String channelUrl;
    Object coverUrlOrImage;
    String customType;
    String data;
    String name;
    List<String> operatorUserIds;

    public OpenChannelParams() {
    }

    public OpenChannelParams(String str) {
        ArrayList arrayList = new ArrayList();
        this.operatorUserIds = arrayList;
        arrayList.add(str);
    }

    public OpenChannelParams setChannelUrl(String str) {
        this.channelUrl = str;
        return this;
    }

    public OpenChannelParams setName(String str) {
        this.name = str;
        return this;
    }

    public OpenChannelParams setCoverUrl(String str) {
        this.coverUrlOrImage = str;
        return this;
    }

    public OpenChannelParams setCoverImage(File file) {
        this.coverUrlOrImage = file;
        return this;
    }

    public OpenChannelParams setData(String str) {
        this.data = str;
        return this;
    }

    public OpenChannelParams setCustomType(String str) {
        this.customType = str;
        return this;
    }

    @Deprecated
    public OpenChannelParams addOperator(User user) {
        return setOperators(Collections.singletonList(user));
    }

    @Deprecated
    public OpenChannelParams addOperators(List<User> list) {
        return setOperators(list);
    }

    @Deprecated
    public OpenChannelParams addOperatorId(String str) {
        return setOperatorUserIds(Collections.singletonList(str));
    }

    @Deprecated
    public OpenChannelParams addOperatorIds(List<String> list) {
        return setOperatorUserIds(list);
    }

    public OpenChannelParams setOperators(List<User> list) {
        if (this.operatorUserIds == null) {
            this.operatorUserIds = new ArrayList();
        }
        this.operatorUserIds.clear();
        if (list != null) {
            for (User user : list) {
                if (user != null && user.getUserId() != null && user.getUserId().length() > 0) {
                    this.operatorUserIds.add(user.getUserId());
                }
            }
        }
        return this;
    }

    public OpenChannelParams setOperatorUserIds(List<String> list) {
        if (this.operatorUserIds == null) {
            this.operatorUserIds = new ArrayList();
        }
        this.operatorUserIds.clear();
        if (list != null) {
            for (String str : list) {
                if (str != null && str.length() > 0) {
                    this.operatorUserIds.add(str);
                }
            }
        }
        return this;
    }

    public static OpenChannelParams clone(OpenChannelParams openChannelParams) {
        if (openChannelParams == null) {
            return null;
        }
        OpenChannelParams openChannelParams2 = new OpenChannelParams();
        openChannelParams2.setChannelUrl(openChannelParams.channelUrl).setCustomType(openChannelParams.customType).setData(openChannelParams.data).setName(openChannelParams.name);
        List<String> list = openChannelParams.operatorUserIds;
        if (list != null) {
            openChannelParams2.setOperatorUserIds(list);
        }
        Object obj = openChannelParams.coverUrlOrImage;
        if (obj instanceof File) {
            openChannelParams2.setCoverImage((File) obj);
        } else if (obj instanceof String) {
            openChannelParams2.setCoverUrl((String) obj);
        }
        return openChannelParams2;
    }

    public String toString() {
        return "OpenChannelParams{name='" + this.name + "', channelUrl='" + this.channelUrl + "', coverUrlOrImage=" + this.coverUrlOrImage + ", data='" + this.data + "', customType='" + this.customType + "', operatorUserIds=" + this.operatorUserIds + '}';
    }
}
