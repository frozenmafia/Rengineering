package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class copyToDirectBuffer implements androidx.viewbinding.ViewBinding {
    public final TextView ag$a;
    public final SeekBar ah$a;
    public final ImageView valueOf;
    public final RelativeLayout values;

    public copyToDirectBuffer(RelativeLayout relativeLayout, ImageView imageView, SeekBar seekBar, TextView textView) {
        this.values = relativeLayout;
        this.valueOf = imageView;
        this.ah$a = seekBar;
        this.ag$a = textView;
    }

    public RelativeLayout ah$a() {
        return this.values;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }
}
