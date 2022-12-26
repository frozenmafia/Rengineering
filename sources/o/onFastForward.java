package o;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class onFastForward {
    private final LottieDrawable ah$a;
    private final LottieAnimationView toString;
    private final Map<String, String> valueOf;
    private boolean values;

    public String values(String str) {
        return str;
    }

    onFastForward() {
        this.valueOf = new HashMap();
        this.values = true;
        this.toString = null;
        this.ah$a = null;
    }

    public onFastForward(LottieAnimationView lottieAnimationView) {
        this.valueOf = new HashMap();
        this.values = true;
        this.toString = lottieAnimationView;
        this.ah$a = null;
    }

    public String ag$a(String str, String str2) {
        return values(str2);
    }

    public void values(String str, String str2) {
        this.valueOf.put(str, str2);
        values();
    }

    public final String toString(String str, String str2) {
        if (this.values && this.valueOf.containsKey(str2)) {
            return this.valueOf.get(str2);
        }
        String ag$a = ag$a(str, str2);
        if (this.values) {
            this.valueOf.put(str2, ag$a);
        }
        return ag$a;
    }

    private void values() {
        LottieAnimationView lottieAnimationView = this.toString;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.ah$a;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }
}
