package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getActivityIcon extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CustomTextView ah$a;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected String valueOf;
    public final CustomTextView values;

    public abstract void toString(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public getActivityIcon(Object obj, View view, int i, CustomTextView customTextView, ImageView imageView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.values = customTextView;
        this.toString = imageView;
        this.ah$a = customTextView2;
        this.ag$a = customTextView3;
    }

    public static getActivityIcon values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return ah$a(layoutInflater, viewGroup, z, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static getActivityIcon ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (getActivityIcon) androidx.databinding.ViewDataBinding.inflateInternal(layoutInflater, com.app.dream11Pro.R.layout.res_0x7f0d026b, viewGroup, z, obj);
    }
}
