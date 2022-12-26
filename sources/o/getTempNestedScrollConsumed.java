package o;

import android.view.View;
/* loaded from: classes3.dex */
public final class getTempNestedScrollConsumed implements Runnable {
    public final /* synthetic */ getUniqueKey ag$a;
    public final /* synthetic */ dispatchNestedScroll ah$a;
    public final /* synthetic */ String toString;

    public getTempNestedScrollConsumed(View view, dispatchNestedScroll dispatchnestedscroll, getUniqueKey getuniquekey, String str) {
        this.ah$a = dispatchnestedscroll;
        this.ag$a = getuniquekey;
        this.toString = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getFontFamily getfontfamily;
        String str;
        actionBarOnMenuKeyEventPre28 ag$a = this.ah$a.ag$a();
        getUniqueKey getuniquekey = this.ag$a;
        String str2 = this.toString;
        ag$a.toString(getuniquekey, (str2 == null || (getfontfamily = this.ah$a.HaptikSDK$b) == null || (str = getfontfamily.ag$a) == null) ? null : runAnimators.values(str, (Object) str2));
    }
}
