package o;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class Animatable2Compat extends unregisterAnimationCallback {

    /* loaded from: classes7.dex */
    public final class AnimationCallback extends AnonymousClass1 {

        /* renamed from: o.Animatable2Compat$AnimationCallback$1 */
        /* loaded from: classes7.dex */
        class AnonymousClass1 extends registerPlatformCallback {
        }
    }

    public static final Character HaptikSDK$b(CharSequence charSequence) {
        runAnimators.ag$a(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final char HaptikSDK$d(CharSequence charSequence) {
        runAnimators.ag$a(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String ah$a(String str, int i) {
        runAnimators.ag$a(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String substring = str.substring(addTransitionInternal.ag$a(i, str.length()));
        runAnimators.ah$a(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String values(String str, int i) {
        runAnimators.ag$a(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String substring = str.substring(0, addTransitionInternal.ag$a(i, str.length()));
        runAnimators.ah$a(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String ag$a(String str, int i) {
        runAnimators.ag$a(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        String substring = str.substring(length - addTransitionInternal.ag$a(i, length));
        runAnimators.ah$a(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
