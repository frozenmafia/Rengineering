package androidx.core.content;

import android.content.ContentValues;
import kotlin.Pair;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(Pair<String, ? extends Object>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        ContentValues contentValues = new ContentValues(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<String, ? extends Object> pair = pairArr[i];
            i++;
            String component1 = pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                contentValues.putNull(component1);
            } else if (component2 instanceof String) {
                contentValues.put(component1, (String) component2);
            } else if (component2 instanceof Integer) {
                contentValues.put(component1, (Integer) component2);
            } else if (component2 instanceof Long) {
                contentValues.put(component1, (Long) component2);
            } else if (component2 instanceof Boolean) {
                contentValues.put(component1, (Boolean) component2);
            } else if (component2 instanceof Float) {
                contentValues.put(component1, (Float) component2);
            } else if (component2 instanceof Double) {
                contentValues.put(component1, (Double) component2);
            } else if (component2 instanceof byte[]) {
                contentValues.put(component1, (byte[]) component2);
            } else if (component2 instanceof Byte) {
                contentValues.put(component1, (Byte) component2);
            } else if (!(component2 instanceof Short)) {
                String canonicalName = component2.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName) + " for key \"" + component1 + '\"');
            } else {
                contentValues.put(component1, (Short) component2);
            }
        }
        return contentValues;
    }
}
