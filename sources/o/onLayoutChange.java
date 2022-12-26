package o;

import android.view.View;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.creatteamcomponent.CreateTeamComponent;
/* loaded from: classes2.dex */
public abstract class onLayoutChange extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ContentResolverCompat ag$a;
    public final D11ErrorFrameLayout ah$a;
    public final CreateTeamComponent values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onLayoutChange(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, CreateTeamComponent createTeamComponent) {
        super(obj, view, i);
        this.ah$a = d11ErrorFrameLayout;
        this.values = createTeamComponent;
    }
}
