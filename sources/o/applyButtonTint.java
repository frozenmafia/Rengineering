package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.HeightAdjustableViewPager;
import com.app.dream11.ui.creatteamcomponent.TabLayoutWithCount;
import o.UnusedAppRestrictionsBackportServiceConnection;
/* loaded from: classes2.dex */
public abstract class applyButtonTint extends androidx.databinding.ViewDataBinding {
    public final TabLayoutWithCount ag$a;
    @androidx.databinding.Bindable
    protected UnusedAppRestrictionsBackportServiceConnection.AnonymousClass1 ah$a;
    public final View toString;
    public final CustomTextView valueOf;
    public final HeightAdjustableViewPager values;

    public abstract void valueOf(UnusedAppRestrictionsBackportServiceConnection.AnonymousClass1 anonymousClass1);

    /* JADX INFO: Access modifiers changed from: protected */
    public applyButtonTint(Object obj, View view, int i, View view2, TabLayoutWithCount tabLayoutWithCount, CustomTextView customTextView, HeightAdjustableViewPager heightAdjustableViewPager) {
        super(obj, view, i);
        this.toString = view2;
        this.ag$a = tabLayoutWithCount;
        this.valueOf = customTextView;
        this.values = heightAdjustableViewPager;
    }
}
