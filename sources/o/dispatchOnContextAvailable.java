package o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class dispatchOnContextAvailable {
    private final Map<String, ContextAwareKt> valueOf = new LinkedHashMap();

    public final Set<String> values(ContextAwareKt contextAwareKt) {
        runAnimators.valueOf(contextAwareKt, "apolloRecord");
        ContextAwareKt contextAwareKt2 = this.valueOf.get(contextAwareKt.ag$a());
        if (contextAwareKt2 == null) {
            this.valueOf.put(contextAwareKt.ag$a(), contextAwareKt);
            return oops.valueOf();
        }
        return contextAwareKt2.valueOf(contextAwareKt);
    }

    public final Collection<ContextAwareKt> ah$a() {
        return reserveEndViewTransition.ak(this.valueOf.values());
    }
}
