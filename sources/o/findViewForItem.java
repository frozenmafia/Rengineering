package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class findViewForItem extends androidx.databinding.ViewDataBinding {
    public final LinkableCustomTextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$b;
    public final LinearLayout ag$a;
    public final ChatBubbleLayout ah$a;
    public final CustomTextView invoke;
    public final CircularImageView toString;
    @androidx.databinding.Bindable
    protected ChatMessageVM valueOf;
    public final makeOptionalFitsSystemWindows values;

    /* JADX INFO: Access modifiers changed from: protected */
    public findViewForItem(Object obj, View view, int i, makeOptionalFitsSystemWindows makeoptionalfitssystemwindows, CircularImageView circularImageView, ChatBubbleLayout chatBubbleLayout, LinearLayout linearLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.values = makeoptionalfitssystemwindows;
        this.toString = circularImageView;
        this.ah$a = chatBubbleLayout;
        this.ag$a = linearLayout;
        this.HaptikSDK$a = linkableCustomTextView;
        this.HaptikSDK$b = customTextView;
        this.invoke = customTextView2;
    }
}
