package o;

import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes2.dex */
public abstract class isCollapsed extends androidx.databinding.ViewDataBinding {
    public final androidx.appcompat.widget.AppCompatImageView ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    @androidx.databinding.Bindable
    protected increaseErrorId valueOf;

    public abstract void toString(increaseErrorId increaseerrorid);

    /* JADX INFO: Access modifiers changed from: protected */
    public isCollapsed(Object obj, View view, int i, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.ah$a = appCompatImageView;
        this.ag$a = appCompatImageView2;
        this.toString = constraintLayout;
    }

    public static isCollapsed valueOf(LayoutInflater layoutInflater) {
        return valueOf(layoutInflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static isCollapsed valueOf(LayoutInflater layoutInflater, Object obj) {
        return (isCollapsed) androidx.databinding.ViewDataBinding.inflateInternal(layoutInflater, com.app.dream11Pro.R.layout.res_0x7f0d004e, null, false, obj);
    }
}
