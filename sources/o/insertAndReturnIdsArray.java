package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class insertAndReturnIdsArray implements androidx.viewbinding.ViewBinding {
    public final androidx.appcompat.widget.Toolbar toString;
    public final TextView valueOf;
    private final LinearLayout values;

    private insertAndReturnIdsArray(LinearLayout linearLayout, androidx.appcompat.widget.Toolbar toolbar, TextView textView) {
        this.values = linearLayout;
        this.toString = toolbar;
        this.valueOf = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public LinearLayout getRoot() {
        return this.values;
    }

    public static insertAndReturnIdsArray ag$a(View view) {
        int i = C0368entity.valueOf.toolbar;
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) view.findViewById(i);
        if (toolbar != null) {
            i = C0368entity.valueOf.toolbar_title;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new insertAndReturnIdsArray((LinearLayout) view, toolbar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
