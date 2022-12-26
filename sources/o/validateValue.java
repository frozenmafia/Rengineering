package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
/* loaded from: classes4.dex */
public class validateValue {
    public static void valueOf(View view, int i) {
        int getlivedatainternal = getLiveDataInternal.ah$a.toString(i, view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = getlivedatainternal;
        view.setLayoutParams(layoutParams);
    }

    public static void ag$a(RelativeLayout relativeLayout, int i) {
        int getlivedatainternal = getLiveDataInternal.ah$a.toString(i, relativeLayout.getContext());
        relativeLayout.setPadding(relativeLayout.getPaddingLeft(), getlivedatainternal, relativeLayout.getPaddingRight(), getlivedatainternal);
    }
}
