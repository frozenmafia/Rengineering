package o;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class handleMultiple implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final TextInputEditText ah$a;
    public final ForeignKey toString;
    public final TextInputLayout valueOf;
    public final TextView values;

    private handleMultiple(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ForeignKey foreignKey) {
        this.ag$a = constraintLayout;
        this.values = textView;
        this.ah$a = textInputEditText;
        this.valueOf = textInputLayout;
        this.toString = foreignKey;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ah$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ag$a;
    }

    public static handleMultiple valueOf(View view) {
        View findViewById;
        int i = C0368entity.valueOf.collect_req_tex_view;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C0368entity.valueOf.input_vpa;
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(i);
            if (textInputEditText != null) {
                i = C0368entity.valueOf.til_vpa;
                TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
                if (textInputLayout != null && (findViewById = view.findViewById((i = C0368entity.valueOf.viewUpiHealth))) != null) {
                    return new handleMultiple((androidx.constraintlayout.widget.ConstraintLayout) view, textView, textInputEditText, textInputLayout, ForeignKey.values(findViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
