package com.sendbird.android;

import android.content.Context;
import com.sendbird.android.SendBird;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AbstractPushHandler<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract JSONObject getPayload(T t) throws JSONException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void getToken(OnPushTokenReceiveListener onPushTokenReceiveListener);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isSendBirdMessage(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isUniquePushToken() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void onMessageReceived(Context context, T t);

    abstract void onNewToken(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void onTokenUpdated(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void registerPushToken(String str, boolean z, SendBird.RegisterPushTokenWithStatusHandler registerPushTokenWithStatusHandler);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void unregisterPushToken(String str, SendBird.UnregisterPushTokenHandler unregisterPushTokenHandler);
}
