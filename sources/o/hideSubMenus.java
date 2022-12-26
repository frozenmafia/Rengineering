package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class hideSubMenus extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$c;
    public final ImageView ag$a;
    public final ChatBubbleLayout ah$a;
    public final CustomTextView ah$b;
    public final LinkableCustomTextView invoke;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;
    public final LinearLayout valueOf;
    public final CircularImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public hideSubMenus(Object obj, View view, int i, ChatBubbleLayout chatBubbleLayout, CircularImageView circularImageView, ImageView imageView, LinearLayout linearLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ah$a = chatBubbleLayout;
        this.values = circularImageView;
        this.ag$a = imageView;
        this.valueOf = linearLayout;
        this.invoke = linkableCustomTextView;
        this.HaptikSDK$c = customTextView;
        this.ah$b = customTextView2;
    }
}
