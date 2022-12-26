package o;

import android.os.Bundle;
/* loaded from: classes7.dex */
public class cancelScroll implements PagerSnapHelper {
    @Override // o.PagerSnapHelper
    public void ag$a(String str, Bundle bundle) {
        createScroller createscroller;
        createscroller = createScroller.valueOf;
        createscroller.ah$a("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
