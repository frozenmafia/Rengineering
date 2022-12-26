package o;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes2.dex */
public class AppCompatImageView extends AppCompatMultiAutoCompleteTextView {
    private static final SparseIntArray ag$a = null;
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private final androidx.appcompat.widget.AppCompatImageView ah$b;
    private long valueOf;
    private final FrameLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AppCompatImageView(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, ag$a));
    }

    private AppCompatImageView(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.valueOf = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.values = frameLayout;
        frameLayout.setTag(null);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) objArr[1];
        this.ah$b = appCompatImageView;
        appCompatImageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (263 == i) {
            values((getHorizontalChainStyle) obj);
            return true;
        }
        return false;
    }

    public void values(getHorizontalChainStyle gethorizontalchainstyle) {
        this.toString = gethorizontalchainstyle;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        getHorizontalChainStyle gethorizontalchainstyle = this.toString;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || gethorizontalchainstyle == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            z = false;
        } else {
            str = gethorizontalchainstyle.ah$a();
            String invoke = gethorizontalchainstyle.invoke();
            boolean ag$a2 = gethorizontalchainstyle.ag$a();
            String HaptikSDK$c = gethorizontalchainstyle.HaptikSDK$c();
            String values = gethorizontalchainstyle.values();
            str3 = invoke;
            z = ag$a2;
            str4 = HaptikSDK$c;
            str2 = gethorizontalchainstyle.valueOf();
            str5 = values;
        }
        if (i != 0) {
            if (getBuildSdkInt() >= 4) {
                this.ah$b.setContentDescription(str);
            }
            Drawable drawable = null;
            createPopup.ah$a(this.ah$b, str2, drawable, drawable, z, str3, str4, str5);
        }
    }
}
