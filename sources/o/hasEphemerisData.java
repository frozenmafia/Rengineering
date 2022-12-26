package o;

import o.RoundedBitmapDrawable;
/* loaded from: classes3.dex */
public abstract class hasEphemerisData extends RoundedBitmapDrawable {
    private final int ah$a;
    private final equalsByteArrayList valueOf;
    private final boolean values;

    protected abstract int HaptikSDK$c(int i);

    protected abstract int ag$a(int i);

    protected abstract Object ah$a(int i);

    protected abstract RoundedBitmapDrawable ah$b(int i);

    protected abstract int valueOf(int i);

    protected abstract int valueOf(Object obj);

    protected abstract int values(int i);

    public static Object values(Object obj) {
        return ((android.util.Pair) obj).first;
    }

    public static Object toString(Object obj) {
        return ((android.util.Pair) obj).second;
    }

    public static Object ah$a(Object obj, Object obj2) {
        return android.util.Pair.create(obj, obj2);
    }

    public hasEphemerisData(boolean z, equalsByteArrayList equalsbytearraylist) {
        this.values = z;
        this.valueOf = equalsbytearraylist;
        this.ah$a = equalsbytearraylist.values();
    }

    @Override // o.RoundedBitmapDrawable
    public int ah$a(int i, int i2, boolean z) {
        if (this.values) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int valueOf = valueOf(i);
        int HaptikSDK$c = HaptikSDK$c(valueOf);
        int ah$a = ah$b(valueOf).ah$a(i - HaptikSDK$c, i2 != 2 ? i2 : 0, z);
        if (ah$a != -1) {
            return HaptikSDK$c + ah$a;
        }
        int values = values(valueOf, z);
        while (values != -1 && ah$b(values).values()) {
            values = values(values, z);
        }
        if (values != -1) {
            return HaptikSDK$c(values) + ah$b(values).ah$a(z);
        }
        if (i2 == 2) {
            return ah$a(z);
        }
        return -1;
    }

    @Override // o.RoundedBitmapDrawable
    public int ag$a(int i, int i2, boolean z) {
        if (this.values) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int valueOf = valueOf(i);
        int HaptikSDK$c = HaptikSDK$c(valueOf);
        int ag$a = ah$b(valueOf).ag$a(i - HaptikSDK$c, i2 != 2 ? i2 : 0, z);
        if (ag$a != -1) {
            return HaptikSDK$c + ag$a;
        }
        int ah$a = ah$a(valueOf, z);
        while (ah$a != -1 && ah$b(ah$a).values()) {
            ah$a = ah$a(ah$a, z);
        }
        if (ah$a != -1) {
            return HaptikSDK$c(ah$a) + ah$b(ah$a).valueOf(z);
        }
        if (i2 == 2) {
            return valueOf(z);
        }
        return -1;
    }

    @Override // o.RoundedBitmapDrawable
    public int valueOf(boolean z) {
        int i = this.ah$a;
        if (i == 0) {
            return -1;
        }
        if (this.values) {
            z = false;
        }
        int ag$a = z ? this.valueOf.ag$a() : i - 1;
        while (ah$b(ag$a).values()) {
            ag$a = ah$a(ag$a, z);
            if (ag$a == -1) {
                return -1;
            }
        }
        return HaptikSDK$c(ag$a) + ah$b(ag$a).valueOf(z);
    }

    @Override // o.RoundedBitmapDrawable
    public int ah$a(boolean z) {
        if (this.ah$a == 0) {
            return -1;
        }
        if (this.values) {
            z = false;
        }
        int ah$a = z ? this.valueOf.ah$a() : 0;
        while (ah$b(ah$a).values()) {
            ah$a = values(ah$a, z);
            if (ah$a == -1) {
                return -1;
            }
        }
        return HaptikSDK$c(ah$a) + ah$b(ah$a).ah$a(z);
    }

    @Override // o.RoundedBitmapDrawable
    public final RoundedBitmapDrawable.toString values(int i, RoundedBitmapDrawable.toString tostring, long j) {
        int valueOf = valueOf(i);
        int HaptikSDK$c = HaptikSDK$c(valueOf);
        int values = values(valueOf);
        ah$b(valueOf).values(i - HaptikSDK$c, tostring, j);
        Object ah$a = ah$a(valueOf);
        if (!RoundedBitmapDrawable.toString.valueOf.equals(tostring.onXdkEvent)) {
            ah$a = android.util.Pair.create(ah$a, tostring.onXdkEvent);
        }
        tostring.onXdkEvent = ah$a;
        tostring.HaptikSDK$a += values;
        tostring.getInitSettings += values;
        return tostring;
    }

    @Override // o.RoundedBitmapDrawable
    public final RoundedBitmapDrawable.values toString(Object obj, RoundedBitmapDrawable.values valuesVar) {
        Object values = values(obj);
        Object hasephemerisdata = toString(obj);
        int valueOf = valueOf(values);
        int HaptikSDK$c = HaptikSDK$c(valueOf);
        ah$b(valueOf).toString(hasephemerisdata, valuesVar);
        valuesVar.HaptikSDK$c += HaptikSDK$c;
        valuesVar.ah$b = obj;
        return valuesVar;
    }

    @Override // o.RoundedBitmapDrawable
    public final RoundedBitmapDrawable.values toString(int i, RoundedBitmapDrawable.values valuesVar, boolean z) {
        int ag$a = ag$a(i);
        int HaptikSDK$c = HaptikSDK$c(ag$a);
        ah$b(ag$a).toString(i - values(ag$a), valuesVar, z);
        valuesVar.HaptikSDK$c += HaptikSDK$c;
        if (z) {
            valuesVar.ah$b = android.util.Pair.create(ah$a(ag$a), FingerprintManagerCompat.toString(valuesVar.ah$b));
        }
        return valuesVar;
    }

    @Override // o.RoundedBitmapDrawable
    public final int ah$a(Object obj) {
        int ah$a;
        if (obj instanceof android.util.Pair) {
            Object values = values(obj);
            Object hasephemerisdata = toString(obj);
            int valueOf = valueOf(values);
            if (valueOf == -1 || (ah$a = ah$b(valueOf).ah$a(hasephemerisdata)) == -1) {
                return -1;
            }
            return values(valueOf) + ah$a;
        }
        return -1;
    }

    @Override // o.RoundedBitmapDrawable
    public final Object toString(int i) {
        int ag$a = ag$a(i);
        return android.util.Pair.create(ah$a(ag$a), ah$b(ag$a).toString(i - values(ag$a)));
    }

    private int values(int i, boolean z) {
        if (z) {
            return this.valueOf.toString(i);
        }
        if (i < this.ah$a - 1) {
            return i + 1;
        }
        return -1;
    }

    private int ah$a(int i, boolean z) {
        if (z) {
            return this.valueOf.valueOf(i);
        }
        if (i > 0) {
            return (-1) + i;
        }
        return -1;
    }
}
