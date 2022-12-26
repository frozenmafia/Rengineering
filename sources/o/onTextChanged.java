package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.picker.PickerModel;
/* loaded from: classes2.dex */
public abstract class onTextChanged extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected PickerModel valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onTextChanged(Object obj, View view, int i, CustomTextView customTextView, ImageView imageView) {
        super(obj, view, i);
        this.values = customTextView;
        this.ag$a = imageView;
    }
}
