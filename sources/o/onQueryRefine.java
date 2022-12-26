package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.model.viewmodel.EnterMobileNumberVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.PreFixEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class onQueryRefine extends androidx.databinding.ViewDataBinding {
    public final androidx.cardview.widget.CardView HaptikSDK$a;
    public final CustomTextView ag$a;
    public final ImageView ah$a;
    public final PreFixEditText toString;
    @androidx.databinding.Bindable
    protected EnterMobileNumberVM valueOf;
    public final TextInputLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onQueryRefine(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, PreFixEditText preFixEditText, TextInputLayout textInputLayout, androidx.cardview.widget.CardView cardView) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.ag$a = customTextView;
        this.toString = preFixEditText;
        this.values = textInputLayout;
        this.HaptikSDK$a = cardView;
    }
}
