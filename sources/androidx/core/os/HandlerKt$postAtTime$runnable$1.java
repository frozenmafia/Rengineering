package androidx.core.os;

import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> $action;

    public HandlerKt$postAtTime$runnable$1(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        this.$action = arcMotion;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
