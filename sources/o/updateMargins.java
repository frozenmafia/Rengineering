package o;

import com.bumptech.glide.load.EncodeStrategy;
import java.security.MessageDigest;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class updateMargins<T> {
    private static final updateMargins$ah$a<Object> toString = new updateMargins$ah$a<Object>() { // from class: o.updateMargins.1
        @Override // o.updateMargins$ah$a
        public void values(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    private final updateMargins$ah$a<T> ag$a;
    private volatile byte[] ah$a;
    private final T valueOf;
    private final String values;

    /* renamed from: o.updateMargins$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public interface Cdefault<T> extends ViewGroupKt<ViewKt$postDelayed$runnable$1<T>> {
        EncodeStrategy ag$a(setMargins setmargins);
    }

    public static <T> updateMargins<T> valueOf(String str) {
        return new updateMargins<>(str, null, ah$a());
    }

    public static <T> updateMargins<T> valueOf(String str, T t) {
        return new updateMargins<>(str, t, ah$a());
    }

    public static <T> updateMargins<T> ah$a(String str, T t, updateMargins$ah$a<T> updatemargins_ah_a) {
        return new updateMargins<>(str, t, updatemargins_ah_a);
    }

    private updateMargins(String str, T t, updateMargins$ah$a<T> updatemargins_ah_a) {
        this.values = WindowInsetsControllerCompat.Impl30.AnonymousClass2.valueOf(str);
        this.valueOf = t;
        this.ag$a = (updateMargins$ah$a) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(updatemargins_ah_a);
    }

    public T ag$a() {
        return this.valueOf;
    }

    public void values(T t, MessageDigest messageDigest) {
        this.ag$a.values(valueOf(), t, messageDigest);
    }

    private byte[] valueOf() {
        if (this.ah$a == null) {
            this.ah$a = this.values.getBytes(getDescendants.valueOf);
        }
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof updateMargins) {
            return this.values.equals(((updateMargins) obj).values);
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    private static <T> updateMargins$ah$a<T> ah$a() {
        return (updateMargins$ah$a<T>) toString;
    }

    public String toString() {
        return "Option{key='" + this.values + "'}";
    }
}
