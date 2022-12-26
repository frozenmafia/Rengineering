package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class safeInsetLeft {
    public static final values values = new values(null);
    public int HaptikSDK$a;
    public boolean HaptikSDK$c;
    public boolean ag$a;
    public safeInsetLeft ah$a;
    public safeInsetLeft ah$b;
    public int toString;
    public final byte[] valueOf;

    public safeInsetLeft() {
        this.valueOf = new byte[8192];
        this.ag$a = true;
        this.HaptikSDK$c = false;
    }

    public safeInsetLeft(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        runAnimators.ag$a(bArr, "data");
        this.valueOf = bArr;
        this.HaptikSDK$a = i;
        this.toString = i2;
        this.HaptikSDK$c = z;
        this.ag$a = z2;
    }

    public final safeInsetLeft values() {
        this.HaptikSDK$c = true;
        return new safeInsetLeft(this.valueOf, this.HaptikSDK$a, this.toString, true, false);
    }

    public final safeInsetLeft ag$a() {
        byte[] bArr = this.valueOf;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new safeInsetLeft(copyOf, this.HaptikSDK$a, this.toString, false, true);
    }

    public final safeInsetLeft valueOf() {
        safeInsetLeft safeinsetleft = this.ah$a;
        if (safeinsetleft == this) {
            safeinsetleft = null;
        }
        safeInsetLeft safeinsetleft2 = this.ah$b;
        runAnimators.toString(safeinsetleft2);
        safeinsetleft2.ah$a = this.ah$a;
        safeInsetLeft safeinsetleft3 = this.ah$a;
        runAnimators.toString(safeinsetleft3);
        safeinsetleft3.ah$b = this.ah$b;
        safeInsetLeft safeinsetleft4 = null;
        this.ah$a = safeinsetleft4;
        this.ah$b = safeinsetleft4;
        return safeinsetleft;
    }

    public final safeInsetLeft values(safeInsetLeft safeinsetleft) {
        runAnimators.ag$a(safeinsetleft, "segment");
        safeinsetleft.ah$b = this;
        safeinsetleft.ah$a = this.ah$a;
        safeInsetLeft safeinsetleft2 = this.ah$a;
        runAnimators.toString(safeinsetleft2);
        safeinsetleft2.ah$b = safeinsetleft;
        this.ah$a = safeinsetleft;
        return safeinsetleft;
    }

    public final safeInsetLeft toString(int i) {
        safeInsetLeft values2;
        if (!(i > 0 && i <= this.toString - this.HaptikSDK$a)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            values2 = values();
        } else {
            values2 = DisplayCompatHelperApi28.values();
            byte[] bArr = this.valueOf;
            byte[] bArr2 = values2.valueOf;
            int i2 = this.HaptikSDK$a;
            getStartAlpha.valueOf(bArr, bArr2, 0, i2, i2 + i, 2, null);
        }
        values2.toString = values2.HaptikSDK$a + i;
        this.HaptikSDK$a += i;
        safeInsetLeft safeinsetleft = this.ah$b;
        runAnimators.toString(safeinsetleft);
        safeinsetleft.values(values2);
        return values2;
    }

    public final void ah$a() {
        safeInsetLeft safeinsetleft = this.ah$b;
        int i = 0;
        if (!(safeinsetleft != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        runAnimators.toString(safeinsetleft);
        if (safeinsetleft.ag$a) {
            int i2 = this.toString - this.HaptikSDK$a;
            safeInsetLeft safeinsetleft2 = this.ah$b;
            runAnimators.toString(safeinsetleft2);
            int i3 = safeinsetleft2.toString;
            safeInsetLeft safeinsetleft3 = this.ah$b;
            runAnimators.toString(safeinsetleft3);
            if (!safeinsetleft3.HaptikSDK$c) {
                safeInsetLeft safeinsetleft4 = this.ah$b;
                runAnimators.toString(safeinsetleft4);
                i = safeinsetleft4.HaptikSDK$a;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            safeInsetLeft safeinsetleft5 = this.ah$b;
            runAnimators.toString(safeinsetleft5);
            toString(safeinsetleft5, i2);
            valueOf();
            DisplayCompatHelperApi28.valueOf(this);
        }
    }

    public final void toString(safeInsetLeft safeinsetleft, int i) {
        runAnimators.ag$a(safeinsetleft, "sink");
        if (!safeinsetleft.ag$a) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = safeinsetleft.toString;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (safeinsetleft.HaptikSDK$c) {
                throw new IllegalArgumentException();
            }
            int i4 = safeinsetleft.HaptikSDK$a;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = safeinsetleft.valueOf;
            getStartAlpha.valueOf(bArr, bArr, 0, i4, i2, 2, null);
            safeinsetleft.toString -= safeinsetleft.HaptikSDK$a;
            safeinsetleft.HaptikSDK$a = 0;
        }
        byte[] bArr2 = this.valueOf;
        byte[] bArr3 = safeinsetleft.valueOf;
        int i5 = safeinsetleft.toString;
        int i6 = this.HaptikSDK$a;
        getStartAlpha.valueOf(bArr2, bArr3, i5, i6, i6 + i);
        safeinsetleft.toString += i;
        this.HaptikSDK$a += i;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }
}
