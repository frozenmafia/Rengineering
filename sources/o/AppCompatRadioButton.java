package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.social.ui.customviews.UserTeamCardComponent;
/* loaded from: classes2.dex */
public abstract class AppCompatRadioButton extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected access$900 toString;
    public final UserTeamCardComponent valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatRadioButton(Object obj, View view, int i, UserTeamCardComponent userTeamCardComponent, ImageView imageView) {
        super(obj, view, i);
        this.valueOf = userTeamCardComponent;
        this.ag$a = imageView;
    }
}
