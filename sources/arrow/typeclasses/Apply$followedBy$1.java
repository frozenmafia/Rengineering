package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$followedBy$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, B> {
    public static final Apply$followedBy$1 INSTANCE = new Apply$followedBy$1();

    Apply$followedBy$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    public final B invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return cancelVar.values();
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((cancel<? extends A, ? extends Object>) obj);
    }
}
