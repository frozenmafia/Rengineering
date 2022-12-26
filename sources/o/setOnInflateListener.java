package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.reaction.ReactionViewAllBottomSheetVM;
import com.app.dream11.newhome.CustomTabLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setOnInflateListener extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final View HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected ReactionViewAllBottomSheetVM ag$a;
    public final androidx.viewpager.widget.ViewPager ah$a;
    public final View ah$b;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout toString;
    public final ImageView valueOf;
    public final CustomTabLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setOnInflateListener(Object obj, View view, int i, ImageView imageView, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, androidx.viewpager.widget.ViewPager viewPager, CustomTabLayout customTabLayout, D11TextView d11TextView, D11TextView d11TextView2, View view2, View view3) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.toString = coordinatorLayout;
        this.ah$a = viewPager;
        this.values = customTabLayout;
        this.HaptikSDK$a = d11TextView;
        this.HaptikSDK$c = d11TextView2;
        this.HaptikSDK$b = view2;
        this.ah$b = view3;
    }
}
