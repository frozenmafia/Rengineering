package o;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes7.dex */
public class createItemFromTag implements InputFilter {
    private int toString;

    public createItemFromTag(int i) {
        this.toString = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.toString) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
