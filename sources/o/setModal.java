package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import com.app.dream11.ui.CircularTextView;
import com.app.dream11.ui.TeamPreviewImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setModal extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final ImageView ag$a;
    public final TeamPreviewImageView ah$a;
    public final RelativeLayout ah$b;
    public final D11TextView invoke;
    @androidx.databinding.Bindable
    protected PreviewPlayerInfo toString;
    public final ImageView valueOf;
    public final CircularTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setModal(Object obj, View view, int i, ImageView imageView, CircularTextView circularTextView, ImageView imageView2, TeamPreviewImageView teamPreviewImageView, D11TextView d11TextView, D11TextView d11TextView2, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = circularTextView;
        this.ag$a = imageView2;
        this.ah$a = teamPreviewImageView;
        this.invoke = d11TextView;
        this.HaptikSDK$b = d11TextView2;
        this.ah$b = relativeLayout;
    }
}
