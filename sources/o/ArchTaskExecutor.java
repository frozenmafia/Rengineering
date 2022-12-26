package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.model.viewmodel.SearchVM;
import com.app.dream11.ui.CustomEditTextView;
import com.app.dream11.ui.CustomStrikeTextView;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class ArchTaskExecutor extends androidx.databinding.ViewDataBinding {
    public final LinearLayout HaptikSDK$a;
    public final ProgressBar HaptikSDK$b;
    public final RelativeLayout HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    @androidx.databinding.Bindable
    protected ContestItemVM ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    public final LinearLayout ah$b;
    public final android.widget.Space ak;
    public final D11TextView getInitSettings;
    public final CustomStrikeTextView getSignupData;
    public final LinearLayout invoke;
    public final D11TextView isLogoutPending;
    public final D11TextView onXdkEvent;
    public final D11Button toString;
    public final LinearLayout valueOf;
    public final D11TextView values;

    public abstract void toString(ContestItemVM contestItemVM);

    /* renamed from: o.ArchTaskExecutor$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public abstract class AnonymousClass1 extends androidx.databinding.ViewDataBinding {
        public final CustomEditTextView ag$a;
        public final ImageView toString;
        @androidx.databinding.Bindable
        protected SearchVM valueOf;

        public abstract void valueOf(SearchVM searchVM);

        /* JADX INFO: Access modifiers changed from: protected */
        public AnonymousClass1(Object obj, View view, int i, CustomEditTextView customEditTextView, ImageView imageView) {
            super(obj, view, i);
            this.ag$a = customEditTextView;
            this.toString = imageView;
        }
    }

    /* renamed from: o.ArchTaskExecutor$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public abstract class AnonymousClass2 extends androidx.databinding.ViewDataBinding {
        public final View ag$a;
        public final ImageView ah$a;
        @androidx.databinding.Bindable
        protected Boolean toString;
        public final ImageView valueOf;
        public final View values;

        public abstract void toString(Boolean bool);

        /* JADX INFO: Access modifiers changed from: protected */
        public AnonymousClass2(Object obj, View view, int i, ImageView imageView, ImageView imageView2, View view2, View view3) {
            super(obj, view, i);
            this.ah$a = imageView;
            this.valueOf = imageView2;
            this.values = view2;
            this.ag$a = view3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ArchTaskExecutor(Object obj, View view, int i, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11TextView d11TextView, D11Button d11Button, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, ProgressBar progressBar, LinearLayout linearLayout3, LinearLayout linearLayout4, CustomStrikeTextView customStrikeTextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, android.widget.Space space, D11TextView d11TextView7) {
        super(obj, view, i);
        this.ah$a = appCompatImageView;
        this.values = d11TextView;
        this.toString = d11Button;
        this.valueOf = linearLayout;
        this.HaptikSDK$a = linearLayout2;
        this.HaptikSDK$c = relativeLayout;
        this.HaptikSDK$b = progressBar;
        this.ah$b = linearLayout3;
        this.invoke = linearLayout4;
        this.getSignupData = customStrikeTextView;
        this.getInitSettings = d11TextView2;
        this.HaptikSDK$d = d11TextView3;
        this.HaptikSDK$e = d11TextView4;
        this.HaptikWebView = d11TextView5;
        this.isLogoutPending = d11TextView6;
        this.ak = space;
        this.onXdkEvent = d11TextView7;
    }
}
