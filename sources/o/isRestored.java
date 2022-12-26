package o;

import android.view.View;
import o.Recreator;
/* loaded from: classes5.dex */
public final /* synthetic */ class isRestored implements androidx.core.view.OnApplyWindowInsetsListener {
    public static final /* synthetic */ isRestored ah$a = new isRestored();

    private /* synthetic */ isRestored() {
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.core.view.WindowInsetsCompat ag$a;
        ag$a = Recreator.SavedStateProvider.values.ag$a(view, windowInsetsCompat);
        return ag$a;
    }
}
