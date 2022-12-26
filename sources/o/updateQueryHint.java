package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.ui.GroupsEntryComponent;
import com.app.dream11.ui.DreamViewPager;
import com.app.dream11.ui.creatteamcomponent.TabLayoutWithCount;
/* loaded from: classes2.dex */
public abstract class updateQueryHint extends androidx.databinding.ViewDataBinding {
    public final LinearLayout HaptikSDK$b;
    public final TabLayoutWithCount HaptikSDK$c;
    @androidx.databinding.Bindable
    protected Integer ag$a;
    @androidx.databinding.Bindable
    protected setWindowTitle ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final GroupsEntryComponent valueOf;
    public final DreamViewPager values;

    /* JADX INFO: Access modifiers changed from: protected */
    public updateQueryHint(Object obj, View view, int i, DreamViewPager dreamViewPager, GroupsEntryComponent groupsEntryComponent, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, TabLayoutWithCount tabLayoutWithCount, LinearLayout linearLayout) {
        super(obj, view, i);
        this.values = dreamViewPager;
        this.valueOf = groupsEntryComponent;
        this.toString = constraintLayout;
        this.HaptikSDK$c = tabLayoutWithCount;
        this.HaptikSDK$b = linearLayout;
    }
}
