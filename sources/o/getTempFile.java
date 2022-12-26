package o;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class getTempFile implements androidx.viewbinding.ViewBinding {
    public final TextView ah$a;
    public final TextView toString;
    public final RelativeLayout values;

    public getTempFile(RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        this.values = relativeLayout;
        this.ah$a = textView;
        this.toString = textView2;
    }

    public RelativeLayout ah$a() {
        return this.values;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }
}
