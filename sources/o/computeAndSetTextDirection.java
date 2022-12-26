package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import com.app.dream11.chat.GroupSettingItem;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class computeAndSetTextDirection extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final Switch ah$a;
    @androidx.databinding.Bindable
    protected GroupSettingItem.SettingAdminOnlyMessageToggle valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public computeAndSetTextDirection(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, Switch r6) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.values = customTextView;
        this.ah$a = r6;
    }
}
