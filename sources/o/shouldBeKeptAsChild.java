package o;

import java.util.Locale;
/* loaded from: classes5.dex */
public class shouldBeKeptAsChild {
    private static volatile shouldBeKeptAsChild valueOf;
    private final stopIgnoring ah$a;
    private boolean toString;

    public static shouldBeKeptAsChild ah$a() {
        if (valueOf == null) {
            synchronized (shouldBeKeptAsChild.class) {
                if (valueOf == null) {
                    valueOf = new shouldBeKeptAsChild();
                }
            }
        }
        return valueOf;
    }

    public shouldBeKeptAsChild(stopIgnoring stopignoring) {
        this.toString = false;
        this.ah$a = stopignoring == null ? stopIgnoring.values() : stopignoring;
    }

    private shouldBeKeptAsChild() {
        this(null);
    }

    public void valueOf(boolean z) {
        this.toString = z;
    }

    public void ag$a(String str) {
        if (this.toString) {
            this.ah$a.ah$a(str);
        }
    }

    public void valueOf(String str, Object... objArr) {
        if (this.toString) {
            this.ah$a.ah$a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void values(String str) {
        if (this.toString) {
            this.ah$a.values(str);
        }
    }

    public void ag$a(String str, Object... objArr) {
        if (this.toString) {
            this.ah$a.values(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void ah$a(String str) {
        if (this.toString) {
            this.ah$a.toString(str);
        }
    }

    public void ah$a(String str, Object... objArr) {
        if (this.toString) {
            this.ah$a.toString(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void toString(String str) {
        if (this.toString) {
            this.ah$a.valueOf(str);
        }
    }

    public void values(String str, Object... objArr) {
        if (this.toString) {
            this.ah$a.valueOf(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
