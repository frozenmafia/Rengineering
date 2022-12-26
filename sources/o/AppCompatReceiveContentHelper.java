package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatReceiveContentHelper extends androidx.databinding.ViewDataBinding {
    public final androidx.cardview.widget.CardView ag$a;
    public final RelativeLayout ah$a;
    @androidx.databinding.Bindable
    protected setFinalValue valueOf;

    /* renamed from: o.AppCompatReceiveContentHelper$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract class AnonymousClass1 extends androidx.databinding.ViewDataBinding {
        @androidx.databinding.Bindable
        protected setGoneMargin values;

        /* JADX INFO: Access modifiers changed from: protected */
        public AnonymousClass1(Object obj, View view, int i) {
            super(obj, view, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatReceiveContentHelper(Object obj, View view, int i, androidx.cardview.widget.CardView cardView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.ag$a = cardView;
        this.ah$a = relativeLayout;
    }

    /* loaded from: classes2.dex */
    public abstract class OnDropApi24Impl extends androidx.databinding.ViewDataBinding {
        public final CustomTextView HaptikSDK$a;
        public final View HaptikSDK$b;
        public final RelativeLayout HaptikSDK$c;
        public final D11TextView ag$a;
        public final D11TextView ah$a;
        @androidx.databinding.Bindable
        protected setFinalValue ah$b;
        public final D11TextView invoke;
        public final androidx.cardview.widget.CardView toString;
        public final D11TextView valueOf;
        public final androidx.appcompat.widget.AppCompatImageView values;

        /* JADX INFO: Access modifiers changed from: protected */
        public OnDropApi24Impl(Object obj, View view, int i, D11TextView d11TextView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11TextView d11TextView2, D11TextView d11TextView3, androidx.cardview.widget.CardView cardView, RelativeLayout relativeLayout, View view2, CustomTextView customTextView, D11TextView d11TextView4) {
            super(obj, view, i);
            this.ag$a = d11TextView;
            this.values = appCompatImageView;
            this.ah$a = d11TextView2;
            this.valueOf = d11TextView3;
            this.toString = cardView;
            this.HaptikSDK$c = relativeLayout;
            this.HaptikSDK$b = view2;
            this.HaptikSDK$a = customTextView;
            this.invoke = d11TextView4;
        }
    }
}
