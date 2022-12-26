package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o.changeActiveCounter;
/* loaded from: classes4.dex */
public abstract class MutableLiveData extends androidx.databinding.ViewDataBinding {
    public final TextView HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final TextView ag$a;
    @androidx.databinding.Bindable
    protected changeActiveCounter ah$a;
    public final androidx.recyclerview.widget.RecyclerView ah$b;
    public final TextView invoke;
    @androidx.databinding.Bindable
    protected Integer toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected changeActiveCounter.valueOf values;

    /* JADX INFO: Access modifiers changed from: protected */
    public MutableLiveData(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, androidx.recyclerview.widget.RecyclerView recyclerView, ImageView imageView2, TextView textView3) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ag$a = textView;
        this.invoke = textView2;
        this.ah$b = recyclerView;
        this.HaptikSDK$c = imageView2;
        this.HaptikSDK$b = textView3;
    }
}
