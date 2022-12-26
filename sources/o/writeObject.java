package o;
/* loaded from: classes7.dex */
public final class writeObject extends PagerAdapter<resolveClass<?>> {
    public setPatternPath<? super setAnimationMatrix> ah$a;
    public long values = -1;

    @Override // o.PagerAdapter
    /* renamed from: toString  reason: avoid collision after fix types in other method */
    public boolean ah$a(resolveClass<?> resolveclass) {
        if (this.values >= 0) {
            return false;
        }
        this.values = resolveclass.HaptikSDK$b();
        return true;
    }

    @Override // o.PagerAdapter
    /* renamed from: ag$a */
    public setPatternPath<setAnimationMatrix>[] toString(resolveClass<?> resolveclass) {
        if (getPixelSize.values()) {
            if (!(this.values >= 0)) {
                throw new AssertionError();
            }
        }
        long j = this.values;
        this.values = -1L;
        this.ah$a = null;
        return resolveclass.toString(j);
    }
}
