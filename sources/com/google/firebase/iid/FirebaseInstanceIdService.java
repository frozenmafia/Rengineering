package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
@Deprecated
/* loaded from: classes7.dex */
public class FirebaseInstanceIdService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Deprecated
    public void onTokenRefresh() {
    }
}
