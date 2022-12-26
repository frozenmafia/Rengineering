package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.ExifInterface;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SpannedStringKt {
    public static final Spanned toSpanned(CharSequence charSequence) {
        runAnimators.ag$a(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        runAnimators.ag$a(spanned, "<this>");
        runAnimators.values(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        runAnimators.ah$a(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        runAnimators.ag$a(spanned, "<this>");
        runAnimators.values(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        runAnimators.ah$a(spans, "getSpans(start, end, T::class.java)");
        return (T[]) spans;
    }
}
