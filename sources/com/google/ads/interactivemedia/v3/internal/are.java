package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes4.dex */
public abstract class are {
    private final String a = "com.google.android.gms.ads.adshield.AdShieldCreatorImpl";

    /* renamed from: b  reason: collision with root package name */
    private Object f682b;

    protected abstract Object b(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object c(Context context) throws ard {
        if (this.f682b == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new ard();
            }
            try {
                this.f682b = b((IBinder) remoteContext.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new ard("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new ard("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new ard("Could not instantiate creator.", e3);
            }
        }
        return this.f682b;
    }
}
