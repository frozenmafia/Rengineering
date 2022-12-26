package com.clevertap.android.sdk.pushnotification.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import o.AccessibilityViewCommand;
import o.setBundle;
/* loaded from: classes6.dex */
public class FcmMessageListenerService extends FirebaseMessagingService {
    private AccessibilityViewCommand.MoveAtGranularityArguments toString = new setBundle();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        this.toString.valueOf(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        this.toString.values(getApplicationContext(), str);
    }
}
