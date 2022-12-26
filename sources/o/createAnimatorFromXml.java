package o;

import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class createAnimatorFromXml extends AnimatorInflaterCompat {
    private final Future<?> values;

    public createAnimatorFromXml(Future<?> future) {
        this.values = future;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        valueOf(th);
        return setAnimationMatrix.ag$a;
    }

    @Override // o.createNewKeyframe
    public void valueOf(Throwable th) {
        if (th != null) {
            this.values.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.values + ']';
    }
}
