package com.sendbird.android;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
/* loaded from: classes7.dex */
public final class SendBirdFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "SENDBIRD_PUSH";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        Log.d(TAG, "++ onNewToken : " + str);
        SendBirdPushHelper.onNewToken(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "++ onMessageReceived : " + remoteMessage);
        SendBirdPushHelper.onMessageReceived(this, remoteMessage);
    }
}
