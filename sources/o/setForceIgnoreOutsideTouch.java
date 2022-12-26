package o;

import android.view.View;
import android.widget.ImageView;
import o.NotificationCompat;
/* loaded from: classes2.dex */
public abstract class setForceIgnoreOutsideTouch extends androidx.databinding.ViewDataBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final ImageView ah$a;
    @androidx.databinding.Bindable
    protected NotificationCompat.CarExtender.UnreadConversation.Builder valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public setForceIgnoreOutsideTouch(Object obj, View view, int i, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.ag$a = constraintLayout;
    }
}
