package o;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public final class getParentFragmentManager$ag$a {
    private final String ag$a;
    private final WeakReference<View> valueOf;

    public getParentFragmentManager$ag$a(View view, String str) {
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(str, "viewMapKey");
        this.valueOf = new WeakReference<>(view);
        this.ag$a = str;
    }

    public final String values() {
        return this.ag$a;
    }

    public final View valueOf() {
        WeakReference<View> weakReference = this.valueOf;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
