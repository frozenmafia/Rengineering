package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.splashscreen.SplashScreenViewProvider;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends Lambda implements Styleable.ArcMotion<ViewGroup> {
    final /* synthetic */ SplashScreenViewProvider.ViewImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider$ViewImpl$_splashScreenView$2(SplashScreenViewProvider.ViewImpl viewImpl) {
        super(0);
        this.this$0 = viewImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewGroup invoke() {
        View inflate = FrameLayout.inflate(this.this$0.getActivity(), R.layout.splash_screen_view, null);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) inflate;
    }
}
