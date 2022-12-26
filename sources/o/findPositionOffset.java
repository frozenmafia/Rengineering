package o;
/* loaded from: classes7.dex */
public abstract class findPositionOffset {
    public abstract int flags();

    public abstract hasAnyUpdateTypes matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();

    public static findPositionOffset compile(String str) {
        return preProcess.toString(str);
    }

    public static boolean isPcreLike() {
        return preProcess.values();
    }
}
