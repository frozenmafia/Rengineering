package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class insertAndReturnIdsArrayBox implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    public final ForeignKey HaptikSDK$c;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final ImageView ah$a;
    public final View toString;
    public final TextView valueOf;
    public final View values;

    private insertAndReturnIdsArrayBox(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, View view2, ForeignKey foreignKey) {
        this.HaptikSDK$a = constraintLayout;
        this.ah$a = imageView;
        this.valueOf = textView;
        this.values = view;
        this.ag$a = constraintLayout2;
        this.toString = view2;
        this.HaptikSDK$c = foreignKey;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$a;
    }

    public static insertAndReturnIdsArrayBox valueOf(View view) {
        View findViewById;
        View findViewById2;
        int i = C0368entity.valueOf.app_image_view;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C0368entity.valueOf.app_text_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null && (findViewById = view.findViewById((i = C0368entity.valueOf.separator))) != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
                i = C0368entity.valueOf.viewDisablePayment;
                View findViewById3 = view.findViewById(i);
                if (findViewById3 != null && (findViewById2 = view.findViewById((i = C0368entity.valueOf.viewHealth))) != null) {
                    return new insertAndReturnIdsArrayBox(constraintLayout, imageView, textView, findViewById, constraintLayout, findViewById3, ForeignKey.values(findViewById2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
