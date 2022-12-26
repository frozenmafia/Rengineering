package o;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.Fragment;
/* loaded from: classes.dex */
public class FragmentActivity {
    private static Fragment.SavedState.AnonymousClass1 valueOf = startListening.ah$a();

    /* renamed from: o.FragmentActivity$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public interface AnonymousClass2 {
    }

    /* loaded from: classes4.dex */
    public class HostCallbacks extends FilterInputStream {
        private int ah$a;
        private int valueOf;

        public HostCallbacks(InputStream inputStream, int i) {
            super(inputStream);
            inputStream.getClass();
            if (i < 0) {
                throw new IllegalArgumentException("limit must be >= 0");
            }
            this.valueOf = i;
            this.ah$a = -1;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.valueOf == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.valueOf--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.valueOf;
            if (i3 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, Math.min(i2, i3));
            if (read > 0) {
                this.valueOf -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.valueOf));
            this.valueOf = (int) (this.valueOf - skip);
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return Math.min(this.in.available(), this.valueOf);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void mark(int i) {
            if (this.in.markSupported()) {
                this.in.mark(i);
                this.ah$a = this.valueOf;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("mark is not supported");
            }
            if (this.ah$a == -1) {
                throw new IOException("mark not set");
            }
            this.in.reset();
            this.valueOf = this.ah$a;
        }
    }

    public static boolean ah$a(int i) {
        return valueOf.toString(i);
    }

    public static void toString(String str, String str2, Object obj) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(str, String.format(null, str2, obj));
        }
    }

    public static void values(String str, String str2, Object obj, Object obj2) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(str, String.format(null, str2, obj, obj2));
        }
    }

    /* renamed from: o.FragmentActivity$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public abstract class AnonymousClass1<T> implements Cloneable, Closeable {
        private static int ah$b;
        protected final toString ag$a;
        protected final SharedReference<T> toString;
        protected final Throwable valueOf;
        protected boolean values = false;
        private static Class<AnonymousClass1> HaptikSDK$a = AnonymousClass1.class;
        private static final onGetHost<Closeable> ah$a = new onGetHost<Closeable>() { // from class: o.FragmentActivity.1.3
            @Override // o.onGetHost
            /* renamed from: toString */
            public void release(Closeable closeable) {
                try {
                    Fragment.AnonymousClass2.ag$a(closeable, true);
                } catch (IOException unused) {
                }
            }
        };
        private static final toString invoke = new toString() { // from class: o.FragmentActivity.1.1
            @Override // o.FragmentActivity.AnonymousClass1.toString
            public boolean requiresStacktrace() {
                return false;
            }

            @Override // o.FragmentActivity.AnonymousClass1.toString
            public void reportLeak(SharedReference<Object> sharedReference, Throwable th) {
                Object values = sharedReference.values();
                Class cls = AnonymousClass1.HaptikSDK$a;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(sharedReference));
                objArr[2] = values == null ? null : values.getClass().getName();
                FragmentActivity.toString((Class<?>) cls, "Finalized without closing: %x %x (type = %s)", objArr);
            }
        };

        /* renamed from: o.FragmentActivity$1$toString */
        /* loaded from: classes4.dex */
        public interface toString {
            void reportLeak(SharedReference<Object> sharedReference, Throwable th);

            boolean requiresStacktrace();
        }

        @Override // 
        /* renamed from: values */
        public abstract AnonymousClass1<T> clone();

        public static boolean valueOf() {
            return ah$b == 3;
        }

        public static void toString(int i) {
            ah$b = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AnonymousClass1(SharedReference<T> sharedReference, toString tostring, Throwable th) {
            this.toString = (SharedReference) sharedReference.getClass();
            sharedReference.ah$a();
            this.ag$a = tostring;
            this.valueOf = th;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AnonymousClass1(T t, onGetHost<T> ongethost, toString tostring, Throwable th) {
            this.toString = new SharedReference<>(t, ongethost);
            this.ag$a = tostring;
            this.valueOf = th;
        }

        /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lo/FragmentActivity$1<TT;>; */
        public static AnonymousClass1 values(Closeable closeable) {
            return ah$a(closeable, ah$a);
        }

        public static <T> AnonymousClass1<T> ah$a(T t, onGetHost<T> ongethost) {
            return valueOf(t, ongethost, invoke);
        }

        /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lo/FragmentActivity$1$toString;)Lo/FragmentActivity$1<TT;>; */
        public static AnonymousClass1 ag$a(Closeable closeable, toString tostring) {
            if (closeable == null) {
                return null;
            }
            return valueOf(closeable, ah$a, tostring, tostring.requiresStacktrace() ? new Throwable() : null);
        }

        public static <T> AnonymousClass1<T> valueOf(T t, onGetHost<T> ongethost, toString tostring) {
            if (t == null) {
                return null;
            }
            return valueOf(t, ongethost, tostring, tostring.requiresStacktrace() ? new Throwable() : null);
        }

        public static <T> AnonymousClass1<T> valueOf(T t, onGetHost<T> ongethost, toString tostring, Throwable th) {
            if (t == null) {
                return null;
            }
            if ((t instanceof Bitmap) || (t instanceof AnonymousClass2)) {
                int i = ah$b;
                if (i == 1) {
                    return new supportPostponeEnterTransition(t, ongethost, tostring, th);
                }
                if (i == 2) {
                    return new onHasWindowAnimations(t, ongethost, tostring, th);
                }
                if (i == 3) {
                    return new supportFinishAfterTransition(t, ongethost, tostring, th);
                }
            }
            return new supportStartPostponedEnterTransition(t, ongethost, tostring, th);
        }

        public T HaptikSDK$c() {
            T t;
            synchronized (this) {
                Fragment.AnonymousClass8.toString(!this.values);
                t = (T) this.toString.values().getClass();
            }
            return t;
        }

        public AnonymousClass1<T> ah$a() {
            synchronized (this) {
                if (HaptikSDK$a()) {
                    return clone();
                }
                return null;
            }
        }

        public boolean HaptikSDK$a() {
            boolean z;
            synchronized (this) {
                z = this.values;
            }
            return !z;
        }

        public SharedReference<T> invoke() {
            SharedReference<T> sharedReference;
            synchronized (this) {
                sharedReference = this.toString;
            }
            return sharedReference;
        }

        public int HaptikSDK$b() {
            if (HaptikSDK$a()) {
                return System.identityHashCode(this.toString.values());
            }
            return 0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                if (this.values) {
                    return;
                }
                this.values = true;
                this.toString.ag$a();
            }
        }

        public static boolean ah$a(AnonymousClass1<?> anonymousClass1) {
            return anonymousClass1 != null && anonymousClass1.HaptikSDK$a();
        }

        public static <T> AnonymousClass1<T> toString(AnonymousClass1<T> anonymousClass1) {
            if (anonymousClass1 != null) {
                return anonymousClass1.ah$a();
            }
            return null;
        }

        public static <T> List<AnonymousClass1<T>> ah$a(Collection<AnonymousClass1<T>> collection) {
            if (collection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            for (AnonymousClass1<T> anonymousClass1 : collection) {
                arrayList.add(toString(anonymousClass1));
            }
            return arrayList;
        }

        public static void valueOf(AnonymousClass1<?> anonymousClass1) {
            if (anonymousClass1 != null) {
                anonymousClass1.close();
            }
        }

        public static void valueOf(Iterable<? extends AnonymousClass1<?>> iterable) {
            if (iterable != null) {
                for (AnonymousClass1<?> anonymousClass1 : iterable) {
                    valueOf(anonymousClass1);
                }
            }
        }
    }

    public static void values(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(str, String.format(null, str2, obj, obj2, obj3));
        }
    }

    public static void ah$a(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(str, String.format(null, str2, obj, obj2, obj3, obj4));
        }
    }

    public static void toString(Class<?> cls, String str) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(cls.getSimpleName(), str);
        }
    }

    public static void toString(Class<?> cls, String str, Object obj) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void ag$a(Class<?> cls, String str, Object obj, Object obj2) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(cls.getSimpleName(), String.format(null, str, obj, obj2));
        }
    }

    public static void ah$a(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (ah$a(2)) {
            toString(cls, String.format(null, str, obj, obj2, obj3));
        }
    }

    public static void toString(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(cls.getSimpleName(), String.format(null, str, obj, obj2, obj3, obj4));
        }
    }

    public static void values(String str, String str2, Object... objArr) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(str, String.format(null, str2, objArr));
        }
    }

    public static void values(Class<?> cls, String str, Object... objArr) {
        if (valueOf.toString(2)) {
            valueOf.ag$a(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void toString(String str, String str2) {
        if (valueOf.toString(3)) {
            valueOf.ah$a(str, str2);
        }
    }

    public static void valueOf(String str, String str2, Object obj) {
        if (valueOf.toString(3)) {
            valueOf.ah$a(str, String.format(null, str2, obj));
        }
    }

    public static void valueOf(String str, String str2, Object obj, Object obj2) {
        if (valueOf.toString(3)) {
            valueOf.ah$a(str, String.format(null, str2, obj, obj2));
        }
    }

    public static void ag$a(Class<?> cls, String str, Object obj) {
        if (valueOf.toString(3)) {
            valueOf.ah$a(cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void ah$a(Class<?> cls, String str, Object... objArr) {
        if (valueOf.toString(3)) {
            valueOf.ah$a(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void ah$a(String str, String str2, Throwable th) {
        if (valueOf.toString(3)) {
            valueOf.values(str, str2, th);
        }
    }

    public static void valueOf(String str, String str2) {
        if (valueOf.toString(4)) {
            valueOf.values(str, str2);
        }
    }

    public static void values(String str, String str2, Object obj) {
        if (valueOf.toString(4)) {
            valueOf.values(str, String.format(null, str2, obj));
        }
    }

    public static void toString(String str, String str2, Object obj, Object obj2) {
        if (valueOf.toString(4)) {
            valueOf.values(str, String.format(null, str2, obj, obj2));
        }
    }

    public static void toString(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (valueOf.toString(4)) {
            valueOf.values(str, String.format(null, str2, obj, obj2, obj3));
        }
    }

    public static void ag$a(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (valueOf.toString(4)) {
            valueOf.values(str, String.format(null, str2, obj, obj2, obj3, obj4));
        }
    }

    public static void ag$a(String str, String str2, Object... objArr) {
        if (valueOf.toString(4)) {
            valueOf.values(str, String.format(null, str2, objArr));
        }
    }

    public static void ah$a(String str, String str2) {
        if (valueOf.toString(5)) {
            valueOf.valueOf(str, str2);
        }
    }

    public static void values(Class<?> cls, String str) {
        if (valueOf.toString(5)) {
            valueOf.valueOf(cls.getSimpleName(), str);
        }
    }

    public static void ah$a(String str, String str2, Object... objArr) {
        if (valueOf.toString(5)) {
            valueOf.valueOf(str, String.format(null, str2, objArr));
        }
    }

    public static void toString(String str, Throwable th, String str2, Object... objArr) {
        if (valueOf.toString(5)) {
            valueOf.ah$a(str, String.format(null, str2, objArr), th);
        }
    }

    public static void toString(Class<?> cls, String str, Object... objArr) {
        if (valueOf.toString(5)) {
            valueOf.valueOf(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void ag$a(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (ah$a(5)) {
            values(cls, String.format(null, str, objArr), th);
        }
    }

    public static void values(String str, String str2, Throwable th) {
        if (valueOf.toString(5)) {
            valueOf.ah$a(str, str2, th);
        }
    }

    public static void values(Class<?> cls, String str, Throwable th) {
        if (valueOf.toString(5)) {
            valueOf.ah$a(cls.getSimpleName(), str, th);
        }
    }

    public static void values(String str, String str2) {
        if (valueOf.toString(6)) {
            valueOf.toString(str, str2);
        }
    }

    public static void valueOf(Class<?> cls, String str) {
        if (valueOf.toString(6)) {
            valueOf.toString(cls.getSimpleName(), str);
        }
    }

    public static void valueOf(String str, String str2, Object... objArr) {
        if (valueOf.toString(6)) {
            valueOf.toString(str, String.format(null, str2, objArr));
        }
    }

    public static void valueOf(Class<?> cls, String str, Object... objArr) {
        if (valueOf.toString(6)) {
            valueOf.toString(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void toString(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (valueOf.toString(6)) {
            valueOf.toString(cls.getSimpleName(), String.format(null, str, objArr), th);
        }
    }

    public static void valueOf(String str, String str2, Throwable th) {
        if (valueOf.toString(6)) {
            valueOf.toString(str, str2, th);
        }
    }

    public static void toString(Class<?> cls, String str, Throwable th) {
        if (valueOf.toString(6)) {
            valueOf.toString(cls.getSimpleName(), str, th);
        }
    }

    public static void ag$a(String str, String str2) {
        if (valueOf.toString(6)) {
            valueOf.invoke(str, str2);
        }
    }

    public static void toString(String str, String str2, Object... objArr) {
        if (valueOf.toString(6)) {
            valueOf.invoke(str, String.format(null, str2, objArr));
        }
    }

    public static void toString(String str, String str2, Throwable th) {
        if (valueOf.toString(6)) {
            valueOf.ag$a(str, str2, th);
        }
    }

    public static void ag$a(Class<?> cls, String str, Throwable th) {
        if (valueOf.toString(6)) {
            valueOf.ag$a(cls.getSimpleName(), str, th);
        }
    }
}
