package o;

import java.util.concurrent.Executor;
import o.R;
/* loaded from: classes.dex */
public final class R$integer$ah$a {
    private R$integer$ah$a() {
    }

    public /* synthetic */ R$integer$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    /* loaded from: classes.dex */
    public static final class toString extends R.integer<T> {
        final /* synthetic */ Object values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toString(Object obj, Executor executor) {
            super(executor);
            this.values = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        @Override // o.R.integer
        protected T values() {
            return this.values;
        }
    }

    public final <T> R.integer<T> valueOf(T t) {
        return new toString(t, valueOf());
    }

    public final Executor valueOf() {
        return R$integer$ah$a$ah$a.toString;
    }
}
