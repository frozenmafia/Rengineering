package o;

import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes3.dex */
public final class extrasAvailable {
    public static final List<Throwable> ag$a(Throwable th) {
        runAnimators.valueOf(th, "$this$safeUnrollCauses");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            th = th.getCause();
        }
        return reserveEndViewTransition.ak(linkedHashSet);
    }
}
