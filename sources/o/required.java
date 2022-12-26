package o;

import java.util.Objects;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public abstract class required<T, R> extends SwipeRefreshLayout.AnonymousClass2<R> {
    protected final SwipeRefreshLayout.AnonymousClass2<T> ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public required(SwipeRefreshLayout.AnonymousClass2<T> anonymousClass2) {
        Objects.requireNonNull(anonymousClass2, "source is null");
        this.ag$a = anonymousClass2;
    }
}
