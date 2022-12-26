package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class TypefaceCompatUtil implements androidx.viewbinding.ViewBinding {
    public final TextView HaptikSDK$b;
    public final RelativeLayout ag$a;
    public final FrameLayout ah$a;
    public final LinearLayout ah$b;
    public final ImageView toString;
    public final ImageView valueOf;
    public final RelativeLayout values;

    public TypefaceCompatUtil(RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout, RelativeLayout relativeLayout2, ImageView imageView2, LinearLayout linearLayout, TextView textView) {
        this.values = relativeLayout;
        this.toString = imageView;
        this.ah$a = frameLayout;
        this.ag$a = relativeLayout2;
        this.valueOf = imageView2;
        this.ah$b = linearLayout;
        this.HaptikSDK$b = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }
}
