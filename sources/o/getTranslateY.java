package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getTranslateY extends getPathData {
    private static final /* synthetic */ AtomicIntegerFieldUpdater valueOf = AtomicIntegerFieldUpdater.newUpdater(getTranslateY.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    private final Styleable.ChangeBounds<Throwable, setAnimationMatrix> ah$a;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        values(th);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getTranslateY(Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds) {
        this.ah$a = changeBounds;
    }

    @Override // o.AnimatorInflaterCompat.PathDataEvaluator
    public void values(Throwable th) {
        if (valueOf.compareAndSet(this, 0, 1)) {
            this.ah$a.invoke(th);
        }
    }
}
