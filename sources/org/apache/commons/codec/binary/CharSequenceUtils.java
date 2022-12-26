package org.apache.commons.codec.binary;
/* loaded from: classes8.dex */
public class CharSequenceUtils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean regionMatches(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z, i, (String) charSequence2, i2, i3);
        }
        while (i3 > 0) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i2);
            if (charAt != charAt2) {
                if (!z) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            i++;
            i3--;
            i2++;
        }
        return true;
    }
}
