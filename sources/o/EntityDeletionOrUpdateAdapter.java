package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class EntityDeletionOrUpdateAdapter implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    public final androidx.appcompat.widget.AppCompatTextView ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    public final insertAndReturnIdsList invoke;
    public final androidx.appcompat.widget.AppCompatImageView toString;
    public final androidx.appcompat.widget.AppCompatTextView valueOf;
    public final androidx.appcompat.widget.AppCompatTextView values;

    private EntityDeletionOrUpdateAdapter(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, androidx.appcompat.widget.AppCompatTextView appCompatTextView, androidx.appcompat.widget.AppCompatTextView appCompatTextView2, androidx.appcompat.widget.AppCompatTextView appCompatTextView3, insertAndReturnIdsList insertandreturnidslist) {
        this.HaptikSDK$a = constraintLayout;
        this.toString = appCompatImageView;
        this.ah$a = appCompatImageView2;
        this.valueOf = appCompatTextView;
        this.values = appCompatTextView2;
        this.ag$a = appCompatTextView3;
        this.invoke = insertandreturnidslist;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ah$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$a;
    }

    public static EntityDeletionOrUpdateAdapter ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.fragment_cvv_fallback_sfa, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return toString(inflate);
    }

    public static EntityDeletionOrUpdateAdapter toString(View view) {
        View findViewById;
        int i = C0368entity.valueOf.ivCancel;
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            i = C0368entity.valueOf.ivCard;
            androidx.appcompat.widget.AppCompatImageView appCompatImageView2 = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
            if (appCompatImageView2 != null) {
                i = C0368entity.valueOf.tvAdditionalAuth;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null) {
                    i = C0368entity.valueOf.tvCvvNotSave;
                    androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                    if (appCompatTextView2 != null) {
                        i = C0368entity.valueOf.tvCvvTip;
                        androidx.appcompat.widget.AppCompatTextView appCompatTextView3 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                        if (appCompatTextView3 != null && (findViewById = view.findViewById((i = C0368entity.valueOf.viewCvvEditBoxContainer))) != null) {
                            return new EntityDeletionOrUpdateAdapter((androidx.constraintlayout.widget.ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, insertAndReturnIdsList.toString(findViewById));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
