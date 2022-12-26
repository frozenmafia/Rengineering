package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.teamselection.newcreateteam.ComponentSpecialPlayerList;
import com.app.dream11.ui.CustomTextView;
import java.util.ArrayList;
import o.ShareCompat;
/* loaded from: classes2.dex */
public abstract class onDropForView extends androidx.databinding.ViewDataBinding {
    public final ComponentSpecialPlayerList HaptikSDK$a;
    public final CustomTextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected Boolean HaptikSDK$c;
    public final CustomTextView HaptikSDK$e;
    public final CustomTextView HaptikWebView;
    @androidx.databinding.Bindable
    protected ArrayList<getExternalCacheDirs> ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    @androidx.databinding.Bindable
    protected createFilesDir ah$b;
    @androidx.databinding.Bindable
    protected ShareCompat.Api16Impl invoke;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onDropForView(Object obj, View view, int i, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView3, CustomTextView customTextView, ComponentSpecialPlayerList componentSpecialPlayerList, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.toString = imageView;
        this.values = imageView2;
        this.ah$a = guideline;
        this.valueOf = imageView3;
        this.HaptikSDK$b = customTextView;
        this.HaptikSDK$a = componentSpecialPlayerList;
        this.HaptikWebView = customTextView2;
        this.HaptikSDK$e = customTextView3;
    }
}
