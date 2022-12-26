package o;
/* loaded from: classes7.dex */
final class canReuseCache implements Runnable {
    private final parseInterpolatorFromTypeArray toString;
    private final createInterpolatorFromXml<setAnimationMatrix> valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public canReuseCache(parseInterpolatorFromTypeArray parseinterpolatorfromtypearray, createInterpolatorFromXml<? super setAnimationMatrix> createinterpolatorfromxml) {
        this.toString = parseinterpolatorfromtypearray;
        this.valueOf = createinterpolatorfromxml;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.valueOf.ag$a(this.toString, setAnimationMatrix.ag$a);
    }
}
