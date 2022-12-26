package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class prefix implements androidx.viewbinding.ViewBinding {
    public final insertAndReturnIdsArray ah$a;
    private final LinearLayout valueOf;
    public final FrameLayout values;

    private prefix(LinearLayout linearLayout, FrameLayout frameLayout, insertAndReturnIdsArray insertandreturnidsarray) {
        this.valueOf = linearLayout;
        this.values = frameLayout;
        this.ah$a = insertandreturnidsarray;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public LinearLayout getRoot() {
        return this.valueOf;
    }

    public static prefix values(LayoutInflater layoutInflater) {
        return values(layoutInflater, null, false);
    }

    public static prefix values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.activity_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ag$a(inflate);
    }

    public static prefix ag$a(View view) {
        View findViewById;
        int i = C0368entity.valueOf.fragment_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null && (findViewById = view.findViewById((i = C0368entity.valueOf.toolbarLayout))) != null) {
            return new prefix((LinearLayout) view, frameLayout, insertAndReturnIdsArray.ag$a(findViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
