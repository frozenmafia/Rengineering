package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class toDrawable implements androidx.viewbinding.ViewBinding {
    public final TextView HaptikSDK$c;
    public final FrameLayout ag$a;
    public final ImageView ah$a;
    public final ImageView ah$b;
    public final TextView toString;
    public final RelativeLayout valueOf;
    public final RelativeLayout values;

    public toDrawable(RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout, RelativeLayout relativeLayout2, TextView textView, ImageView imageView2, TextView textView2) {
        this.values = relativeLayout;
        this.ah$a = imageView;
        this.ag$a = frameLayout;
        this.valueOf = relativeLayout2;
        this.toString = textView;
        this.ah$b = imageView2;
        this.HaptikSDK$c = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }
}
