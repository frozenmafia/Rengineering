package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dreampay.cards.otp.OTPHelperView;
import o.dispatchAnimationFrame;
/* loaded from: classes4.dex */
public final class isEmojiStyle implements androidx.viewbinding.ViewBinding {
    private final FrameLayout ah$a;
    public final OTPHelperView valueOf;

    private isEmojiStyle(FrameLayout frameLayout, OTPHelperView oTPHelperView) {
        this.ah$a = frameLayout;
        this.valueOf = oTPHelperView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public FrameLayout getRoot() {
        return this.ah$a;
    }

    public static isEmojiStyle values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(dispatchAnimationFrame.valueOf.fragment_auto_otp_read, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return values(inflate);
    }

    public static isEmojiStyle values(View view) {
        int i = dispatchAnimationFrame$ah$a.otp_helper_view;
        OTPHelperView oTPHelperView = (OTPHelperView) view.findViewById(i);
        if (oTPHelperView != null) {
            return new isEmojiStyle((FrameLayout) view, oTPHelperView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
