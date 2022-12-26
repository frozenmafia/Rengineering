package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.extract;
/* loaded from: classes3.dex */
public final class BitmapDrawableKt implements androidx.viewbinding.ViewBinding {
    public final TextView ah$a;
    public final TextView valueOf;
    public final LinearLayout values;

    public BitmapDrawableKt(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.values = linearLayout;
        this.valueOf = textView;
        this.ah$a = textView2;
    }

    public LinearLayout ag$a() {
        return this.values;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }

    public static BitmapDrawableKt toString(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(extract$HaptikSDK$b.st_vod_post_screen, (ViewGroup) null, false);
        int i = extract.toString.st_vod_next;
        TextView textView = (TextView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
        if (textView != null) {
            i = extract.toString.st_vod_replay;
            TextView textView2 = (TextView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
            if (textView2 != null) {
                return new BitmapDrawableKt((LinearLayout) inflate, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
