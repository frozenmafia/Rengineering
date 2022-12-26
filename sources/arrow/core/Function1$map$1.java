package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.extraCommand;
/* loaded from: classes6.dex */
public final class Function1$map$1 extends Lambda implements Styleable.ChangeBounds<I, O> {
    final /* synthetic */ extraCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Function1$map$1(extraCommand extracommand) {
        super(1);
        this.this$0 = extracommand;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, O] */
    @Override // o.Styleable.ChangeBounds
    public final O invoke(I i) {
        return this.this$0.values().invoke(i);
    }
}
