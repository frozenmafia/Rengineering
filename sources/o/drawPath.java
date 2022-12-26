package o;

import o.VectorDrawableCompat;
/* loaded from: classes5.dex */
public abstract class drawPath extends parseInterpolatorFromTypeArray {
    public abstract drawPath valueOf();

    @Override // o.parseInterpolatorFromTypeArray
    public String toString() {
        String ah$a = ah$a();
        if (ah$a == null) {
            return invalidateSelf.values(this) + '@' + invalidateSelf.ah$a(this);
        }
        return ah$a;
    }

    @Override // o.parseInterpolatorFromTypeArray
    public parseInterpolatorFromTypeArray limitedParallelism(int i) {
        resetTouch.valueOf(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String ah$a() {
        drawPath drawpath;
        drawPath ah$a = VectorDrawableCompat.VFullPath.ah$a();
        if (this == ah$a) {
            return "Dispatchers.Main";
        }
        try {
            drawpath = ah$a.valueOf();
        } catch (UnsupportedOperationException unused) {
            drawpath = null;
        }
        if (this == drawpath) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
