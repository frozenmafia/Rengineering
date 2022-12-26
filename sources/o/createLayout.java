package o;

import android.view.View;
import com.app.dream11.contest.teamcompare.HighlightedHeaderComponent;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class createLayout extends androidx.databinding.ViewDataBinding {
    public final View ag$a;
    @androidx.databinding.Bindable
    protected isParserOutdated ah$a;
    public final DreamRecyclerView toString;
    public final HighlightedHeaderComponent valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public createLayout(Object obj, View view, int i, View view2, HighlightedHeaderComponent highlightedHeaderComponent, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.ag$a = view2;
        this.valueOf = highlightedHeaderComponent;
        this.toString = dreamRecyclerView;
    }
}
