package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import o.RoundedBitmapDrawableFactory;
/* loaded from: classes3.dex */
public final class TintAwareDrawable implements getColorFilter {
    private final valueOf[] HaptikSDK$c;
    public final int ah$b;
    public final long invoke;
    public final int toString;
    public final Object valueOf;
    public final long values;
    public static final TintAwareDrawable ah$a = new TintAwareDrawable(null, new valueOf[0], 0, C.TIME_UNSET, 0);
    private static final valueOf HaptikSDK$a = new valueOf(0).toString(0);
    public static final getColorFilter$ah$a<TintAwareDrawable> ag$a = RoundedBitmapDrawableFactory.DefaultRoundedBitmapDrawable.toString;

    public static /* synthetic */ TintAwareDrawable ag$a(Bundle bundle) {
        return ah$a(bundle);
    }

    /* loaded from: classes3.dex */
    public static final class valueOf implements getColorFilter {
        public static final getColorFilter$ah$a<valueOf> toString = WrappedDrawable.values;
        public final Uri[] HaptikSDK$a;
        public final int[] HaptikSDK$c;
        public final int ag$a;
        public final long ah$a;
        public final long invoke;
        public final long[] valueOf;
        public final boolean values;

        public valueOf(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private valueOf(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            FingerprintManagerCompat.toString(iArr.length == uriArr.length);
            this.invoke = j;
            this.ag$a = i;
            this.HaptikSDK$c = iArr;
            this.HaptikSDK$a = uriArr;
            this.valueOf = jArr;
            this.ah$a = j2;
            this.values = z;
        }

        public int ag$a() {
            return valueOf(-1);
        }

        public int valueOf(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.HaptikSDK$c;
                if (i2 >= iArr.length || this.values || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        public boolean values() {
            return this.ag$a == -1 || ag$a() < this.ag$a;
        }

        public boolean ah$a() {
            if (this.ag$a == -1) {
                return true;
            }
            for (int i = 0; i < this.ag$a; i++) {
                int[] iArr = this.HaptikSDK$c;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            valueOf valueof = (valueOf) obj;
            return this.invoke == valueof.invoke && this.ag$a == valueof.ag$a && Arrays.equals(this.HaptikSDK$a, valueof.HaptikSDK$a) && Arrays.equals(this.HaptikSDK$c, valueof.HaptikSDK$c) && Arrays.equals(this.valueOf, valueof.valueOf) && this.ah$a == valueof.ah$a && this.values == valueof.values;
        }

        public int hashCode() {
            int i = this.ag$a;
            long j = this.invoke;
            int i2 = (int) (j ^ (j >>> 32));
            int hashCode = Arrays.hashCode(this.HaptikSDK$a);
            int hashCode2 = Arrays.hashCode(this.HaptikSDK$c);
            int hashCode3 = Arrays.hashCode(this.valueOf);
            long j2 = this.ah$a;
            return (((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.values ? 1 : 0);
        }

        public valueOf toString(int i) {
            int[] values = values(this.HaptikSDK$c, i);
            long[] values2 = values(this.valueOf, i);
            return new valueOf(this.invoke, i, values, (Uri[]) Arrays.copyOf(this.HaptikSDK$a, i), values2, this.ah$a, this.values);
        }

        public valueOf toString(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.HaptikSDK$a;
            if (length < uriArr.length) {
                jArr = values(jArr, uriArr.length);
            } else if (this.ag$a != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new valueOf(this.invoke, this.ag$a, this.HaptikSDK$c, this.HaptikSDK$a, jArr, this.ah$a, this.values);
        }

        private static int[] values(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] values(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, (long) C.TIME_UNSET);
            return copyOf;
        }

        @Override // o.getColorFilter
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(Integer.toString(0, 36), this.invoke);
            bundle.putInt(Integer.toString(1, 36), this.ag$a);
            bundle.putParcelableArrayList(Integer.toString(2, 36), new ArrayList<>(Arrays.asList(this.HaptikSDK$a)));
            bundle.putIntArray(Integer.toString(3, 36), this.HaptikSDK$c);
            bundle.putLongArray(Integer.toString(4, 36), this.valueOf);
            bundle.putLong(Integer.toString(5, 36), this.ah$a);
            bundle.putBoolean(Integer.toString(6, 36), this.values);
            return bundle;
        }

        public static valueOf values(Bundle bundle) {
            long j = bundle.getLong(Integer.toString(0, 36));
            int i = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            return new valueOf(j, i, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    private TintAwareDrawable(Object obj, valueOf[] valueofArr, long j, long j2, int i) {
        this.valueOf = obj;
        this.values = j;
        this.invoke = j2;
        this.toString = valueofArr.length + i;
        this.HaptikSDK$c = valueofArr;
        this.ah$b = i;
    }

    public valueOf ah$a(int i) {
        int i2 = this.ah$b;
        if (i < i2) {
            return HaptikSDK$a;
        }
        return this.HaptikSDK$c[i - i2];
    }

    public int values(long j, long j2) {
        int i = this.toString - 1;
        while (i >= 0 && valueOf(j, j2, i)) {
            i--;
        }
        if (i < 0 || !ah$a(i).ah$a()) {
            return -1;
        }
        return i;
    }

    public int ag$a(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i = this.ah$b;
            while (i < this.toString && ((ah$a(i).invoke != Long.MIN_VALUE && ah$a(i).invoke <= j) || !ah$a(i).values())) {
                i++;
            }
            if (i < this.toString) {
                return i;
            }
        }
        return -1;
    }

    public TintAwareDrawable ag$a(long[][] jArr) {
        FingerprintManagerCompat.ah$a(this.ah$b == 0);
        valueOf[] valueofArr = this.HaptikSDK$c;
        valueOf[] valueofArr2 = (valueOf[]) getElevationDegrees.ag$a(valueofArr, valueofArr.length);
        for (int i = 0; i < this.toString; i++) {
            valueofArr2[i] = valueofArr2[i].toString(jArr[i]);
        }
        return new TintAwareDrawable(this.valueOf, valueofArr2, this.values, this.invoke, this.ah$b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TintAwareDrawable tintAwareDrawable = (TintAwareDrawable) obj;
        return getElevationDegrees.values(this.valueOf, tintAwareDrawable.valueOf) && this.toString == tintAwareDrawable.toString && this.values == tintAwareDrawable.values && this.invoke == tintAwareDrawable.invoke && this.ah$b == tintAwareDrawable.ah$b && Arrays.equals(this.HaptikSDK$c, tintAwareDrawable.HaptikSDK$c);
    }

    public int hashCode() {
        int i = this.toString;
        Object obj = this.valueOf;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return (((((((((i * 31) + hashCode) * 31) + ((int) this.values)) * 31) + ((int) this.invoke)) * 31) + this.ah$b) * 31) + Arrays.hashCode(this.HaptikSDK$c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.valueOf);
        sb.append(", adResumePositionUs=");
        sb.append(this.values);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.HaptikSDK$c.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.HaptikSDK$c[i].invoke);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.HaptikSDK$c[i].HaptikSDK$c.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.HaptikSDK$c[i].HaptikSDK$c[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 == 4) {
                    sb.append('!');
                } else {
                    sb.append('?');
                }
                sb.append(", durationUs=");
                sb.append(this.HaptikSDK$c[i].valueOf[i2]);
                sb.append(')');
                if (i2 < this.HaptikSDK$c[i].HaptikSDK$c.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.HaptikSDK$c.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private boolean valueOf(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = ah$a(i).invoke;
        return j3 == Long.MIN_VALUE ? j2 == C.TIME_UNSET || j < j2 : j < j3;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (valueOf valueof : this.HaptikSDK$c) {
            arrayList.add(valueof.toBundle());
        }
        bundle.putParcelableArrayList(valueOf(1), arrayList);
        bundle.putLong(valueOf(2), this.values);
        bundle.putLong(valueOf(3), this.invoke);
        bundle.putInt(valueOf(4), this.ah$b);
        return bundle;
    }

    public static TintAwareDrawable ah$a(Bundle bundle) {
        valueOf[] valueofArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(valueOf(1));
        if (parcelableArrayList == null) {
            valueofArr = new valueOf[0];
        } else {
            valueOf[] valueofArr2 = new valueOf[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                valueofArr2[i] = valueOf.toString.ah$a((Bundle) parcelableArrayList.get(i));
            }
            valueofArr = valueofArr2;
        }
        return new TintAwareDrawable(null, valueofArr, bundle.getLong(valueOf(2), 0L), bundle.getLong(valueOf(3), C.TIME_UNSET), bundle.getInt(valueOf(4)));
    }

    private static String valueOf(int i) {
        return Integer.toString(i, 36);
    }
}
