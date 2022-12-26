package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class ignoredColumns implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView HaptikSDK$b;
    private final LinearLayout HaptikSDK$c;
    public final ImageView ag$a;
    public final MaterialButton ah$a;
    public final TextView ah$b;
    public final LinearLayout toString;
    public final MaterialButton valueOf;
    public final ImageView values;

    private ignoredColumns(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, androidx.recyclerview.widget.RecyclerView recyclerView, TextView textView) {
        this.HaptikSDK$c = linearLayout;
        this.valueOf = materialButton;
        this.ah$a = materialButton2;
        this.values = imageView;
        this.ag$a = imageView2;
        this.toString = linearLayout2;
        this.HaptikSDK$b = recyclerView;
        this.ah$b = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public LinearLayout getRoot() {
        return this.HaptikSDK$c;
    }

    public static ignoredColumns ag$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.dialog_tokenisation_know_more, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return toString(inflate);
    }

    public static ignoredColumns toString(View view) {
        int i = C0368entity.valueOf.btnCancel;
        MaterialButton materialButton = (MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = C0368entity.valueOf.btnProceed;
            MaterialButton materialButton2 = (MaterialButton) view.findViewById(i);
            if (materialButton2 != null) {
                i = C0368entity.valueOf.ivCross;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C0368entity.valueOf.ivTokenisationLogo;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = C0368entity.valueOf.rvBulletPointers;
                        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(i);
                        if (recyclerView != null) {
                            i = C0368entity.valueOf.tvHeader;
                            TextView textView = (TextView) view.findViewById(i);
                            if (textView != null) {
                                return new ignoredColumns(linearLayout, materialButton, materialButton2, imageView, imageView2, linearLayout, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
