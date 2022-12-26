package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class setFilters {
    public static final <T> void ag$a(Bundle bundle, String str, T t) {
        runAnimators.ag$a(bundle, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        if (t instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof String) {
            bundle.putString(str, (String) t);
        } else if (t instanceof Integer) {
            bundle.putInt(str, ((Number) t).intValue());
        } else if (t instanceof Short) {
            bundle.putShort(str, ((Number) t).shortValue());
        } else if (t instanceof Long) {
            bundle.putLong(str, ((Number) t).longValue());
        } else if (t instanceof Byte) {
            bundle.putByte(str, ((Number) t).byteValue());
        } else if (t instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) t);
        } else if (t instanceof Character) {
            bundle.putChar(str, ((Character) t).charValue());
        } else if (t instanceof char[]) {
            bundle.putCharArray(str, (char[]) t);
        } else if (t instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) t);
        } else if (t instanceof Float) {
            bundle.putFloat(str, ((Number) t).floatValue());
        } else if (t instanceof Bundle) {
            bundle.putBundle(str, (Bundle) t);
        } else if (t instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) t);
        } else if (t instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) t);
        } else {
            throw new IllegalStateException("Data type of property " + str + " is not supported");
        }
    }

    public static final <T> TransitionManager<androidx.fragment.app.Fragment, T> values(androidx.fragment.app.Fragment fragment, String str, T t) {
        runAnimators.ag$a(fragment, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(t, "defaultValue");
        return new EmojiAppCompatTextView(str, t);
    }

    public static final TransitionManager<androidx.fragment.app.Fragment, ArrayList<String>> values(androidx.fragment.app.Fragment fragment, String str, ArrayList<String> arrayList) {
        runAnimators.ag$a(fragment, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(arrayList, "defaultValue");
        return new setMaxEmojiCount(str, arrayList);
    }

    public static final <T extends Parcelable> TransitionManager<androidx.fragment.app.Fragment, ArrayList<T>> toString(androidx.fragment.app.Fragment fragment, String str, ArrayList<T> arrayList) {
        runAnimators.ag$a(fragment, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(arrayList, "defaultValue");
        return new EmojiEditText(str, arrayList);
    }

    public static final <T> TransitionManager<androidx.fragment.app.Fragment, T> ah$a(androidx.fragment.app.Fragment fragment, String str) {
        runAnimators.ag$a(fragment, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        return new EmojiEditTextHelper(str);
    }
}
