package o;

import com.app.dream11.social.SocialHelper;
/* loaded from: classes3.dex */
public final class addLine {
    private androidx.databinding.ObservableField<Boolean> ah$a;
    private String toString;
    private androidx.databinding.ObservableField<SocialHelper.ConnectionStatus> valueOf;
    private final toString values;

    /* loaded from: classes3.dex */
    public interface toString {
        void values(addLine addline);
    }

    public addLine(toString tostring) {
        runAnimators.ag$a(tostring, "mHandler");
        this.values = tostring;
        this.toString = "";
        this.valueOf = new androidx.databinding.ObservableField<>();
        this.ah$a = new androidx.databinding.ObservableField<>(true);
    }

    public final toString values() {
        return this.values;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final androidx.databinding.ObservableField<SocialHelper.ConnectionStatus> ag$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.ah$a;
    }
}
