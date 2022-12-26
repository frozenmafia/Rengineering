package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.GroupLeaderboardVM;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public abstract class getSubtitleTextView extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ag$a;
    @androidx.databinding.Bindable
    protected GroupLeaderboardVM ah$a;
    public final ImageView toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final ImageView values;

    public abstract void ah$a(GroupLeaderboardVM groupLeaderboardVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public getSubtitleTextView(Object obj, View view, int i, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, DreamRecyclerView dreamRecyclerView, ImageView imageView2) {
        super(obj, view, i);
        this.toString = imageView;
        this.valueOf = constraintLayout;
        this.ag$a = dreamRecyclerView;
        this.values = imageView2;
    }
}
