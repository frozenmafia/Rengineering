package o;

import android.content.Context;
import android.os.Process;
import android.view.ViewConfiguration;
import com.microsoft.fraudprotection.androidsdk.FraudProtection;
import o.TrustedWebActivityServiceConnectionPool;
/* loaded from: classes3.dex */
public final class wasInterrupted {
    private static char ag$a = 0;
    public static final String ah$a;
    private static int ah$b = 0;
    private static int invoke = 1;
    public static final wasInterrupted toString;
    private static int valueOf;
    private static long values;

    static void values() {
        valueOf = 0;
        values = 0L;
        ag$a = (char) 37106;
    }

    private wasInterrupted() {
    }

    public static final String ag$a() {
        try {
            int i = ah$b + 15;
            invoke = i % 128;
            int i2 = i % 2;
            String sessionId = FraudProtection.getSessionId();
            runAnimators.ah$a(sessionId, "getSessionId()");
            int i3 = ah$b + 65;
            invoke = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return sessionId;
            }
            Object obj = null;
            super.hashCode();
            return sessionId;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final void valueOf(String str) {
        int i = invoke + 107;
        ah$b = i % 128;
        if ((i % 2 != 0 ? (char) 25 : '_') != 25) {
            runAnimators.ag$a(str, "pageId");
            FraudProtection.send(str);
            return;
        }
        runAnimators.ag$a(str, "pageId");
        FraudProtection.send(str);
        int i2 = 79 / 0;
    }

    public static final void values(Context context, String str) {
        int i = invoke + 123;
        ah$b = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, ah$a(Process.myPid() >> 22, new char[]{26615, 63373, 41342, 2194}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37537), new char[]{7988, 14021}).intern());
        FraudProtection.start(context, str);
        int i3 = ah$b + 117;
        invoke = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final String ah$a() {
        int i = ah$b + 109;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            String ag$a2 = TrustedWebActivityServiceConnectionPool.BindToServiceAsyncTask.ag$a().values().ag$a(FraudProtection.getAttributes());
            runAnimators.ah$a(ag$a2, "getInstance().gsonObject…otection.getAttributes())");
            int i3 = ah$b + 75;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return ag$a2;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    static {
        try {
            values();
            toString = new wasInterrupted();
            ah$a = "SU";
            try {
                int i = invoke + 59;
                ah$b = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ valueOf) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
