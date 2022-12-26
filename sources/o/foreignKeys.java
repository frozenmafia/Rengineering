package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class foreignKeys implements androidx.viewbinding.ViewBinding {
    private final RelativeLayout ag$a;
    public final insertAndReturnIdsArray toString;
    public final androidx.fragment.app.FragmentContainerView valueOf;

    private foreignKeys(RelativeLayout relativeLayout, androidx.fragment.app.FragmentContainerView fragmentContainerView, insertAndReturnIdsArray insertandreturnidsarray) {
        this.ag$a = relativeLayout;
        this.valueOf = fragmentContainerView;
        this.toString = insertandreturnidsarray;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public RelativeLayout getRoot() {
        return this.ag$a;
    }

    public static foreignKeys valueOf(LayoutInflater layoutInflater) {
        return valueOf(layoutInflater, null, false);
    }

    public static foreignKeys valueOf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.activity_paytm_link_flow, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ah$a(inflate);
    }

    public static foreignKeys ah$a(View view) {
        View findViewById;
        int i = C0368entity.valueOf.fragment_container;
        androidx.fragment.app.FragmentContainerView fragmentContainerView = (androidx.fragment.app.FragmentContainerView) view.findViewById(i);
        if (fragmentContainerView != null && (findViewById = view.findViewById((i = C0368entity.valueOf.toolbarLayout))) != null) {
            return new foreignKeys((RelativeLayout) view, fragmentContainerView, insertAndReturnIdsArray.ag$a(findViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
