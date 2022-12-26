package com.google.firebase.auth.api.fallback.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import o.isAutoMeasureEnabled;
/* loaded from: classes7.dex */
public class FirebaseAuthFallbackService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        synchronized (this) {
            if ("com.google.firebase.auth.api.gms.service.START".equals(intent.getAction())) {
                return new isAutoMeasureEnabled(this, this).asBinder();
            }
            return null;
        }
    }
}
