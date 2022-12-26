package o;
/* loaded from: classes3.dex */
public class getSystemGestureInsets extends consumeSystemWindowInsets<getStableInsetBottom> {
    public getSystemGestureInsets(getStableInsetBottom getstableinsetbottom) {
        super(getstableinsetbottom);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<getStableInsetBottom> valueOf() {
        return getStableInsetBottom.class;
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return ((getStableInsetBottom) this.valueOf).HaptikSDK$c();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
        ((getStableInsetBottom) this.valueOf).stop();
        ((getStableInsetBottom) this.valueOf).invoke();
    }

    @Override // o.consumeSystemWindowInsets, o.ViewKt$doOnPreDraw$1
    public void ah$a() {
        ((getStableInsetBottom) this.valueOf).ah$a().prepareToDraw();
    }
}
