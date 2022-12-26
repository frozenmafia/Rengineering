package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class createQuery implements androidx.viewbinding.ViewBinding {
    public final MaterialButton ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final handleMultiple values;

    private createQuery(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, MaterialButton materialButton, handleMultiple handlemultiple) {
        this.ah$a = constraintLayout;
        this.ag$a = materialButton;
        this.values = handlemultiple;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ah$a;
    }

    public static createQuery values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.fragment_upi_collect, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ah$a(inflate);
    }

    public static createQuery ah$a(View view) {
        View findViewById;
        int i = C0368entity.valueOf.request_amount_button;
        MaterialButton materialButton = (MaterialButton) view.findViewById(i);
        if (materialButton != null && (findViewById = view.findViewById((i = C0368entity.valueOf.upi_collect_layout))) != null) {
            return new createQuery((androidx.constraintlayout.widget.ConstraintLayout) view, materialButton, handleMultiple.valueOf(findViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
