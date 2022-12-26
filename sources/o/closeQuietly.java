package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class closeQuietly implements androidx.viewbinding.ViewBinding {
    public final TextView HaptikSDK$a;
    public final LinearLayout ag$a;
    public final RelativeLayout ah$a;
    public final ImageView ah$b;
    public final TextView invoke;
    public final ImageView toString;
    public final RelativeLayout valueOf;
    public final FrameLayout values;

    public closeQuietly(RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, ImageView imageView2, TextView textView, TextView textView2) {
        this.ah$a = relativeLayout;
        this.toString = imageView;
        this.values = frameLayout;
        this.valueOf = relativeLayout2;
        this.ag$a = linearLayout;
        this.ah$b = imageView2;
        this.HaptikSDK$a = textView;
        this.invoke = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.ah$a;
    }
}
