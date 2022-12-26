package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class setPresenter extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected ChatMessageVM ag$a;
    public final LinearLayout ah$a;
    public final ChatBubbleLayout toString;
    public final CircularImageView valueOf;
    public final LinkableCustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setPresenter(Object obj, View view, int i, ChatBubbleLayout chatBubbleLayout, CircularImageView circularImageView, LinearLayout linearLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView) {
        super(obj, view, i);
        this.toString = chatBubbleLayout;
        this.valueOf = circularImageView;
        this.ah$a = linearLayout;
        this.values = linkableCustomTextView;
        this.HaptikSDK$b = customTextView;
    }
}
