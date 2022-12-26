package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.app.dream11.teamselection.newcreateteam.ComponentSortItem;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class getResultsSource {
    @androidx.databinding.BindingAdapter({com.facebook.hermes.intl.Constants.SORT})
    public static final void values(ComponentSortItem componentSortItem, getNoBackupFilesDir getnobackupfilesdir) {
        if (componentSortItem == null) {
            return;
        }
        componentSortItem.setVm(getnobackupfilesdir);
    }

    @androidx.databinding.BindingAdapter({"animateView"})
    public static final void toString(ComponentSortItem componentSortItem, int i) {
        androidx.constraintlayout.widget.ConstraintLayout values;
        Context context;
        if (i > 0) {
            Drawable drawable = null;
            androidx.constraintlayout.widget.ConstraintLayout values2 = componentSortItem == null ? null : componentSortItem.values();
            if (values2 != null) {
                values2.setBackground((componentSortItem == null || (context = componentSortItem.getContext()) == null) ? null : context.getDrawable(com.app.dream11Pro.R.drawable.transition_drawable));
            }
            if (componentSortItem != null && (values = componentSortItem.values()) != null) {
                drawable = values.getBackground();
            }
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            ((TransitionDrawable) drawable).startTransition(3000);
        }
    }
}
