package o;

import android.content.Context;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes3.dex */
public class updateMarginsRelative<T> implements ViewGroupKt$iterator$1<T> {
    private final Collection<? extends ViewGroupKt$iterator$1<T>> ag$a;

    /* renamed from: o.updateMarginsRelative$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class Cdefault extends OutputStream {
        private final OutputStream ag$a;
        private int ah$a;
        private byte[] toString;
        private rotationXBy values;

        public Cdefault(OutputStream outputStream, rotationXBy rotationxby) {
            this(outputStream, rotationxby, 65536);
        }

        Cdefault(OutputStream outputStream, rotationXBy rotationxby, int i) {
            this.ag$a = outputStream;
            this.values = rotationxby;
            this.toString = (byte[]) rotationxby.ah$a(i, byte[].class);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this.toString;
            int i2 = this.ah$a;
            this.ah$a = i2 + 1;
            bArr[i2] = (byte) i;
            values();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            do {
                int i4 = i2 - i3;
                int i5 = i + i3;
                int i6 = this.ah$a;
                if (i6 == 0 && i4 >= this.toString.length) {
                    this.ag$a.write(bArr, i5, i4);
                    return;
                }
                int min = Math.min(i4, this.toString.length - i6);
                System.arraycopy(bArr, i5, this.toString, this.ah$a, min);
                this.ah$a += min;
                i3 += min;
                values();
            } while (i3 < i2);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            ah$a();
            this.ag$a.flush();
        }

        private void ah$a() throws IOException {
            int i = this.ah$a;
            if (i > 0) {
                this.ag$a.write(this.toString, 0, i);
                this.ah$a = 0;
            }
        }

        private void values() throws IOException {
            if (this.ah$a == this.toString.length) {
                ah$a();
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                flush();
                this.ag$a.close();
                ag$a();
            } catch (Throwable th) {
                this.ag$a.close();
                throw th;
            }
        }

        private void ag$a() {
            byte[] bArr = this.toString;
            if (bArr != null) {
                this.values.ag$a(bArr);
                this.toString = null;
            }
        }
    }

    @SafeVarargs
    public updateMarginsRelative(ViewGroupKt$iterator$1<T>... viewGroupKt$iterator$1Arr) {
        if (viewGroupKt$iterator$1Arr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.ag$a = Arrays.asList(viewGroupKt$iterator$1Arr);
    }

    @Override // o.ViewGroupKt$iterator$1
    public ViewKt$postDelayed$runnable$1<T> valueOf(Context context, ViewKt$postDelayed$runnable$1<T> viewKt$postDelayed$runnable$1, int i, int i2) {
        ViewKt$postDelayed$runnable$1<T> viewKt$postDelayed$runnable$12 = viewKt$postDelayed$runnable$1;
        for (ViewGroupKt$iterator$1<T> viewGroupKt$iterator$1 : this.ag$a) {
            ViewKt$postDelayed$runnable$1<T> valueOf = viewGroupKt$iterator$1.valueOf(context, viewKt$postDelayed$runnable$12, i, i2);
            if (viewKt$postDelayed$runnable$12 != null && !viewKt$postDelayed$runnable$12.equals(viewKt$postDelayed$runnable$1) && !viewKt$postDelayed$runnable$12.equals(valueOf)) {
                viewKt$postDelayed$runnable$12.HaptikSDK$a();
            }
            viewKt$postDelayed$runnable$12 = valueOf;
        }
        return viewKt$postDelayed$runnable$12;
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof updateMarginsRelative) {
            return this.ag$a.equals(((updateMarginsRelative) obj).ag$a);
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        return this.ag$a.hashCode();
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        for (ViewGroupKt$iterator$1<T> viewGroupKt$iterator$1 : this.ag$a) {
            viewGroupKt$iterator$1.ag$a(messageDigest);
        }
    }
}
