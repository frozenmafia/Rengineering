package o;

import android.view.View;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
/* loaded from: classes2.dex */
public abstract class setMenuView extends androidx.databinding.ViewDataBinding {
    public final LinkableCustomTextView ag$a;
    public final ChatBubbleLayout ah$a;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setMenuView(Object obj, View view, int i, ChatBubbleLayout chatBubbleLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ah$a = chatBubbleLayout;
        this.ag$a = linkableCustomTextView;
        this.values = customTextView;
    }
}
