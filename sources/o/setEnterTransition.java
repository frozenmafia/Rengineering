package o;

import android.view.View;
import com.app.dream11.ui.creatteamcomponent.TabLayoutWithCount;
/* loaded from: classes2.dex */
public abstract class setEnterTransition extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected getWrapped ag$a;
    public final TabLayoutWithCount ah$a;
    @androidx.databinding.Bindable
    protected CamUtils toString;
    @androidx.databinding.Bindable
    protected String valueOf;
    public final androidx.viewpager.widget.ViewPager values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setEnterTransition(Object obj, View view, int i, TabLayoutWithCount tabLayoutWithCount, androidx.viewpager.widget.ViewPager viewPager) {
        super(obj, view, i);
        this.ah$a = tabLayoutWithCount;
        this.values = viewPager;
    }
}
