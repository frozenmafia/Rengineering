package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public final class checkSelectForSwipe {
    public static final ByteBuffer ag$a;
    public static final setSpanGroupIndexCacheEnabled toString;
    public static final byte[] valueOf;
    public static final Charset ah$a = Charset.forName("UTF-8");
    static final Charset values = Charset.forName("ISO-8859-1");

    /* loaded from: classes7.dex */
    public interface toString {
        int getNumber();
    }

    /* loaded from: classes7.dex */
    public interface valueOf extends checkSelectForSwipe$ah$b<Double> {
    }

    /* loaded from: classes7.dex */
    public interface values extends checkSelectForSwipe$ah$b<Boolean> {
    }

    public static int ah$a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int toString(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        byte[] bArr = new byte[0];
        valueOf = bArr;
        ag$a = ByteBuffer.wrap(bArr);
        toString = setSpanGroupIndexCacheEnabled.valueOf(bArr);
    }

    public static <T> T toString(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static String values(byte[] bArr) {
        return new String(bArr, ah$a);
    }

    public static int ah$a(byte[] bArr, int i, int i2) {
        int ah$a2 = ah$a(i2, bArr, i, i2);
        if (ah$a2 == 0) {
            return 1;
        }
        return ah$a2;
    }

    public static int ah$a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object values(Object obj, Object obj2) {
        return ((ItemTouchHelper.AnonymousClass3) obj).onPostMessage().toString((ItemTouchHelper.AnonymousClass3) obj2).HaptikSDK$a();
    }
}
