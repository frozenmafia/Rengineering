package o;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
final class withContextAvailable$ah$a {
    private ContextAwareKt ah$a;
    private final List<ContextAwareKt> toString;

    public withContextAvailable$ah$a(ContextAwareKt contextAwareKt) {
        runAnimators.valueOf(contextAwareKt, "mutationRecord");
        this.ah$a = contextAwareKt.HaptikSDK$a().valueOf();
        this.toString = runAnimators.ag$a(new ContextAwareKt[]{contextAwareKt.HaptikSDK$a().valueOf()}, "elements");
    }

    public final ContextAwareKt values() {
        return this.ah$a;
    }

    public final List<ContextAwareKt> ag$a() {
        return this.toString;
    }

    public final Set<String> ah$a(ContextAwareKt contextAwareKt) {
        runAnimators.valueOf(contextAwareKt, "record");
        List<ContextAwareKt> list = this.toString;
        list.add(list.size(), contextAwareKt.HaptikSDK$a().valueOf());
        return this.ah$a.valueOf(contextAwareKt);
    }

    public final Set<String> ah$a(UUID uuid) {
        runAnimators.valueOf(uuid, "mutationId");
        Iterator<ContextAwareKt> it = this.toString.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (runAnimators.values(uuid, it.next().ah$a())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return oops.valueOf();
        }
        Set values = oops.values();
        values.add(this.toString.remove(i).ag$a());
        int i2 = i - 1;
        int size = this.toString.size();
        for (int max = Math.max(0, i2); max < size; max++) {
            ContextAwareKt contextAwareKt = this.toString.get(max);
            if (max == Math.max(0, i2)) {
                this.ah$a = contextAwareKt.HaptikSDK$a().valueOf();
            } else {
                values.addAll(this.ah$a.valueOf(contextAwareKt));
            }
        }
        return runAnimators.ag$a(values, "builder");
    }
}
