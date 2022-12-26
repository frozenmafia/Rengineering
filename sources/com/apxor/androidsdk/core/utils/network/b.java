package com.apxor.androidsdk.core.utils.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.apxor.androidsdk.core.SDKController;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class b {
    private final String a = "b";

    /* renamed from: b  reason: collision with root package name */
    private ConnectivityManager f289b = null;
    private Handler c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ ApxorNetworkCallback a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f290b;
        final /* synthetic */ String c;

        a(ApxorNetworkCallback apxorNetworkCallback, String str, String str2) {
            this.a = apxorNetworkCallback;
            this.f290b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.apxor.androidsdk.core.utils.network.a(this.a).a("POST", this.f290b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.core.utils.network.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class RunnableC0263b implements Runnable {
        final /* synthetic */ ApxorNetworkCallback a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f291b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ HashMap d;
        final /* synthetic */ String e;

        RunnableC0263b(ApxorNetworkCallback apxorNetworkCallback, String str, byte[] bArr, HashMap hashMap, String str2) {
            this.a = apxorNetworkCallback;
            this.f291b = str;
            this.c = bArr;
            this.d = hashMap;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.apxor.androidsdk.core.utils.network.a(this.a).a(this.f291b, this.c, this.d, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        final /* synthetic */ ApxorNetworkCallback a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f292b;
        final /* synthetic */ String c;

        c(ApxorNetworkCallback apxorNetworkCallback, String str, String str2) {
            this.a = apxorNetworkCallback;
            this.f292b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.apxor.androidsdk.core.utils.network.a(this.a).a(true, "POST", this.f292b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        final /* synthetic */ ApxorNetworkCallback a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f293b;

        d(ApxorNetworkCallback apxorNetworkCallback, String str) {
            this.a = apxorNetworkCallback;
            this.f293b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.apxor.androidsdk.core.utils.network.a(this.a).a("GET", null, this.f293b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        final /* synthetic */ Runnable a;

        e(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                SDKController.getInstance().logException("ncF", e);
            }
        }
    }

    public void a(Context context) {
        Object systemService = context.getSystemService("connectivity");
        this.f289b = systemService != null ? (ConnectivityManager) systemService : null;
        HandlerThread handlerThread = new HandlerThread("Network");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public boolean b() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.f289b;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public void b(String str, String str2, ApxorNetworkCallback apxorNetworkCallback) {
        a(new a(apxorNetworkCallback, str, str2));
    }

    public void a() {
        try {
            this.c.removeMessages(0);
            this.c.removeMessages(-1);
        } catch (Exception e2) {
            SDKController.getInstance().logException("cARF", e2);
        }
    }

    public void a(String str, byte[] bArr, HashMap<String, String> hashMap, String str2, ApxorNetworkCallback apxorNetworkCallback) {
        a(new RunnableC0263b(apxorNetworkCallback, str, bArr, hashMap, str2));
    }

    public void a(String str, String str2, ApxorNetworkCallback apxorNetworkCallback) {
        a(new c(apxorNetworkCallback, str, str2));
    }

    public void a(String str, ApxorNetworkCallback apxorNetworkCallback) {
        a(new d(apxorNetworkCallback, str));
    }

    private void a(Runnable runnable) {
        this.c.post(new e(runnable));
    }
}
