package o;
/* loaded from: classes7.dex */
public final class writeFloatArray$ah$a implements writeCharArray<T> {
    final /* synthetic */ Transition<T, setPatternPath<? super setAnimationMatrix>, Object> ag$a;

    @Override // o.writeCharArray
    public Object emit(T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        Object invoke = this.ag$a.invoke(t, setpatternpath);
        return invoke == PatternPathMotion.values() ? invoke : setAnimationMatrix.ag$a;
    }
}
