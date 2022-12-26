package o;

import android.view.View;
import com.app.dream11.chat.reaction.ChatReactionsVM;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class getThemeAttrColor extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ChatReactionsVM ag$a;
    public final D11TextView ah$a;
    public final DreamRecyclerView valueOf;

    public abstract void valueOf(ChatReactionsVM chatReactionsVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public getThemeAttrColor(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView) {
        super(obj, view, i);
        this.valueOf = dreamRecyclerView;
        this.ah$a = d11TextView;
    }
}
