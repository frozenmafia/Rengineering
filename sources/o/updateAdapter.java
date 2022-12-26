package o;
/* loaded from: classes7.dex */
public final class updateAdapter<T> implements writeCharArray<T> {
    private final readDoubleArray<T> toString;

    /* JADX WARN: Multi-variable type inference failed */
    public updateAdapter(readDoubleArray<? super T> readdoublearray) {
        this.toString = readdoublearray;
    }

    @Override // o.writeCharArray
    public Object emit(T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        Object ah$a = this.toString.ah$a(t, setpatternpath);
        return ah$a == PatternPathMotion.values() ? ah$a : setAnimationMatrix.ag$a;
    }
}
