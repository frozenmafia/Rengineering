package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@Deprecated
/* loaded from: classes3.dex */
final class ab {
    ab() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b AFInAppEventType(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        c cVar = new c((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, cVar, 1)) {
                if (context != null) {
                    context.unbindService(cVar);
                }
                throw new IOException("Google Play connection failed");
            } else if (cVar.values) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            } else {
                cVar.values = true;
                IBinder poll = cVar.AFKeystoreWrapper.poll(10L, TimeUnit.SECONDS);
                if (poll != null) {
                    d dVar = new d(poll);
                    return new b(dVar.AFInAppEventParameterName(), dVar.AFInAppEventType());
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
        } finally {
            if (context != null) {
                context.unbindService(cVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b {
        final String AFInAppEventParameterName;
        private final boolean AFKeystoreWrapper;

        b(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.AFKeystoreWrapper = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean AFKeystoreWrapper() {
            return this.AFKeystoreWrapper;
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFKeystoreWrapper;
        boolean values;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private c() {
            this.AFKeystoreWrapper = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFKeystoreWrapper.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class d implements IInterface {
        private final IBinder AFInAppEventType;

        d(IBinder iBinder) {
            this.AFInAppEventType = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFInAppEventType;
        }

        public final String AFInAppEventParameterName() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFInAppEventType.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean AFInAppEventType() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFInAppEventType.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
