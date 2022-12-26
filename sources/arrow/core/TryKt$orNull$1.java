package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TryKt$orNull$1 extends Lambda implements Styleable.ChangeBounds {
    public static final TryKt$orNull$1 INSTANCE = new TryKt$orNull$1();

    TryKt$orNull$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Void invoke(Throwable th) {
        runAnimators.valueOf(th, "it");
        return null;
    }
}
