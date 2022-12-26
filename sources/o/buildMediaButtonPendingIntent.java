package o;

import o.buildMediaButtonPendingIntent.valueOf;
/* loaded from: classes4.dex */
public class buildMediaButtonPendingIntent<T extends valueOf> {
    private static int ag$a;
    private int HaptikSDK$a;
    private float HaptikSDK$c;
    private int ah$a;
    private T toString;
    private Object[] valueOf;
    private int values;

    /* loaded from: classes4.dex */
    public static abstract class valueOf {
        public static int HaptikWebView = -1;
        int getSignupData = HaptikWebView;

        protected abstract valueOf ag$a();
    }

    public static buildMediaButtonPendingIntent toString(int i, valueOf valueof) {
        buildMediaButtonPendingIntent buildmediabuttonpendingintent;
        synchronized (buildMediaButtonPendingIntent.class) {
            buildmediabuttonpendingintent = new buildMediaButtonPendingIntent(i, valueof);
            int i2 = ag$a;
            buildmediabuttonpendingintent.HaptikSDK$a = i2;
            ag$a = i2 + 1;
        }
        return buildmediabuttonpendingintent;
    }

    private buildMediaButtonPendingIntent(int i, T t) {
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.values = i;
        this.valueOf = new Object[i];
        this.ah$a = 0;
        this.toString = t;
        this.HaptikSDK$c = 1.0f;
        ag$a();
    }

    public void toString(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.HaptikSDK$c = f;
    }

    private void ag$a() {
        values(this.HaptikSDK$c);
    }

    private void values(float f) {
        int i = this.values;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.valueOf[i3] = this.toString.ag$a();
        }
        this.ah$a = i - 1;
    }

    public T ah$a() {
        T t;
        synchronized (this) {
            if (this.ah$a == -1 && this.HaptikSDK$c > 0.0f) {
                ag$a();
            }
            t = (T) this.valueOf[this.ah$a];
            t.getSignupData = valueOf.HaptikWebView;
            this.ah$a--;
        }
        return t;
    }

    public void valueOf(T t) {
        synchronized (this) {
            if (t.getSignupData != valueOf.HaptikWebView) {
                if (t.getSignupData == this.HaptikSDK$a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.getSignupData + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i = this.ah$a + 1;
            this.ah$a = i;
            if (i >= this.valueOf.length) {
                values();
            }
            t.getSignupData = this.HaptikSDK$a;
            this.valueOf[this.ah$a] = t;
        }
    }

    private void values() {
        int i = this.values;
        int i2 = i * 2;
        this.values = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.valueOf[i3];
        }
        this.valueOf = objArr;
    }
}
