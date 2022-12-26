package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class Entity implements androidx.viewbinding.ViewBinding {
    public final insertAndReturnIdsArray HaptikSDK$a;
    public final TextView HaptikSDK$b;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
    public final androidx.constraintlayout.widget.Group ag$a;
    public final ImageView ah$a;
    public final ProgressBar invoke;
    public final androidx.constraintlayout.widget.Group toString;
    public final FrameLayout valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    private Entity(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, FrameLayout frameLayout, androidx.constraintlayout.widget.Group group, androidx.constraintlayout.widget.Group group2, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, ProgressBar progressBar, insertAndReturnIdsArray insertandreturnidsarray, TextView textView) {
        this.HaptikSDK$c = constraintLayout;
        this.valueOf = frameLayout;
        this.toString = group;
        this.ag$a = group2;
        this.values = guideline;
        this.ah$a = imageView;
        this.invoke = progressBar;
        this.HaptikSDK$a = insertandreturnidsarray;
        this.HaptikSDK$b = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$c;
    }

    public static Entity values(LayoutInflater layoutInflater) {
        return ah$a(layoutInflater, null, false);
    }

    public static Entity ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.activity_upi_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ag$a(inflate);
    }

    public static Entity ag$a(View view) {
        View findViewById;
        int i = C0368entity.valueOf.fragment_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = C0368entity.valueOf.groupEmptyState;
            androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) view.findViewById(i);
            if (group != null) {
                i = C0368entity.valueOf.groupFragmentContainer;
                androidx.constraintlayout.widget.Group group2 = (androidx.constraintlayout.widget.Group) view.findViewById(i);
                if (group2 != null) {
                    i = C0368entity.valueOf.guidelineEmptyState;
                    androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                    if (guideline != null) {
                        i = C0368entity.valueOf.ivEmptyState;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            i = C0368entity.valueOf.progressBar;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                            if (progressBar != null && (findViewById = view.findViewById((i = C0368entity.valueOf.toolbarLayout))) != null) {
                                insertAndReturnIdsArray ag$a = insertAndReturnIdsArray.ag$a(findViewById);
                                i = C0368entity.valueOf.tvEmptyStateMessage;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    return new Entity((androidx.constraintlayout.widget.ConstraintLayout) view, frameLayout, group, group2, guideline, imageView, progressBar, ag$a, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
