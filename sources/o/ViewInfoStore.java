package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Utf8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
/* loaded from: classes5.dex */
public final class ViewInfoStore {
    public static final ByteBuffer ag$a;
    public static final getStartLine toString;
    public static final byte[] values;
    public static final Charset ah$a = Charset.forName("UTF-8");
    static final Charset valueOf = Charset.forName("ISO-8859-1");

    /* loaded from: classes5.dex */
    public interface InfoRecord extends drainCache {
        int ICustomTabsCallback$Stub();

        ViewInfoStore$InfoRecord$ag$a ICustomTabsCallback$Stub$Proxy();

        byte[] ak$a();

        globalToLocal<? extends InfoRecord> asBinder();

        ByteString extraCallback();

        ViewInfoStore$InfoRecord$ag$a receiveFile();

        void valueOf(CodedOutputStream codedOutputStream) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface ProcessCallback {
        boolean valueOf(Class<?> cls);

        removeViewHolder values(Class<?> cls);
    }

    /* loaded from: classes5.dex */
    public interface toString extends ViewInfoStore$HaptikSDK$b<Double> {
    }

    /* loaded from: classes5.dex */
    public interface valueOf extends ViewInfoStore$HaptikSDK$b<Boolean> {
    }

    /* loaded from: classes5.dex */
    public interface values<T extends ViewInfoStore$ah$a> {
        T ag$a(int i);
    }

    public static int ah$a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int valueOf(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        byte[] bArr = new byte[0];
        values = bArr;
        ag$a = ByteBuffer.wrap(bArr);
        toString = getStartLine.valueOf(bArr);
    }

    public static <T> T valueOf(T t) {
        t.getClass();
        return t;
    }

    public static boolean toString(byte[] bArr) {
        return Utf8.valueOf(bArr);
    }

    public static String ah$a(byte[] bArr) {
        return new String(bArr, ah$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ah$a(byte[] bArr, int i, int i2) {
        int valueOf2 = valueOf(i2, bArr, i, i2);
        if (valueOf2 == 0) {
            return 1;
        }
        return valueOf2;
    }

    public static int valueOf(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object values(Object obj, Object obj2) {
        return ((InfoRecord) obj).receiveFile().toString((InfoRecord) obj2).HaptikSDK$d();
    }

    /* loaded from: classes5.dex */
    public static class invoke<F, T> extends AbstractList<T> {
        private final List<F> ah$a;
        private final valueOf<F, T> toString;

        /* loaded from: classes5.dex */
        public interface valueOf<F, T> {
            T ah$a(F f);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.toString.ah$a(this.ah$a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.ah$a.size();
        }
    }
}
