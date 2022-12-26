package com.apxor.androidsdk.plugins.push;

import com.apxor.androidsdk.core.utils.Logger;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
/* loaded from: classes6.dex */
public class FCMListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.values() != null) {
            Logger.d("onMessageReceived", "Recieved Message with sender id:" + remoteMessage.values());
            if (!remoteMessage.values().equals(PushPlugin.SENDER_ID) || remoteMessage.ag$a().size() <= 0) {
                return;
            }
            new a().a(remoteMessage, getApplicationContext());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        a.a();
    }
}
