package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class access$300 extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$c;
    public final LinkableCustomTextView ag$a;
    public final CircularImageView ah$a;
    public final CustomTextView ah$b;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;
    public final ChatBubbleLayout valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public access$300(Object obj, View view, int i, CircularImageView circularImageView, ChatBubbleLayout chatBubbleLayout, LinearLayout linearLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ah$a = circularImageView;
        this.valueOf = chatBubbleLayout;
        this.values = linearLayout;
        this.ag$a = linkableCustomTextView;
        this.HaptikSDK$c = customTextView;
        this.ah$b = customTextView2;
    }
}
