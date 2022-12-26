package o;

import android.view.View;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
/* loaded from: classes2.dex */
public abstract class setFrame extends androidx.databinding.ViewDataBinding {
    public final ChatBubbleLayout ag$a;
    public final CustomTextView ah$a;
    public final WithHint toString;
    @androidx.databinding.Bindable
    protected ChatMessageVM valueOf;
    public final LinkableCustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setFrame(Object obj, View view, int i, ChatBubbleLayout chatBubbleLayout, WithHint withHint, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ag$a = chatBubbleLayout;
        this.toString = withHint;
        this.values = linkableCustomTextView;
        this.ah$a = customTextView;
    }
}
