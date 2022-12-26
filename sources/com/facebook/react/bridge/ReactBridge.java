package com.facebook.react.bridge;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
public class ReactBridge {
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static void staticInit() {
        synchronized (ReactBridge.class) {
            if (sDidInit) {
                return;
            }
            sLoadStartTime = SystemClock.uptimeMillis();
            Trace.beginSection("ReactBridge.staticInit::load:reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.values("reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            com.facebook.systrace.Systrace.valueOf(0L);
            sLoadEndTime = SystemClock.uptimeMillis();
            sDidInit = true;
        }
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }
}
