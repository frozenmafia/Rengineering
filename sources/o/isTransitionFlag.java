package o;

import com.app.dream11.model.viewmodel.BasePageVM;
import o.MotionScene;
/* loaded from: classes3.dex */
public final class isTransitionFlag extends BasePageVM {
    private String ag$a;
    private MotionScene.Transition ah$a;
    @androidx.databinding.Bindable
    private String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isTransitionFlag) {
            isTransitionFlag istransitionflag = (isTransitionFlag) obj;
            return runAnimators.values((Object) this.ag$a, (Object) istransitionflag.ag$a) && runAnimators.values(this.ah$a, istransitionflag.ah$a) && runAnimators.values((Object) this.values, (Object) istransitionflag.values);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        String str = this.ag$a;
        MotionScene.Transition transition = this.ah$a;
        String str2 = this.values;
        return "EnterMobileNumberFor2FAVM(mobileNumber=" + str + ", handler=" + transition + ", errorMessage=" + str2 + ")";
    }

    public isTransitionFlag(String str, MotionScene.Transition transition, String str2) {
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(transition, "handler");
        runAnimators.ag$a(str2, "errorMessage");
        this.ag$a = str;
        this.ah$a = transition;
        this.values = str2;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "error");
        this.values = str;
        notifyPropertyChanged(100);
    }
}
