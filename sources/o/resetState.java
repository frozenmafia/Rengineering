package o;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class resetState implements getNextId {
    private final createInstanceForTests toString;

    public resetState(createInstanceForTests createinstancefortests) {
        this.toString = createinstancefortests;
    }

    public final Context ag$a() {
        Context valueOf = this.toString.valueOf();
        Objects.requireNonNull(valueOf, "Cannot return null from a non-@Nullable @Provides method");
        return valueOf;
    }

    @Override // o.getNextId
    public final /* synthetic */ Object valueOf() {
        Context valueOf = this.toString.valueOf();
        Objects.requireNonNull(valueOf, "Cannot return null from a non-@Nullable @Provides method");
        return valueOf;
    }
}
