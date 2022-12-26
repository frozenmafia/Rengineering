package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import o.getExtendSelection;
import o.getGranularity;
import o.getToIndex;
import o.setBeforeText;
/* loaded from: classes6.dex */
public class FcmPushProvider implements getToIndex {
    private getExtendSelection handler;

    @Override // o.getToIndex
    public int getPlatform() {
        return 1;
    }

    @Override // o.getToIndex
    public int minSDKSupportVersionCode() {
        return 0;
    }

    public FcmPushProvider(setBeforeText setbeforetext, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new getGranularity(setbeforetext, context, cleverTapInstanceConfig);
    }

    @Override // o.getToIndex
    public PushConstants.PushType getPushType() {
        return this.handler.values();
    }

    @Override // o.getToIndex
    public boolean isAvailable() {
        return this.handler.ah$a();
    }

    @Override // o.getToIndex
    public boolean isSupported() {
        return this.handler.valueOf();
    }

    @Override // o.getToIndex
    public void requestToken() {
        this.handler.ah$b();
    }

    void setHandler(getExtendSelection getextendselection) {
        this.handler = getextendselection;
    }
}
