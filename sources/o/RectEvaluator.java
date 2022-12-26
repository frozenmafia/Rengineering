package o;
/* loaded from: classes5.dex */
public final class RectEvaluator implements setPatternPath<Object> {
    public static final RectEvaluator ah$a = new RectEvaluator();

    public String toString() {
        return "This continuation is already complete";
    }

    private RectEvaluator() {
    }

    @Override // o.setPatternPath
    public PropertyValuesHolderUtils getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // o.setPatternPath
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
