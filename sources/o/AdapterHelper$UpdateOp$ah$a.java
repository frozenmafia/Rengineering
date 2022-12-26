package o;

import com.google.common.cache.LongAddables;
import o.AdapterHelper;
/* loaded from: classes7.dex */
public final class AdapterHelper$UpdateOp$ah$a implements AdapterHelper.UpdateOp.toString {
    private final AdapterListUpdateCallback ag$a;
    private final AdapterListUpdateCallback ah$a;
    private final AdapterListUpdateCallback invoke;
    private final AdapterListUpdateCallback toString;
    private final AdapterListUpdateCallback valueOf;
    private final AdapterListUpdateCallback values;

    private static long ah$a(long j) {
        if (j >= 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    public AdapterHelper$UpdateOp$ah$a() {
        AdapterListUpdateCallback adapterListUpdateCallback;
        AdapterListUpdateCallback adapterListUpdateCallback2;
        AdapterListUpdateCallback adapterListUpdateCallback3;
        AdapterListUpdateCallback adapterListUpdateCallback4;
        AdapterListUpdateCallback adapterListUpdateCallback5;
        AdapterListUpdateCallback adapterListUpdateCallback6;
        adapterListUpdateCallback = LongAddables.ag$a.get();
        this.values = adapterListUpdateCallback;
        adapterListUpdateCallback2 = LongAddables.ag$a.get();
        this.ah$a = adapterListUpdateCallback2;
        adapterListUpdateCallback3 = LongAddables.ag$a.get();
        this.toString = adapterListUpdateCallback3;
        adapterListUpdateCallback4 = LongAddables.ag$a.get();
        this.ag$a = adapterListUpdateCallback4;
        adapterListUpdateCallback5 = LongAddables.ag$a.get();
        this.invoke = adapterListUpdateCallback5;
        adapterListUpdateCallback6 = LongAddables.ag$a.get();
        this.valueOf = adapterListUpdateCallback6;
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public void valueOf(int i) {
        this.values.add(i);
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public void ah$a(int i) {
        this.ah$a.add(i);
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public void ag$a(long j) {
        this.toString.increment();
        this.invoke.add(j);
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public void valueOf(long j) {
        this.ag$a.increment();
        this.invoke.add(j);
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public void ah$a() {
        this.valueOf.increment();
    }

    @Override // o.AdapterHelper.UpdateOp.toString
    public onRemoved valueOf() {
        return new onRemoved(ah$a(this.values.sum()), ah$a(this.ah$a.sum()), ah$a(this.toString.sum()), ah$a(this.ag$a.sum()), ah$a(this.invoke.sum()), ah$a(this.valueOf.sum()));
    }

    public void toString(AdapterHelper.UpdateOp.toString tostring) {
        onRemoved valueOf = tostring.valueOf();
        this.values.add(valueOf.ag$a());
        this.ah$a.add(valueOf.HaptikSDK$c());
        this.toString.add(valueOf.valueOf());
        this.ag$a.add(valueOf.values());
        this.invoke.add(valueOf.HaptikSDK$b());
        this.valueOf.add(valueOf.ah$a());
    }
}
