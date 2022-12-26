package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes6.dex */
public final class isStarted {
    private String[] HaptikSDK$a;
    private boolean HaptikSDK$b;
    private int HaptikSDK$c;
    private int HaptikSDK$d;
    private final int HaptikSDK$e;
    private int HaptikWebView;
    private boolean ag$a;
    private int ah$a;
    private final isStarted ah$b;
    private int getInitSettings;
    private final AtomicReference<values> getSignupData;
    private int invoke;
    private int[] toString;
    private int valueOf;
    private final boolean values;

    static int values(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    private isStarted(int i, boolean z, int i2, boolean z2) {
        this.ah$b = null;
        this.HaptikSDK$e = i2;
        this.HaptikSDK$b = z;
        this.values = z2;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.getSignupData = new AtomicReference<>(values.ag$a(i));
    }

    private isStarted(isStarted isstarted, boolean z, int i, boolean z2, values valuesVar) {
        this.ah$b = isstarted;
        this.HaptikSDK$e = i;
        this.HaptikSDK$b = z;
        this.values = z2;
        this.getSignupData = null;
        this.ah$a = valuesVar.valueOf;
        int i2 = valuesVar.values;
        this.valueOf = i2;
        int i3 = i2 << 2;
        this.HaptikSDK$c = i3;
        this.HaptikWebView = i3 + (i3 >> 1);
        this.HaptikSDK$d = valuesVar.HaptikSDK$a;
        this.toString = valuesVar.ag$a;
        this.HaptikSDK$a = valuesVar.ah$a;
        this.getInitSettings = valuesVar.invoke;
        this.invoke = valuesVar.toString;
        this.ag$a = true;
    }

    protected static isStarted valueOf(int i) {
        return new isStarted(64, true, i, true);
    }

    public isStarted ag$a(int i) {
        return new isStarted(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this.HaptikSDK$e, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this.getSignupData.get());
    }

    public void valueOf() {
        if (this.ah$b == null || !ag$a()) {
            return;
        }
        this.ah$b.values(new values(this));
        this.ag$a = true;
    }

    private void values(values valuesVar) {
        int i = valuesVar.valueOf;
        values valuesVar2 = this.getSignupData.get();
        if (i == valuesVar2.valueOf) {
            return;
        }
        if (i > 6000) {
            valuesVar = values.ag$a(64);
        }
        this.getSignupData.compareAndSet(valuesVar2, valuesVar);
    }

    public boolean ag$a() {
        return !this.ag$a;
    }

    public int values() {
        int i = this.HaptikSDK$c;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.toString[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int HaptikSDK$a() {
        int i = this.HaptikWebView;
        int i2 = 0;
        for (int i3 = this.HaptikSDK$c + 3; i3 < i; i3 += 4) {
            if (this.toString[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int invoke() {
        int i = this.HaptikWebView + 3;
        int i2 = this.valueOf;
        int i3 = 0;
        for (int i4 = i; i4 < i2 + i; i4 += 4) {
            if (this.toString[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int ah$b() {
        return (this.getInitSettings - HaptikSDK$c()) >> 2;
    }

    public int HaptikSDK$b() {
        int i = this.valueOf;
        int i2 = 0;
        for (int i3 = 3; i3 < (i << 3); i3 += 4) {
            if (this.toString[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int values2 = values();
        int HaptikSDK$a = HaptikSDK$a();
        int invoke = invoke();
        int ah$b = ah$b();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", getClass().getName(), Integer.valueOf(this.ah$a), Integer.valueOf(this.valueOf), Integer.valueOf(values2), Integer.valueOf(HaptikSDK$a), Integer.valueOf(invoke), Integer.valueOf(ah$b), Integer.valueOf(values2 + HaptikSDK$a + invoke + ah$b), Integer.valueOf(HaptikSDK$b()));
    }

    private final int HaptikSDK$c() {
        int i = this.valueOf;
        return (i << 3) - i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class values {
        public final int HaptikSDK$a;
        public final int[] ag$a;
        public final String[] ah$a;
        public final int invoke;
        public final int toString;
        public final int valueOf;
        public final int values;

        public values(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.values = i;
            this.valueOf = i2;
            this.HaptikSDK$a = i3;
            this.ag$a = iArr;
            this.ah$a = strArr;
            this.invoke = i4;
            this.toString = i5;
        }

        public values(isStarted isstarted) {
            this.values = isstarted.valueOf;
            this.valueOf = isstarted.ah$a;
            this.HaptikSDK$a = isstarted.HaptikSDK$d;
            this.ag$a = isstarted.toString;
            this.ah$a = isstarted.HaptikSDK$a;
            this.invoke = isstarted.getInitSettings;
            this.toString = isstarted.invoke;
        }

        public static values ag$a(int i) {
            int i2 = i << 3;
            return new values(i, 0, isStarted.values(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }
}
