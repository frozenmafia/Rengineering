package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import o.extract;
/* loaded from: classes3.dex */
public final class readFontInfoIntoByteBuffer implements androidx.viewbinding.ViewBinding {
    public final FrameLayout HaptikSDK$a;
    public final FrameLayout HaptikSDK$b;
    public final Button HaptikSDK$c;
    public final RelativeLayout HaptikSDK$d;
    public final FrameLayout HaptikWebView;
    public final RelativeLayout ag$a;
    public final RelativeLayout ah$a;
    public final Button ah$b;
    public final FrameLayout invoke;
    public final RelativeLayout toString;
    public final FrameLayout valueOf;
    public final FrameLayout values;

    public readFontInfoIntoByteBuffer(RelativeLayout relativeLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, FrameLayout frameLayout, RelativeLayout relativeLayout3, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, Button button, Button button2, RelativeLayout relativeLayout4, FrameLayout frameLayout6) {
        this.ag$a = relativeLayout;
        this.ah$a = relativeLayout2;
        this.valueOf = frameLayout;
        this.toString = relativeLayout3;
        this.values = frameLayout2;
        this.HaptikSDK$a = frameLayout3;
        this.invoke = frameLayout4;
        this.HaptikSDK$b = frameLayout5;
        this.ah$b = button;
        this.HaptikSDK$c = button2;
        this.HaptikSDK$d = relativeLayout4;
        this.HaptikWebView = frameLayout6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.ag$a;
    }

    public RelativeLayout values() {
        return this.ag$a;
    }

    public static readFontInfoIntoByteBuffer ah$a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(extract$HaptikSDK$b.story_group_view_item, (ViewGroup) null, false);
        int i = extract.toString.default_loading_view;
        ProgressBar progressBar = (ProgressBar) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
        if (progressBar != null) {
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            i = extract.toString.loading_layout;
            FrameLayout frameLayout = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
            if (frameLayout != null) {
                i = extract.toString.loading_layout_wrapper;
                RelativeLayout relativeLayout2 = (RelativeLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                if (relativeLayout2 != null) {
                    i = extract.toString.st_center_view_holder;
                    FrameLayout frameLayout2 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                    if (frameLayout2 != null) {
                        i = extract.toString.st_footer_view_holder;
                        FrameLayout frameLayout3 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                        if (frameLayout3 != null) {
                            i = extract.toString.st_header_view_holder;
                            FrameLayout frameLayout4 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                            if (frameLayout4 != null) {
                                i = extract.toString.st_moments_report_view;
                                FrameLayout frameLayout5 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                                if (frameLayout5 != null) {
                                    i = extract.toString.st_navigation_left_button;
                                    Button button = (Button) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                                    if (button != null) {
                                        i = extract.toString.st_navigation_right_button;
                                        Button button2 = (Button) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                                        if (button2 != null) {
                                            i = extract.toString.st_navigation_view_holder;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                                            if (relativeLayout3 != null) {
                                                i = extract.toString.storyly_layer_view;
                                                FrameLayout frameLayout6 = (FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                                                if (frameLayout6 != null) {
                                                    return new readFontInfoIntoByteBuffer(relativeLayout, progressBar, relativeLayout, frameLayout, relativeLayout2, frameLayout2, frameLayout3, frameLayout4, frameLayout5, button, button2, relativeLayout3, frameLayout6);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
