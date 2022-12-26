package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import com.app.dream11.ui.CircularTextView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.TeamPreviewImageView;
/* loaded from: classes3.dex */
public abstract class getEndIconStyle extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final ImageView ag$a;
    public final TeamPreviewImageView ah$a;
    public final RelativeLayout ah$b;
    public final CustomTextView invoke;
    @androidx.databinding.Bindable
    protected PreviewPlayerInfo toString;
    public final ImageView valueOf;
    public final CircularTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getEndIconStyle(Object obj, View view, int i, ImageView imageView, CircularTextView circularTextView, ImageView imageView2, TeamPreviewImageView teamPreviewImageView, CustomTextView customTextView, CustomTextView customTextView2, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = circularTextView;
        this.ag$a = imageView2;
        this.ah$a = teamPreviewImageView;
        this.HaptikSDK$a = customTextView;
        this.invoke = customTextView2;
        this.ah$b = relativeLayout;
    }
}
