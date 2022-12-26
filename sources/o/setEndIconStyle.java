package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.model.PlayerScoreCard;
/* loaded from: classes3.dex */
public abstract class setEndIconStyle extends androidx.databinding.ViewDataBinding {
    public final LinearLayout ag$a;
    @androidx.databinding.Bindable
    protected PlayerScoreCard ah$a;
    public final ImageView valueOf;
    public final androidx.recyclerview.widget.RecyclerView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setEndIconStyle(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ag$a = linearLayout;
        this.values = recyclerView;
    }
}
