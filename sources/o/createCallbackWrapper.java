package o;

import android.view.View;
import android.widget.RadioGroup;
import com.app.dream11.ui.CustomRadioButton;
import o.ActivityResultContracts;
/* loaded from: classes3.dex */
public abstract class createCallbackWrapper extends androidx.databinding.ViewDataBinding {
    public final CustomRadioButton ah$a;
    @androidx.databinding.Bindable
    protected ActivityResultContracts.OpenMultipleDocuments toString;
    public final RadioGroup valueOf;
    public final CustomRadioButton values;

    public abstract void ah$a(ActivityResultContracts.OpenMultipleDocuments openMultipleDocuments);

    /* JADX INFO: Access modifiers changed from: protected */
    public createCallbackWrapper(Object obj, View view, int i, CustomRadioButton customRadioButton, CustomRadioButton customRadioButton2, RadioGroup radioGroup) {
        super(obj, view, i);
        this.ah$a = customRadioButton;
        this.values = customRadioButton2;
        this.valueOf = radioGroup;
    }
}
