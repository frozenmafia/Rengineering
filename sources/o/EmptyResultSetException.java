package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class EmptyResultSetException implements androidx.viewbinding.ViewBinding {
    public final MaterialButton ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final androidx.appcompat.widget.AppCompatTextView toString;
    public final MaterialButton valueOf;
    public final androidx.appcompat.widget.AppCompatTextView values;

    private EmptyResultSetException(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, androidx.appcompat.widget.AppCompatTextView appCompatTextView, androidx.appcompat.widget.AppCompatTextView appCompatTextView2) {
        this.ah$a = constraintLayout;
        this.valueOf = materialButton;
        this.ag$a = materialButton2;
        this.values = appCompatTextView;
        this.toString = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ah$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ah$a;
    }

    public static EmptyResultSetException ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.dialog_health_down_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ah$a(inflate);
    }

    public static EmptyResultSetException ah$a(View view) {
        int i = C0368entity.valueOf.btnPrimary;
        MaterialButton materialButton = (MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = C0368entity.valueOf.btnSecondary;
            MaterialButton materialButton2 = (MaterialButton) view.findViewById(i);
            if (materialButton2 != null) {
                i = C0368entity.valueOf.tvMessage;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null) {
                    i = C0368entity.valueOf.tvTitle;
                    androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                    if (appCompatTextView2 != null) {
                        return new EmptyResultSetException((androidx.constraintlayout.widget.ConstraintLayout) view, materialButton, materialButton2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
