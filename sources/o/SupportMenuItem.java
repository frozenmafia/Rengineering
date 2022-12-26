package o;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes3.dex */
public final class SupportMenuItem {
    private static boolean valueOf = true;
    private static int values;

    /* renamed from: o.SupportMenuItem$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class CC {
        private long[] ag$a;
        private int valueOf;

        public CC() {
            this(32);
        }

        public CC(int i) {
            this.ag$a = new long[i];
        }

        public void ag$a(long j) {
            int i = this.valueOf;
            long[] jArr = this.ag$a;
            if (i == jArr.length) {
                this.ag$a = Arrays.copyOf(jArr, i * 2);
            }
            long[] jArr2 = this.ag$a;
            int i2 = this.valueOf;
            this.valueOf = i2 + 1;
            jArr2[i2] = j;
        }

        public long toString(int i) {
            if (i < 0 || i >= this.valueOf) {
                throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.valueOf);
            }
            return this.ag$a[i];
        }

        public int valueOf() {
            return this.valueOf;
        }

        public long[] ag$a() {
            return Arrays.copyOf(this.ag$a, this.valueOf);
        }
    }

    @Pure
    public static void ah$a(String str, String str2) {
        if (values == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void ag$a(String str, String str2) {
        if (values <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void values(String str, String str2, Throwable th) {
        ag$a(str, ag$a(str2, th));
    }

    @Pure
    public static void toString(String str, String str2) {
        if (values <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void valueOf(String str, String str2, Throwable th) {
        toString(str, ag$a(str2, th));
    }

    @Pure
    public static void valueOf(String str, String str2) {
        if (values <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void toString(String str, String str2, Throwable th) {
        valueOf(str, ag$a(str2, th));
    }

    @Pure
    public static String ah$a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (valueOf(th)) {
            return "UnknownHostException (no network)";
        }
        if (!valueOf) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    private static String ag$a(String str, Throwable th) {
        String ah$a = ah$a(th);
        if (TextUtils.isEmpty(ah$a)) {
            return str;
        }
        return str + "\n  " + ah$a.replace("\n", "\n  ") + '\n';
    }

    @Pure
    private static boolean valueOf(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
