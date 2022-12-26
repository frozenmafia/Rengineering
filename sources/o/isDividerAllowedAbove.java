package o;

import java.util.Objects;
/* loaded from: classes5.dex */
public final class isDividerAllowedAbove implements getNextId {
    private final getNextId valueOf;

    public isDividerAllowedAbove(getNextId getnextid) {
        this.valueOf = getnextid;
    }

    @Override // o.getNextId
    public final /* synthetic */ Object valueOf() {
        shouldUseGeneratedIds shouldusegeneratedids = (shouldUseGeneratedIds) this.valueOf.valueOf();
        Objects.requireNonNull(shouldusegeneratedids, "Cannot return null from a non-@Nullable @Provides method");
        return shouldusegeneratedids;
    }
}
