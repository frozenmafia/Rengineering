package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.chat.reaction.ChatReactionListingVM;
import com.app.dream11.core.ui.PaginationRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class createVoiceAppSearchIntent extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final ProgressBar ag$a;
    @androidx.databinding.Bindable
    protected ChatReactionListingVM ah$a;
    public final ImageView toString;
    public final PaginationRecyclerView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public createVoiceAppSearchIntent(Object obj, View view, int i, ImageView imageView, ProgressBar progressBar, PaginationRecyclerView paginationRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = imageView;
        this.ag$a = progressBar;
        this.valueOf = paginationRecyclerView;
        this.values = d11TextView;
        this.HaptikSDK$b = d11TextView2;
    }
}
