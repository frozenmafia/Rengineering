package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class PausingDispatcher extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Drawable ag$a;
    public final TextView ah$a;
    @androidx.databinding.Bindable
    protected String toString;
    public final ImageView valueOf;

    public abstract void values(Drawable drawable);

    public abstract void values(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public PausingDispatcher(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ah$a = textView;
    }
}
