package o;

import java.util.Date;
/* loaded from: classes4.dex */
public class setMaximumVelocity implements constrainEdgeValue {
    @Override // o.constrainEdgeValue
    public void values() {
    }

    @Override // o.constrainEdgeValue
    public double ah$a() {
        return new Date().getTime();
    }
}
