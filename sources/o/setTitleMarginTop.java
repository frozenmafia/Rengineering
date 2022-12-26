package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CircularImageView;
/* loaded from: classes3.dex */
public abstract class setTitleMarginTop extends androidx.databinding.ViewDataBinding {
    public final CircularImageView ag$a;
    public final ImageView ah$a;
    @androidx.databinding.Bindable
    protected getAnimationKeyFrames valueOf;

    public abstract void ag$a(getAnimationKeyFrames getanimationkeyframes);

    /* JADX INFO: Access modifiers changed from: protected */
    public setTitleMarginTop(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView) {
        super(obj, view, i);
        this.ag$a = circularImageView;
        this.ah$a = imageView;
    }
}
