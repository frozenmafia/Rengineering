package o;

import android.widget.ExpandableListView;
import java.io.IOException;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public abstract class parseActivityFilter implements safeInsetBottom {
    private static int toString = 1;
    private static int valueOf = 0;
    private static long values = -3791771195400629522L;
    private final safeInsetBottom delegate;

    public parseActivityFilter(safeInsetBottom safeinsetbottom) {
        try {
            runAnimators.ag$a(safeinsetbottom, "delegate");
            try {
                this.delegate = safeinsetbottom;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final safeInsetBottom delegate() {
        try {
            int i = toString + 35;
            valueOf = i % 128;
            int i2 = i % 2;
            safeInsetBottom safeinsetbottom = this.delegate;
            int i3 = valueOf + 105;
            toString = i3 % 128;
            if (!(i3 % 2 != 0)) {
                Object obj = null;
                super.hashCode();
                return safeinsetbottom;
            }
            return safeinsetbottom;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.safeInsetBottom
    public void write(getMinSmallestWidth getminsmallestwidth, long j) throws IOException {
        int i = toString + 21;
        valueOf = i % 128;
        if ((i % 2 != 0 ? 'R' : (char) 28) != 28) {
            runAnimators.ag$a(getminsmallestwidth, ag$a(new char[]{21149, 32668, 2209, 54731, 59129, 45850}, 220 % ExpandableListView.getPackedPositionChild(1L)).intern());
        } else {
            runAnimators.ag$a(getminsmallestwidth, ag$a(new char[]{21149, 32668, 2209, 54731, 59129, 45850}, 11548 - ExpandableListView.getPackedPositionChild(0L)).intern());
        }
        this.delegate.write(getminsmallestwidth, j);
    }

    @Override // o.safeInsetBottom, java.io.Flushable
    public void flush() throws IOException {
        int i = valueOf + 15;
        toString = i % 128;
        if ((i % 2 == 0 ? TokenParser.ESCAPE : '$') != '\\') {
            this.delegate.flush();
        } else {
            try {
                this.delegate.flush();
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = valueOf + 97;
        toString = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 4 : (char) 19) != 4) {
            return;
        }
        int i3 = 17 / 0;
    }

    @Override // o.safeInsetBottom
    public DisplayFeature timeout() {
        DisplayFeature timeout;
        int i = toString + 119;
        valueOf = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            try {
                timeout = this.delegate.timeout();
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            timeout = this.delegate.timeout();
        }
        int i2 = toString + 93;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            super.hashCode();
            return timeout;
        }
        return timeout;
    }

    @Override // o.safeInsetBottom, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = toString + 85;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            this.delegate.close();
        } else {
            this.delegate.close();
            int i2 = 43 / 0;
        }
        try {
            int i3 = valueOf + 101;
            try {
                toString = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = getClass().getSimpleName() + '(' + this.delegate + ')';
        int i = toString + 75;
        valueOf = i % 128;
        int i2 = i % 2;
        return str;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final safeInsetBottom m1252deprecated_delegate() {
        int i = toString + 123;
        valueOf = i % 128;
        if (i % 2 != 0) {
            safeInsetBottom safeinsetbottom = this.delegate;
            Object obj = null;
            super.hashCode();
            return safeinsetbottom;
        }
        return this.delegate;
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
