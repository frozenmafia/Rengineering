package o;

import com.app.dream11.preview.ErrorStateVM$onClickRetry$1;
import o.Styleable;
/* loaded from: classes3.dex */
public final class onAttachedToLayoutParams {
    private final toString ag$a;
    private final Styleable.ArcMotion<setAnimationMatrix> ah$a;
    private String valueOf;
    private String values;

    /* loaded from: classes3.dex */
    public interface toString {
        void performRetry();
    }

    public onAttachedToLayoutParams(toString tostring) {
        runAnimators.ag$a(tostring, "callback");
        this.ag$a = tostring;
        this.ah$a = new ErrorStateVM$onClickRetry$1(this);
    }

    public final toString ah$a() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void valueOf(String str) {
        this.valueOf = str;
    }

    public final String ag$a() {
        return this.values;
    }

    public final void ag$a(String str) {
        this.values = str;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> values() {
        return this.ah$a;
    }
}
