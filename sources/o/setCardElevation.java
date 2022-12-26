package o;

import android.app.Activity;
import o.MenuItemWrapperICS;
/* loaded from: classes.dex */
public class setCardElevation implements MenuItemWrapperICS.ActionProviderWrapper {
    private Activity ag$a;

    @Override // o.MenuItemWrapperICS.ActionProviderWrapper
    public Activity valueOf() {
        return this.ag$a;
    }

    public void ag$a(Activity activity) {
        this.ag$a = activity;
    }
}
