package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.chatlist.ChatListUserGLBandVM;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class getDisabledThemeAttrColor extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView invoke;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected ChatListUserGLBandVM valueOf;
    public final ImageView values;

    public abstract void valueOf(ChatListUserGLBandVM chatListUserGLBandVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public getDisabledThemeAttrColor(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.values = imageView;
        this.toString = imageView2;
        this.ag$a = imageView3;
        this.ah$a = imageView4;
        this.ah$b = d11TextView;
        this.invoke = d11TextView2;
        this.HaptikSDK$c = d11TextView3;
    }
}
