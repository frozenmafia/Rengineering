package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ReplyToMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.Dream11GPHMediaView;
/* renamed from: o.isLayoutRtl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0381isLayoutRtl extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$b;
    public final View HaptikSDK$c;
    @androidx.databinding.Bindable
    protected ReplyToMessageVM ag$a;
    @androidx.databinding.Bindable
    protected View.OnClickListener ah$a;
    public final CustomTextView invoke;
    public final Dream11GPHMediaView toString;
    public final ImageView valueOf;
    public final ImageView values;

    public abstract void ah$a(View.OnClickListener onClickListener);

    public abstract void values(ReplyToMessageVM replyToMessageVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0381isLayoutRtl(Object obj, View view, int i, ImageView imageView, Dream11GPHMediaView dream11GPHMediaView, ImageView imageView2, View view2, CustomTextView customTextView, View view3) {
        super(obj, view, i);
        this.values = imageView;
        this.toString = dream11GPHMediaView;
        this.valueOf = imageView2;
        this.HaptikSDK$c = view2;
        this.invoke = customTextView;
        this.HaptikSDK$b = view3;
    }
}
