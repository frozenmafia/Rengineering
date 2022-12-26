package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.ReplyToMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.Dream11GPHMediaView;
/* loaded from: classes3.dex */
public abstract class makeOptionalFitsSystemWindows extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$c;
    public final LinearLayout ag$a;
    @androidx.databinding.Bindable
    protected ReplyToMessageVM ah$a;
    public final CustomTextView toString;
    public final ImageView valueOf;
    public final Dream11GPHMediaView values;

    public abstract void valueOf(ReplyToMessageVM replyToMessageVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public makeOptionalFitsSystemWindows(Object obj, View view, int i, Dream11GPHMediaView dream11GPHMediaView, ImageView imageView, LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.values = dream11GPHMediaView;
        this.valueOf = imageView;
        this.ag$a = linearLayout;
        this.toString = customTextView;
        this.HaptikSDK$c = customTextView2;
    }
}
