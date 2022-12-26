package o;

import java.util.List;
import java.util.Set;
import o.CallbackToFutureAdapter;
/* loaded from: classes3.dex */
public class getInterpolator extends androidx.databinding.BaseObservable implements CallbackToFutureAdapter.FutureGarbageCollectedException {
    private Set<valueOf> ag$a;
    private String toString;
    private final getAlwaysExpand<getVelocity> valueOf;
    private List<getVelocity> values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void valueOf(getVelocity getvelocity);
    }

    public getAlwaysExpand<getVelocity> valueOf() {
        return this.valueOf;
    }

    public String ag$a() {
        return this.toString;
    }

    public List<getVelocity> values() {
        return this.values;
    }

    @Override // o.CallbackToFutureAdapter.FutureGarbageCollectedException
    public void toString(getVelocity getvelocity) {
        for (valueOf valueof : this.ag$a) {
            valueof.valueOf(getvelocity);
        }
    }
}
