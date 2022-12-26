package o;

import arrow.core.Id$ap$1;
import kotlin.TypeCastException;
import o.ICustomTabsCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class onTransact<A> implements ICustomTabsCallback.Default<Object, A> {
    public static final values ah$a = new values(null);
    private final A ag$a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onTransact) && runAnimators.values(this.ag$a, ((onTransact) obj).ag$a);
        }
        return true;
    }

    public int hashCode() {
        A a = this.ag$a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public onTransact(A a) {
        this.ag$a = a;
    }

    public final <B> onTransact<B> values(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return new onTransact<>(changeBounds.invoke(ag$a()));
    }

    public final <B> onTransact<B> valueOf(Styleable.ChangeBounds<? super A, ? extends ICustomTabsCallback.Default<Object, ? extends B>> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        ICustomTabsCallback.Default<Object, ? extends B> invoke = changeBounds.invoke(ag$a());
        if (invoke != null) {
            return (onTransact) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Id<A>");
    }

    public final A ag$a() {
        return this.ag$a;
    }

    /* loaded from: classes6.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final <A> onTransact<A> values(A a) {
            return new onTransact<>(a);
        }
    }

    public final String valueOf(pause<? super A> pauseVar) {
        runAnimators.valueOf(pauseVar, "SA");
        return "Id(" + pauseVar.toString((A) this.ag$a) + ')';
    }

    public String toString() {
        return valueOf(pause.toString.valueOf());
    }

    public final <B> onTransact<B> ah$a(ICustomTabsCallback.Default<Object, ? extends Styleable.ChangeBounds<? super A, ? extends B>> r2) {
        runAnimators.valueOf(r2, "ff");
        onTransact<B> valueOf = ((onTransact) r2).valueOf(new Id$ap$1(this));
        if (valueOf != null) {
            return valueOf;
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Id<A>");
    }
}
