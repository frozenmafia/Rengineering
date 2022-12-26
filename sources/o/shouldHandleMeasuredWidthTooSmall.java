package o;

import com.google.android.datatransport.Priority;
/* loaded from: classes4.dex */
public abstract class shouldHandleMeasuredWidthTooSmall<T> {
    public abstract T ag$a();

    public abstract Priority valueOf();

    public abstract Integer values();

    public static <T> shouldHandleMeasuredWidthTooSmall<T> valueOf(T t) {
        return new getPercentLayoutInfo(null, t, Priority.DEFAULT);
    }

    public static <T> shouldHandleMeasuredWidthTooSmall<T> toString(T t) {
        return new getPercentLayoutInfo(null, t, Priority.VERY_LOW);
    }

    public static <T> shouldHandleMeasuredWidthTooSmall<T> ah$a(T t) {
        return new getPercentLayoutInfo(null, t, Priority.HIGHEST);
    }
}
