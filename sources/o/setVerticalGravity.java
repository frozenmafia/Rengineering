package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
import o.NotificationCompat;
/* loaded from: classes2.dex */
public abstract class setVerticalGravity extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected NotificationCompat.CarExtender.UnreadConversation.Builder ah$a;
    public final D11TextView toString;
    public final DreamRecyclerView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setVerticalGravity(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = dreamRecyclerView;
        this.values = d11TextView;
        this.toString = d11TextView2;
    }
}
