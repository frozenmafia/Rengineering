package o;

import com.appsamurai.storyly.storylypresenter.storylylayer.f1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.Styleable;
/* loaded from: classes3.dex */
public final class dispatchNestedScroll$ah$a {
    public List<f1> ag$a = new ArrayList();
    public Map<String, f1> ah$a = new LinkedHashMap();

    public final void valueOf(Styleable.ChangeBounds<? super Map<String, f1>, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(changeBounds, "block");
        synchronized (this.ah$a) {
            changeBounds.invoke(this.ah$a);
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
    }

    public final void values(Styleable.ChangeBounds<? super List<f1>, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(changeBounds, "block");
        synchronized (this.ag$a) {
            changeBounds.invoke(this.ag$a);
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
    }
}
