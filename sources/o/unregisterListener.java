package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes6.dex */
public class unregisterListener {
    protected final AtomicReferenceArray<byte[]> ag$a;
    protected final AtomicReferenceArray<char[]> values;
    private static final int[] valueOf = {8000, 8000, 2000, 2000};
    private static final int[] ah$a = {4000, 4000, 200, 200};

    public unregisterListener() {
        this(4, 4);
    }

    protected unregisterListener(int i, int i2) {
        this.ag$a = new AtomicReferenceArray<>(i);
        this.values = new AtomicReferenceArray<>(i2);
    }

    public final byte[] toString(int i) {
        return valueOf(i, 0);
    }

    public byte[] valueOf(int i, int i2) {
        int ah$a2 = ah$a(i);
        if (i2 < ah$a2) {
            i2 = ah$a2;
        }
        byte[] andSet = this.ag$a.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? valueOf(i2) : andSet;
    }

    public void values(int i, byte[] bArr) {
        this.ag$a.set(i, bArr);
    }

    public final char[] values(int i) {
        return ag$a(i, 0);
    }

    public char[] ag$a(int i, int i2) {
        int ah$b = ah$b(i);
        if (i2 < ah$b) {
            i2 = ah$b;
        }
        char[] andSet = this.values.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? ag$a(i2) : andSet;
    }

    public void toString(int i, char[] cArr) {
        this.values.set(i, cArr);
    }

    protected int ah$a(int i) {
        return valueOf[i];
    }

    protected int ah$b(int i) {
        return ah$a[i];
    }

    protected byte[] valueOf(int i) {
        return new byte[i];
    }

    protected char[] ag$a(int i) {
        return new char[i];
    }
}
