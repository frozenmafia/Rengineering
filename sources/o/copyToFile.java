package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public final class copyToFile implements androidx.viewbinding.ViewBinding {
    public final ImageView ag$a;
    public final ImageView valueOf;
    public final FrameLayout values;

    public copyToFile(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.values = frameLayout;
        this.valueOf = imageView;
        this.ag$a = imageView2;
    }

    public FrameLayout ah$a() {
        return this.values;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }
}
