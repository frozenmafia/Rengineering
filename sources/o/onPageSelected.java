package o;
/* loaded from: classes7.dex */
public abstract class onPageSelected {
    public calculatePageOffsets<?> values;

    public abstract void ag$a(calculatePageOffsets<?> calculatepageoffsets, Object obj);

    public abstract Object valueOf(calculatePageOffsets<?> calculatepageoffsets);

    public final calculatePageOffsets<?> ag$a() {
        calculatePageOffsets<?> calculatepageoffsets = this.values;
        if (calculatepageoffsets != null) {
            return calculatepageoffsets;
        }
        runAnimators.valueOf("atomicOp");
        return null;
    }

    public final void ah$a(calculatePageOffsets<?> calculatepageoffsets) {
        this.values = calculatepageoffsets;
    }
}
