package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public final class ad {
    private static final BitSet AFLogger$LogLevel;
    private static volatile ad getLevel;
    private static final Handler init;
    final Runnable AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    boolean AFKeystoreWrapper;
    final Executor AFVersionDeclaration;
    final Runnable AppsFlyer2dXConversionCallback;
    private boolean onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private final Runnable onConversionDataSuccess;
    private long onDeepLinking;
    private final SensorManager onDeepLinkingNative;
    private final Map<w, w> onInstallConversionDataLoadedNative;
    private final Map<w, Map<String, Object>> onInstallConversionFailureNative;
    final Handler valueOf;
    final Object values = new Object();

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        init = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private ad(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onInstallConversionDataLoadedNative = new HashMap(bitSet.size());
        this.onInstallConversionFailureNative = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.ad.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ad.this.values) {
                    final ad adVar = ad.this;
                    adVar.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.ad.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : ad.this.onDeepLinkingNative.getSensorList(-1)) {
                                    if (ad.AFKeystoreWrapper(sensor.getType())) {
                                        w wVar = new w(sensor, ad.this.AFVersionDeclaration);
                                        if (!ad.this.onInstallConversionDataLoadedNative.containsKey(wVar)) {
                                            ad.this.onInstallConversionDataLoadedNative.put(wVar, wVar);
                                        }
                                        ad.this.onDeepLinkingNative.registerListener((SensorEventListener) ad.this.onInstallConversionDataLoadedNative.get(wVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            ad.this.onAppOpenAttributionNative = true;
                        }
                    });
                    ad.this.valueOf.postDelayed(ad.this.onConversionDataSuccess, 100L);
                    ad.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.ad.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ad.this.values) {
                    ad adVar = ad.this;
                    adVar.AFVersionDeclaration.execute(new AnonymousClass7());
                }
            }
        };
        this.AppsFlyer2dXConversionCallback = new Runnable() { // from class: com.appsflyer.internal.ad.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ad.this.values) {
                    if (ad.this.AFKeystoreWrapper) {
                        ad.this.valueOf.removeCallbacks(ad.this.AFInAppEventType);
                        ad.this.valueOf.removeCallbacks(ad.this.AFInAppEventParameterName);
                        ad adVar = ad.this;
                        adVar.AFVersionDeclaration.execute(new AnonymousClass7());
                        ad.this.AFKeystoreWrapper = false;
                    }
                }
            }
        };
        this.onAttributionFailureNative = 1;
        this.onDeepLinking = 0L;
        this.onConversionDataSuccess = new Runnable() { // from class: com.appsflyer.internal.ad.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ad.this.values) {
                    if (ad.this.onAttributionFailureNative == 0) {
                        ad.this.onAttributionFailureNative = 1;
                    }
                    ad.this.valueOf.postDelayed(ad.this.AFInAppEventParameterName, ad.this.onAttributionFailureNative * 500);
                }
            }
        };
        this.AFVersionDeclaration = Executors.newSingleThreadExecutor();
        this.onDeepLinkingNative = sensorManager;
        this.valueOf = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ad AFInAppEventParameterName(Context context) {
        if (getLevel != null) {
            return getLevel;
        }
        return AFInAppEventType((SensorManager) context.getApplicationContext().getSystemService("sensor"), init);
    }

    private static ad AFInAppEventType(SensorManager sensorManager, Handler handler) {
        if (getLevel == null) {
            synchronized (ad.class) {
                if (getLevel == null) {
                    getLevel = new ad(sensorManager, handler);
                }
            }
        }
        return getLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(int i) {
        return i >= 0 && AFLogger$LogLevel.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onDeepLinking;
        if (j != 0) {
            this.onAttributionFailureNative++;
            if (j - currentTimeMillis < 500) {
                this.valueOf.removeCallbacks(this.AFInAppEventParameterName);
                this.valueOf.post(this.AFInAppEventType);
            }
        } else {
            this.valueOf.post(this.AppsFlyer2dXConversionCallback);
            this.valueOf.post(this.AFInAppEventType);
        }
        this.onDeepLinking = currentTimeMillis;
    }

    /* renamed from: com.appsflyer.internal.ad$7  reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass7 implements Runnable {
        AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!ad.this.onInstallConversionDataLoadedNative.isEmpty()) {
                    for (w wVar : ad.this.onInstallConversionDataLoadedNative.values()) {
                        ad.this.onDeepLinkingNative.unregisterListener(wVar);
                        wVar.AFKeystoreWrapper(ad.this.onInstallConversionFailureNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            ad.this.onAttributionFailureNative = 0;
            ad.this.onAppOpenAttributionNative = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> AFInAppEventParameterName() {
        for (w wVar : this.onInstallConversionDataLoadedNative.values()) {
            wVar.AFKeystoreWrapper(this.onInstallConversionFailureNative, true);
        }
        Map<w, Map<String, Object>> map = this.onInstallConversionFailureNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onInstallConversionFailureNative.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> values() {
        synchronized (this.values) {
            if (!this.onInstallConversionDataLoadedNative.isEmpty() && this.onAppOpenAttributionNative) {
                for (w wVar : this.onInstallConversionDataLoadedNative.values()) {
                    wVar.AFKeystoreWrapper(this.onInstallConversionFailureNative, false);
                }
            }
            if (this.onInstallConversionFailureNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onInstallConversionFailureNative.values());
        }
    }
}
