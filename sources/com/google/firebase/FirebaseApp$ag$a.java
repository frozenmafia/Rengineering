package com.google.firebase;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public class FirebaseApp$ag$a implements BackgroundDetector.BackgroundStateChangeListener {
    private static AtomicReference<FirebaseApp$ag$a> ah$a = new AtomicReference<>();

    private FirebaseApp$ag$a() {
    }

    public static /* synthetic */ void valueOf(Context context) {
        toString(context);
    }

    public static void toString(Context context) {
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (ah$a.get() == null) {
                FirebaseApp$ag$a firebaseApp$ag$a = new FirebaseApp$ag$a();
                if (ah$a.compareAndSet(null, firebaseApp$ag$a)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(firebaseApp$ag$a);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public void onBackgroundStateChanged(boolean z) {
        AtomicBoolean atomicBoolean;
        synchronized (FirebaseApp.ah$a) {
            Iterator it = new ArrayList(FirebaseApp.valueOf.values()).iterator();
            while (it.hasNext()) {
                FirebaseApp firebaseApp = (FirebaseApp) it.next();
                atomicBoolean = firebaseApp.toString;
                if (atomicBoolean.get()) {
                    firebaseApp.values(z);
                }
            }
        }
    }
}
