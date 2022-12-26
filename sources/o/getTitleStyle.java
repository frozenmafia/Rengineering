package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import com.app.dream11.ui.CircularTextView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.TeamPreviewImageView;
/* loaded from: classes3.dex */
public abstract class getTitleStyle extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final TeamPreviewImageView ah$a;
    public final CustomTextView ah$b;
    public final RelativeLayout invoke;
    @androidx.databinding.Bindable
    protected PreviewPlayerInfo toString;
    public final ImageView valueOf;
    public final CircularTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getTitleStyle(Object obj, View view, int i, ImageView imageView, CircularTextView circularTextView, TeamPreviewImageView teamPreviewImageView, CustomTextView customTextView, CustomTextView customTextView2, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = circularTextView;
        this.ah$a = teamPreviewImageView;
        this.ag$a = customTextView;
        this.ah$b = customTextView2;
        this.invoke = relativeLayout;
    }
}
