package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.PreFixEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class onCloseClicked extends androidx.databinding.ViewDataBinding {
    public final PreFixEditText ag$a;
    public final TextInputLayout ah$a;
    public final CustomTextView toString;
    @androidx.databinding.Bindable
    protected isTransitionFlag valueOf;
    public final androidx.cardview.widget.CardView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onCloseClicked(Object obj, View view, int i, CustomTextView customTextView, PreFixEditText preFixEditText, TextInputLayout textInputLayout, androidx.cardview.widget.CardView cardView) {
        super(obj, view, i);
        this.toString = customTextView;
        this.ag$a = preFixEditText;
        this.ah$a = textInputLayout;
        this.values = cardView;
    }
}
