package com.sendbird.android;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.sendbird.android.log.Logger;
/* loaded from: classes7.dex */
public final class SendBirdHmsMessagingService extends HmsMessageService {
    public void onNewToken(String str) {
        Logger.d("++ onNewToken : " + str);
        SendBirdPushHelper.onNewToken(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Logger.i("remoteMesage : " + remoteMessage.getDataOfMap(), new Object[0]);
        SendBirdPushHelper.onMessageReceived(this, remoteMessage);
    }
}
