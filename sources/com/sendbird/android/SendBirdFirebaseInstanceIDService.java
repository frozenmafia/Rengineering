package com.sendbird.android;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
/* loaded from: classes7.dex */
public final class SendBirdFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "SENDBIRD_PUSH";

    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void onTokenRefresh() {
        FirebaseInstanceId ag$a;
        ag$a = FirebaseInstanceId.ag$a(FirebaseApp.values());
        String ah$b = ag$a.ah$b();
        Log.d(TAG, "++ onTokenRefresh: " + ah$b);
        SendBirdPushHelper.onNewToken(ah$b);
    }
}
