package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes5.dex */
public final class ViewUtilsApi21$ag$a implements Iterable<T>, Transition.ArrayListManager {
    final /* synthetic */ invalidateChildInParent ag$a;

    public ViewUtilsApi21$ag$a(invalidateChildInParent invalidatechildinparent) {
        this.ag$a = invalidatechildinparent;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.ag$a.iterator();
    }
}
