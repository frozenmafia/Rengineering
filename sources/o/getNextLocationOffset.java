package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getNextLocationOffset extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final TextInputEditText ah$a;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected getLongLivedFromExtra valueOf;
    public final TextInputLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getNextLocationOffset(Object obj, View view, int i, ImageView imageView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, D11TextView d11TextView) {
        super(obj, view, i);
        this.toString = imageView;
        this.ah$a = textInputEditText;
        this.values = textInputLayout;
        this.ag$a = d11TextView;
    }
}
