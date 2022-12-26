package o;

import android.view.View;
import com.app.dream11.chat.ui.ChatBubbleLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import o.SafeIterableMap;
/* loaded from: classes2.dex */
public abstract class performClick extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ChatMessageVM ag$a;
    public final LinkableCustomTextView ah$a;
    public final CustomTextView toString;
    public final SafeIterableMap.SupportRemove valueOf;
    public final ChatBubbleLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public performClick(Object obj, View view, int i, ChatBubbleLayout chatBubbleLayout, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView, SafeIterableMap.SupportRemove supportRemove) {
        super(obj, view, i);
        this.values = chatBubbleLayout;
        this.ah$a = linkableCustomTextView;
        this.toString = customTextView;
        this.valueOf = supportRemove;
    }
}
