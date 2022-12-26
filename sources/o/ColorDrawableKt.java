package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.extract;
/* loaded from: classes3.dex */
public final class ColorDrawableKt implements androidx.viewbinding.ViewBinding {
    public final LinearLayout ag$a;
    public final FrameLayout ah$a;
    public final FrameLayout toString;
    public final FrameLayout valueOf;
    public final TextView values;

    public ColorDrawableKt(LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView) {
        this.ag$a = linearLayout;
        this.valueOf = frameLayout;
        this.ah$a = frameLayout2;
        this.toString = frameLayout3;
        this.values = textView;
    }

    public LinearLayout ah$a() {
        return this.ag$a;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.ag$a;
    }

    public static ColorDrawableKt values(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(extract$HaptikSDK$b.storyly_list_view_item, (ViewGroup) null, false);
        int i = extract.toString.icon_holder;
        FrameLayout frameLayout = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
        if (frameLayout != null) {
            i = extract.toString.ivod_icon_holder;
            FrameLayout frameLayout2 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
            if (frameLayout2 != null) {
                i = extract.toString.pin_icon_holder;
                FrameLayout frameLayout3 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                if (frameLayout3 != null) {
                    i = extract.toString.storyly_title;
                    TextView textView = (TextView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                    if (textView != null) {
                        return new ColorDrawableKt((LinearLayout) inflate, frameLayout, frameLayout2, frameLayout3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
