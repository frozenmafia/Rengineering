package o;

import com.google.common.collect.Multisets;
import java.util.Arrays;
/* loaded from: classes7.dex */
public class extendRangeInto<K> {
    private transient int[] HaptikSDK$a;
    private transient int HaptikSDK$c;
    public transient int ag$a;
    transient int[] ah$a;
    private transient float ah$b;
    transient int toString;
    transient Object[] valueOf;
    transient long[] values;

    private static int ag$a(long j) {
        return (int) j;
    }

    private static int ah$a(long j) {
        return (int) (j >>> 32);
    }

    private static long ah$a(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    public int values(int i, int i2) {
        return i - 1;
    }

    public static <K> extendRangeInto<K> ah$a() {
        return new extendRangeInto<>();
    }

    public static <K> extendRangeInto<K> toString(int i) {
        return new extendRangeInto<>(i);
    }

    extendRangeInto() {
        toString(3, 1.0f);
    }

    public extendRangeInto(extendRangeInto<? extends K> extendrangeinto) {
        toString(extendrangeinto.valueOf(), 1.0f);
        int ag$a = extendrangeinto.ag$a();
        while (ag$a != -1) {
            values((extendRangeInto<K>) extendrangeinto.valueOf(ag$a), extendrangeinto.ah$a(ag$a));
            ag$a = extendrangeinto.HaptikSDK$c(ag$a);
        }
    }

    public extendRangeInto(int i) {
        this(i, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public extendRangeInto(int i, float f) {
        toString(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(int i, float f) {
        markViewHoldersUpdated.toString(i >= 0, "Initial capacity must be non-negative");
        markViewHoldersUpdated.toString(f > 0.0f, "Illegal load factor");
        int ag$a = fillData.ag$a(i, f);
        this.HaptikSDK$a = HaptikWebView(ag$a);
        this.ah$b = f;
        this.valueOf = new Object[i];
        this.ah$a = new int[i];
        this.values = HaptikSDK$b(i);
        this.HaptikSDK$c = Math.max(1, (int) (ag$a * f));
    }

    private static int[] HaptikWebView(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] HaptikSDK$b(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private int HaptikSDK$c() {
        return this.HaptikSDK$a.length - 1;
    }

    public int ag$a() {
        return this.toString == 0 ? -1 : 0;
    }

    public int HaptikSDK$c(int i) {
        int i2 = i + 1;
        if (i2 < this.toString) {
            return i2;
        }
        return -1;
    }

    public int valueOf() {
        return this.toString;
    }

    public K valueOf(int i) {
        markViewHoldersUpdated.toString(i, this.toString);
        return (K) this.valueOf[i];
    }

    public int ah$a(int i) {
        markViewHoldersUpdated.toString(i, this.toString);
        return this.ah$a[i];
    }

    public void toString(int i, int i2) {
        markViewHoldersUpdated.toString(i, this.toString);
        this.ah$a[i] = i2;
    }

    public refreshData$ag$a<K> ag$a(final int i) {
        markViewHoldersUpdated.toString(i, this.toString);
        return new Multisets.toString<K>(i) { // from class: o.extendRangeInto$ag$a
            final K valueOf;
            int values;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            {
                this.valueOf = extendRangeInto.this.valueOf[i];
                this.values = i;
            }

            @Override // o.refreshData$ag$a
            public K getElement() {
                return this.valueOf;
            }

            void ag$a() {
                int i2 = this.values;
                if (i2 == -1 || i2 >= extendRangeInto.this.valueOf() || !recycleUpdateOp.values(this.valueOf, extendRangeInto.this.valueOf[this.values])) {
                    this.values = extendRangeInto.this.toString(this.valueOf);
                }
            }

            @Override // o.refreshData$ag$a
            public int getCount() {
                ag$a();
                if (this.values == -1) {
                    return 0;
                }
                return extendRangeInto.this.ah$a[this.values];
            }
        };
    }

    public void values(int i) {
        if (i > this.values.length) {
            HaptikSDK$a(i);
        }
        if (i >= this.HaptikSDK$c) {
            getSignupData(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public int values(K k, int i) {
        getChangePayload.valueOf(i, "count");
        long[] jArr = this.values;
        Object[] objArr = this.valueOf;
        int[] iArr = this.ah$a;
        int values = fillData.values(k);
        int HaptikSDK$c = HaptikSDK$c() & values;
        int i2 = this.toString;
        int[] iArr2 = this.HaptikSDK$a;
        int i3 = iArr2[HaptikSDK$c];
        if (i3 == -1) {
            iArr2[HaptikSDK$c] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (ah$a(j) == values && recycleUpdateOp.values(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int ag$a = ag$a(j);
                if (ag$a == -1) {
                    jArr[i3] = ah$a(j, i2);
                    break;
                }
                i3 = ag$a;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        HaptikSDK$d(i5);
        toString(i2, k, i, values);
        this.toString = i5;
        if (i2 >= this.HaptikSDK$c) {
            getSignupData(this.HaptikSDK$a.length * 2);
        }
        this.ag$a++;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(int i, K k, int i2, int i3) {
        this.values[i] = (i3 << 32) | 4294967295L;
        this.valueOf[i] = k;
        this.ah$a[i] = i2;
    }

    private void HaptikSDK$d(int i) {
        int length = this.values.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                HaptikSDK$a(max);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$a(int i) {
        this.valueOf = Arrays.copyOf(this.valueOf, i);
        this.ah$a = Arrays.copyOf(this.ah$a, i);
        long[] jArr = this.values;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.values = copyOf;
    }

    private void getSignupData(int i) {
        if (this.HaptikSDK$a.length >= 1073741824) {
            this.HaptikSDK$c = Integer.MAX_VALUE;
            return;
        }
        int i2 = (int) (i * this.ah$b);
        int[] HaptikWebView = HaptikWebView(i);
        long[] jArr = this.values;
        int length = HaptikWebView.length;
        for (int i3 = 0; i3 < this.toString; i3++) {
            int ah$a = ah$a(jArr[i3]);
            int i4 = (length - 1) & ah$a;
            int i5 = HaptikWebView[i4];
            HaptikWebView[i4] = i3;
            jArr[i3] = (ah$a << 32) | (i5 & 4294967295L);
        }
        this.HaptikSDK$c = i2 + 1;
        this.HaptikSDK$a = HaptikWebView;
    }

    public int toString(Object obj) {
        int values = fillData.values(obj);
        int i = this.HaptikSDK$a[HaptikSDK$c() & values];
        while (i != -1) {
            long j = this.values[i];
            if (ah$a(j) == values && recycleUpdateOp.values(obj, this.valueOf[i])) {
                return i;
            }
            i = ag$a(j);
        }
        return -1;
    }

    public int ah$a(Object obj) {
        int extendrangeinto = toString(obj);
        if (extendrangeinto == -1) {
            return 0;
        }
        return this.ah$a[extendrangeinto];
    }

    public int values(Object obj) {
        return valueOf(obj, fillData.values(obj));
    }

    private int valueOf(Object obj, int i) {
        int HaptikSDK$c = HaptikSDK$c() & i;
        int i2 = this.HaptikSDK$a[HaptikSDK$c];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (ah$a(this.values[i2]) == i && recycleUpdateOp.values(obj, this.valueOf[i2])) {
                int i4 = this.ah$a[i2];
                if (i3 == -1) {
                    this.HaptikSDK$a[HaptikSDK$c] = ag$a(this.values[i2]);
                } else {
                    long[] jArr = this.values;
                    jArr[i3] = ah$a(jArr[i3], ag$a(jArr[i2]));
                }
                invoke(i2);
                this.toString--;
                this.ag$a++;
                return i4;
            }
            int ag$a = ag$a(this.values[i2]);
            if (ag$a == -1) {
                return 0;
            }
            i3 = i2;
            i2 = ag$a;
        }
    }

    public int ah$b(int i) {
        return valueOf(this.valueOf[i], ah$a(this.values[i]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void invoke(int i) {
        int valueOf = valueOf() - 1;
        if (i < valueOf) {
            Object[] objArr = this.valueOf;
            objArr[i] = objArr[valueOf];
            int[] iArr = this.ah$a;
            iArr[i] = iArr[valueOf];
            objArr[valueOf] = null;
            iArr[valueOf] = 0;
            long[] jArr = this.values;
            long j = jArr[valueOf];
            jArr[i] = j;
            jArr[valueOf] = -1;
            int ah$a = ah$a(j) & HaptikSDK$c();
            int[] iArr2 = this.HaptikSDK$a;
            int i2 = iArr2[ah$a];
            if (i2 == valueOf) {
                iArr2[ah$a] = i;
                return;
            }
            while (true) {
                long j2 = this.values[i2];
                int ag$a = ag$a(j2);
                if (ag$a == valueOf) {
                    this.values[i2] = ah$a(j2, i);
                    return;
                }
                i2 = ag$a;
            }
        } else {
            this.valueOf[i] = null;
            this.ah$a[i] = 0;
            this.values[i] = -1;
        }
    }

    public void values() {
        this.ag$a++;
        Arrays.fill(this.valueOf, 0, this.toString, (Object) null);
        Arrays.fill(this.ah$a, 0, this.toString, 0);
        Arrays.fill(this.HaptikSDK$a, -1);
        Arrays.fill(this.values, -1L);
        this.toString = 0;
    }
}
