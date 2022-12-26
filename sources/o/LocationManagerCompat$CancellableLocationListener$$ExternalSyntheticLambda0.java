package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import o.LocationManagerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 extends hasEphemerisData {
    private final int HaptikSDK$a;
    private final RoundedBitmapDrawable[] HaptikSDK$b;
    private final int HaptikSDK$c;
    private final int[] ah$a;
    private final Object[] invoke;
    private final HashMap<Object, Integer> valueOf;
    private final int[] values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0(Collection<? extends LocationManagerCompat.CancellableLocationListener> collection, equalsByteArrayList equalsbytearraylist) {
        super(false, equalsbytearraylist);
        int i = 0;
        int size = collection.size();
        this.ah$a = new int[size];
        this.values = new int[size];
        this.HaptikSDK$b = new RoundedBitmapDrawable[size];
        this.invoke = new Object[size];
        this.valueOf = new HashMap<>();
        int i2 = 0;
        int i3 = 0;
        for (LocationManagerCompat.CancellableLocationListener cancellableLocationListener : collection) {
            this.HaptikSDK$b[i3] = cancellableLocationListener.valueOf();
            this.values[i3] = i;
            this.ah$a[i3] = i2;
            i += this.HaptikSDK$b[i3].ah$a();
            i2 += this.HaptikSDK$b[i3].ag$a();
            this.invoke[i3] = cancellableLocationListener.ah$a();
            this.valueOf.put(this.invoke[i3], Integer.valueOf(i3));
            i3++;
        }
        this.HaptikSDK$a = i;
        this.HaptikSDK$c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<RoundedBitmapDrawable> valueOf() {
        return Arrays.asList(this.HaptikSDK$b);
    }

    @Override // o.hasEphemerisData
    protected int ag$a(int i) {
        return getElevationDegrees.toString(this.ah$a, i + 1, false, false);
    }

    @Override // o.hasEphemerisData
    protected int valueOf(int i) {
        return getElevationDegrees.toString(this.values, i + 1, false, false);
    }

    @Override // o.hasEphemerisData
    protected int valueOf(Object obj) {
        Integer num = this.valueOf.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // o.hasEphemerisData
    protected RoundedBitmapDrawable ah$b(int i) {
        return this.HaptikSDK$b[i];
    }

    @Override // o.hasEphemerisData
    protected int values(int i) {
        return this.ah$a[i];
    }

    @Override // o.hasEphemerisData
    protected int HaptikSDK$c(int i) {
        return this.values[i];
    }

    @Override // o.hasEphemerisData
    protected Object ah$a(int i) {
        return this.invoke[i];
    }

    @Override // o.RoundedBitmapDrawable
    public int ah$a() {
        return this.HaptikSDK$a;
    }

    @Override // o.RoundedBitmapDrawable
    public int ag$a() {
        return this.HaptikSDK$c;
    }
}
