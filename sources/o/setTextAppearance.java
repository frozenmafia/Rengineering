package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import com.dream11.design.textview.D11TextView;
import o.MapCollections;
/* loaded from: classes2.dex */
public abstract class setTextAppearance extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected LruCacheKt$lruCache$4 HaptikSDK$a;
    public final D11TextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected HallOfFameMatchGFragment ag$a;
    @androidx.databinding.Bindable
    protected String ah$a;
    public final LinearLayout invoke;
    @androidx.databinding.Bindable
    protected HallOfFameMatchCenterQuery.Edge1 toString;
    @androidx.databinding.Bindable
    protected MapCollections.EntrySet valueOf;
    public final D11LinearLayoutTracker values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTextAppearance(Object obj, View view, int i, D11LinearLayoutTracker d11LinearLayoutTracker, LinearLayout linearLayout, D11TextView d11TextView) {
        super(obj, view, i);
        this.values = d11LinearLayoutTracker;
        this.invoke = linearLayout;
        this.HaptikSDK$c = d11TextView;
    }
}
