package o;

import android.view.View;
import com.app.dream11.model.viewmodel.EnterMobileNumberVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.PreFixEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class onItemClicked extends androidx.databinding.ViewDataBinding {
    public final androidx.cardview.widget.CardView ag$a;
    public final TextInputLayout ah$a;
    public final CustomTextView toString;
    public final PreFixEditText valueOf;
    @androidx.databinding.Bindable
    protected EnterMobileNumberVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onItemClicked(Object obj, View view, int i, CustomTextView customTextView, PreFixEditText preFixEditText, TextInputLayout textInputLayout, androidx.cardview.widget.CardView cardView) {
        super(obj, view, i);
        this.toString = customTextView;
        this.valueOf = preFixEditText;
        this.ah$a = textInputLayout;
        this.ag$a = cardView;
    }
}
