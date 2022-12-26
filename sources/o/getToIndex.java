package o;

import com.clevertap.android.sdk.pushnotification.PushConstants;
/* loaded from: classes4.dex */
public interface getToIndex {
    int getPlatform();

    PushConstants.PushType getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
