package com.app.dream11.model;

import o.onActionViewExpanded;
import o.runAnimators;
/* loaded from: classes3.dex */
public class BaseDeviceRequest extends BaseRequest {
    private final String deviceIMEI;
    private final String deviceMAC;
    private final int rooted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeviceRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        runAnimators.ag$a(onactionviewexpanded, "device");
        runAnimators.ag$a(iEventDataProvider, "eventsData");
        this.deviceIMEI = onactionviewexpanded.ICustomTabsCallback();
        this.deviceMAC = onactionviewexpanded.onPostMessage();
        this.rooted = onactionviewexpanded.getDefaultImpl();
    }

    protected final String getDeviceIMEI() {
        return this.deviceIMEI;
    }

    protected final String getDeviceMAC() {
        return this.deviceMAC;
    }

    protected final int getRooted() {
        return this.rooted;
    }
}
