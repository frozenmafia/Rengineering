package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.extract;
/* loaded from: classes3.dex */
public final class mmap implements androidx.viewbinding.ViewBinding {
    public final FrameLayout toString;
    public final FrameLayout valueOf;
    public final FrameLayout values;

    public mmap(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.values = frameLayout;
        this.toString = frameLayout2;
        this.valueOf = frameLayout3;
    }

    public FrameLayout ag$a() {
        return this.values;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }

    public static mmap ag$a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(extract$HaptikSDK$b.storyly_dialog, (ViewGroup) null, false);
        int i = extract.toString.holder;
        FrameLayout frameLayout = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
        if (frameLayout != null) {
            i = extract.toString.storyly_dialog_layout;
            FrameLayout frameLayout2 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
            if (frameLayout2 != null) {
                return new mmap((FrameLayout) inflate, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
