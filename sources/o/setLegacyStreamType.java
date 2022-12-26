package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.giphy.sdk.ui.views.GifView;
import o.getRawLegacyStreamType;
/* loaded from: classes4.dex */
public final class setLegacyStreamType implements androidx.viewbinding.ViewBinding {
    public final GifView ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final ImageView values;

    private setLegacyStreamType(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, GifView gifView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, ImageView imageView) {
        this.toString = constraintLayout;
        this.ag$a = gifView;
        this.valueOf = constraintLayout2;
        this.values = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.toString;
    }

    public static setLegacyStreamType ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(getRawLegacyStreamType.toString.gph_smart_video_preview_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return values(inflate);
    }

    public static setLegacyStreamType values(View view) {
        int i = getRawLegacyStreamType$ah$a.gifView;
        GifView gifView = (GifView) view.findViewById(i);
        if (gifView != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
            int i2 = getRawLegacyStreamType$ah$a.soundIcon;
            ImageView imageView = (ImageView) view.findViewById(i2);
            if (imageView != null) {
                return new setLegacyStreamType(constraintLayout, gifView, constraintLayout, imageView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
