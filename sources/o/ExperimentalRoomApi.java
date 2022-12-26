package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class ExperimentalRoomApi implements androidx.viewbinding.ViewBinding {
    public final ImageView ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final TextView toString;

    private ExperimentalRoomApi(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.ah$a = constraintLayout;
        this.ag$a = imageView;
        this.toString = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ag$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ah$a;
    }

    public static ExperimentalRoomApi valueOf(View view) {
        int i = C0368entity.valueOf.ivBullet;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C0368entity.valueOf.tvPointer;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new ExperimentalRoomApi((androidx.constraintlayout.widget.ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
