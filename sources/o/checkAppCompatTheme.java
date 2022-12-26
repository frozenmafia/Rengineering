package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.chatlist.ChatListH2HBandVM;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class checkAppCompatTheme extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected ChatListH2HBandVM ah$a;
    public final D11TextView toString;
    public final D11TextView valueOf;
    public final ImageView values;

    public abstract void valueOf(ChatListH2HBandVM chatListH2HBandVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public checkAppCompatTheme(Object obj, View view, int i, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.values = imageView2;
        this.toString = d11TextView;
        this.valueOf = d11TextView2;
        this.HaptikSDK$a = d11TextView3;
    }
}
