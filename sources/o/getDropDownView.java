package o;

import android.view.View;
import com.app.dream11.playerpoints.PreviewPlayersStatsItem;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getDropDownView extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected PreviewPlayersStatsItem.PreviewPlayersPointBreakup toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getDropDownView(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.valueOf = customTextView2;
        this.values = customTextView3;
    }
}
