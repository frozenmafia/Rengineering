package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ChatToolbarVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public abstract class ThemedSpinnerAdapter extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Boolean ah$a;
    public final ShimmerFrameLayout toString;

    public abstract void toString(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public ThemedSpinnerAdapter(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.toString = shimmerFrameLayout;
    }

    /* loaded from: classes3.dex */
    public abstract class Helper extends androidx.databinding.ViewDataBinding {
        @androidx.databinding.Bindable
        protected ChatToolbarVM ag$a;
        public final D11TextView ah$a;
        public final ImageView toString;
        public final CircularImageView valueOf;
        public final D11TextView values;

        public abstract void ah$a(ChatToolbarVM chatToolbarVM);

        /* JADX INFO: Access modifiers changed from: protected */
        public Helper(Object obj, View view, int i, D11TextView d11TextView, CircularImageView circularImageView, ImageView imageView, D11TextView d11TextView2) {
            super(obj, view, i);
            this.ah$a = d11TextView;
            this.valueOf = circularImageView;
            this.toString = imageView;
            this.values = d11TextView2;
        }
    }
}
