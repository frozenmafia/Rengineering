package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes4.dex */
public final class getVolumeControlStream implements androidx.viewbinding.ViewBinding {
    public final TextView ag$a;
    public final TextView ah$a;
    private final LinearLayout invoke;
    public final TextView toString;
    public final TextView valueOf;
    public final LinearLayout values;

    private getVolumeControlStream(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.invoke = linearLayout;
        this.values = linearLayout2;
        this.valueOf = textView;
        this.ah$a = textView2;
        this.toString = textView3;
        this.ag$a = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public LinearLayout getRoot() {
        return this.invoke;
    }

    public static getVolumeControlStream ah$a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = getRawLegacyStreamType$ah$a.gphActionMore;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = getRawLegacyStreamType$ah$a.gphActionRemove;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = getRawLegacyStreamType$ah$a.gphActionViewGiphy;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    i = getRawLegacyStreamType$ah$a.gphCopyLink;
                    TextView textView4 = (TextView) view.findViewById(i);
                    if (textView4 != null) {
                        return new getVolumeControlStream(linearLayout, linearLayout, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
