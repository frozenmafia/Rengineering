package o;
/* loaded from: classes7.dex */
public final class getEntryValues {
    public static <TInput, TResult, TException extends Throwable> TResult toString(int i, TInput tinput, ExpandButton<TInput, TResult, TException> expandButton, getEntry<TInput, TResult> getentry) throws Throwable {
        TResult values;
        if (i < 1) {
            return expandButton.values(tinput);
        }
        do {
            values = expandButton.values(tinput);
            tinput = getentry.toString(tinput, values);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return values;
    }
}
