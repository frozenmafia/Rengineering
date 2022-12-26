package o;

import java.io.EOFException;
/* loaded from: classes5.dex */
public final class getClearTop {
    public static final boolean ah$a(getMinSmallestWidth getminsmallestwidth) {
        runAnimators.ag$a(getminsmallestwidth, "$this$isProbablyUtf8");
        try {
            getMinSmallestWidth getminsmallestwidth2 = new getMinSmallestWidth();
            getminsmallestwidth.toString(getminsmallestwidth2, 0L, addTransitionInternal.ah$a(getminsmallestwidth.onPostMessage(), 64L));
            for (int i = 0; i < 16; i++) {
                if (getminsmallestwidth2.getSignupData()) {
                    return true;
                }
                int ICustomTabsCallback$Default = getminsmallestwidth2.ICustomTabsCallback$Default();
                if (Character.isISOControl(ICustomTabsCallback$Default) && !Character.isWhitespace(ICustomTabsCallback$Default)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
