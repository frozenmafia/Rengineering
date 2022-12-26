package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w implements SensorEventListener {
    double AFInAppEventParameterName;
    private final String AFLogger$LogLevel;
    private final Executor AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final String init;
    long valueOf;
    private final int values;
    final float[][] AFKeystoreWrapper = new float[2];
    final long[] AFInAppEventType = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Sensor sensor, Executor executor) {
        this.AFVersionDeclaration = executor;
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFLogger$LogLevel = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.init = str;
        this.AppsFlyer2dXConversionCallback = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    static double values(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean valueOf(Sensor sensor) {
        return (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true;
    }

    private static List<Float> values(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.w.3
            @Override // java.lang.Runnable
            public final void run() {
                SensorEvent sensorEvent2 = sensorEvent;
                if (sensorEvent2 == null || sensorEvent2.values == null || !w.valueOf(sensorEvent.sensor)) {
                    return;
                }
                w wVar = w.this;
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (wVar.values(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[] fArr2 = wVar.AFKeystoreWrapper[0];
                    if (fArr2 == null) {
                        wVar.AFKeystoreWrapper[0] = Arrays.copyOf(fArr, fArr.length);
                        wVar.AFInAppEventType[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr3 = wVar.AFKeystoreWrapper[1];
                    if (fArr3 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        wVar.AFKeystoreWrapper[1] = copyOf;
                        wVar.AFInAppEventType[1] = currentTimeMillis;
                        wVar.AFInAppEventParameterName = w.values(fArr2, copyOf);
                    } else if (50000000 <= j - wVar.valueOf) {
                        wVar.valueOf = j;
                        if (Arrays.equals(fArr3, fArr)) {
                            wVar.AFInAppEventType[1] = currentTimeMillis;
                            return;
                        }
                        double values = w.values(fArr2, fArr);
                        if (values > wVar.AFInAppEventParameterName) {
                            wVar.AFKeystoreWrapper[1] = Arrays.copyOf(fArr, fArr.length);
                            wVar.AFInAppEventType[1] = currentTimeMillis;
                            wVar.AFInAppEventParameterName = values;
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(Map<w, Map<String, Object>> map, boolean z) {
        if (AFInAppEventParameterName()) {
            map.put(this, AFKeystoreWrapper());
            if (z) {
                int length = this.AFKeystoreWrapper.length;
                for (int i = 0; i < length; i++) {
                    this.AFKeystoreWrapper[i] = null;
                }
                int length2 = this.AFInAppEventType.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventType[i2] = 0;
                }
                this.AFInAppEventParameterName = 0.0d;
                this.valueOf = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFKeystoreWrapper());
        }
    }

    final boolean values(int i, String str, String str2) {
        return this.values == i && this.AFLogger$LogLevel.equals(str) && this.init.equals(str2);
    }

    private Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFLogger$LogLevel);
        concurrentHashMap.put("sV", this.init);
        float[] fArr = this.AFKeystoreWrapper[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.AFKeystoreWrapper[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFInAppEventParameterName() {
        return this.AFKeystoreWrapper[0] != null;
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return values(wVar.values, wVar.AFLogger$LogLevel, wVar.init);
        }
        return false;
    }
}
