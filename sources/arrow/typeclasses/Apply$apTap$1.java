package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$apTap$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, A> {
    public static final Apply$apTap$1 INSTANCE = new Apply$apTap$1();

    Apply$apTap$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
    public final A invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return cancelVar.valueOf();
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((cancel<? extends Object, ? extends B>) obj);
    }
}
