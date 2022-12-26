package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class AppCompatSeekBar extends androidx.databinding.ViewDataBinding {
    public final RelativeLayout HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected ServiceCompat ah$a;
    public final View ah$b;
    public final CircularImageView toString;
    @androidx.databinding.Bindable
    protected createFilesDir valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatSeekBar(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, CustomTextView customTextView, View view2) {
        super(obj, view, i);
        this.toString = circularImageView;
        this.ag$a = imageView;
        this.values = imageView2;
        this.HaptikSDK$b = relativeLayout;
        this.HaptikSDK$c = customTextView;
        this.ah$b = view2;
    }
}
