package com.appsflyer.internal;

import android.content.Context;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import o.getDouble;
/* loaded from: classes3.dex */
public abstract class bs extends Observable {
    private static int ag$a = 0;
    private static int[] ah$a = {-517141758, 1683123711, -1988786186, -1670504102, 1999860935, 120320353, 2107232564, -1880712957, -1328920753, -529239677, -1598560504, 1039935285, 1638532503, -434761816, -1367425708, 144411095, 1358686655, 677564881};
    private static int toString = 1;
    public final String AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    public e AFKeystoreWrapper;
    private long valueOf;
    public final Map<String, Object> values;

    /* loaded from: classes3.dex */
    public enum e {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void AFInAppEventParameterName(Context context);

    public bs(String str, Runnable runnable) {
        try {
            this.values = new HashMap();
            this.AFKeystoreWrapper = e.NOT_STARTED;
            this.AFInAppEventType = runnable;
            this.AFInAppEventParameterName = str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void AFInAppEventType() {
        try {
            try {
                this.valueOf = System.currentTimeMillis();
                this.AFKeystoreWrapper = e.STARTED;
                addObserver(new Observer() { // from class: com.appsflyer.internal.bs.4
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        bs.this.AFInAppEventType.run();
                    }
                });
                int i = ag$a + 59;
                toString = i % 128;
                if (!(i % 2 != 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public final void values() {
        this.values.put(valueOf(new int[]{-165052634, -1117098916, 912211928, 1076141510}, KeyEvent.normalizeMetaState(0) + 6).intern(), this.AFInAppEventParameterName);
        this.values.putAll(new bv());
        this.values.put("latency", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFKeystoreWrapper = e.FINISHED;
        setChanged();
        notifyObservers();
        int i = toString + 51;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    private static String valueOf(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ah$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
