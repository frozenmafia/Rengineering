package com.sendbird.android;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.push.RemoteMessage;
import com.sendbird.android.SendBird;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.log.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public abstract class SendBirdHmsPushHandler extends AbstractPushHandler<RemoteMessage> {
    private final AtomicReference<String> pendingToken = new AtomicReference<>();
    private final ExecutorService tokenExecutorService = Executors.newSingleThreadExecutor();
    private volatile CountDownLatch waitLock;

    protected abstract Context getContext();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sendbird.android.AbstractPushHandler
    public boolean isUniquePushToken() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sendbird.android.AbstractPushHandler
    public abstract void onMessageReceived(Context context, RemoteMessage remoteMessage);

    @Override // com.sendbird.android.AbstractPushHandler
    protected void onNewToken(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public void onTokenUpdated(String str) {
        this.pendingToken.set(str);
        if (this.waitLock != null) {
            this.waitLock.countDown();
            return;
        }
        SendBirdPushHelper.registerPushToken(str, isUniquePushToken(), null);
        onNewToken(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public void getToken(final OnPushTokenReceiveListener onPushTokenReceiveListener) {
        Logger.d("getHmsPushToken context : " + getContext());
        if (getContext() == null || onPushTokenReceiveListener == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.pendingToken.get())) {
            onPushTokenReceiveListener.onReceived(this.pendingToken.get(), null);
        } else {
            this.tokenExecutorService.execute(new Runnable() { // from class: com.sendbird.android.SendBirdHmsPushHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Context applicationContext = SendBirdHmsPushHandler.this.getContext().getApplicationContext();
                        String token = HmsInstanceId.getInstance(applicationContext).getToken(AGConnectServicesConfig.fromContext(applicationContext).getString("client/app_id"), "HCM");
                        Logger.d("pushToken : " + token);
                        boolean z = true;
                        if (!TextUtils.isEmpty(token)) {
                            SendBirdHmsPushHandler.this.pendingToken.set(token);
                        } else {
                            SendBirdHmsPushHandler.this.waitLock = new CountDownLatch(1);
                            z = SendBirdHmsPushHandler.this.waitLock.await(5L, TimeUnit.SECONDS);
                            SendBirdHmsPushHandler.this.waitLock = null;
                        }
                        String str = (String) SendBirdHmsPushHandler.this.pendingToken.get();
                        if (z && !TextUtils.isEmpty(str)) {
                            onPushTokenReceiveListener.onReceived(str, null);
                            return;
                        }
                        Logger.i("getHmsPushToken failed", new Object[0]);
                        onPushTokenReceiveListener.onReceived(null, new SendBirdException("getting HMS token is failed", SendBirdError.ERR_REQUEST_FAILED));
                    } catch (Exception e) {
                        Logger.i("getHmsPushToken failed, " + e, new Object[0]);
                        onPushTokenReceiveListener.onReceived(null, new SendBirdException("getting HMS token is failed", SendBirdError.ERR_REQUEST_FAILED));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public JSONObject getPayload(RemoteMessage remoteMessage) throws JSONException {
        if (remoteMessage.getDataOfMap().containsKey(StringSet.sendbird)) {
            return new JSONObject((String) remoteMessage.getDataOfMap().get(StringSet.sendbird));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public boolean isSendBirdMessage(RemoteMessage remoteMessage) {
        return remoteMessage.getDataOfMap().containsKey(StringSet.sendbird);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public void registerPushToken(String str, boolean z, SendBird.RegisterPushTokenWithStatusHandler registerPushTokenWithStatusHandler) {
        SendBird.registerPushTokenForCurrentUserInternal(SendBird.PushTokenType.HMS, str, z, true, registerPushTokenWithStatusHandler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.AbstractPushHandler
    public void unregisterPushToken(String str, SendBird.UnregisterPushTokenHandler unregisterPushTokenHandler) {
        SendBird.HMS.unregisterPushTokenForCurrentUser(str, unregisterPushTokenHandler);
    }
}
