package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.ReplyToMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.Dream11GPHMediaView;
/* loaded from: classes3.dex */
public abstract class WithHint extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final LinearLayout ag$a;
    public final CustomTextView ah$a;
    public final Dream11GPHMediaView toString;
    @androidx.databinding.Bindable
    protected ReplyToMessageVM valueOf;
    public final ImageView values;

    public abstract void ag$a(ReplyToMessageVM replyToMessageVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public WithHint(Object obj, View view, int i, Dream11GPHMediaView dream11GPHMediaView, ImageView imageView, LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.toString = dream11GPHMediaView;
        this.values = imageView;
        this.ag$a = linearLayout;
        this.ah$a = customTextView;
        this.HaptikSDK$b = customTextView2;
    }
}
