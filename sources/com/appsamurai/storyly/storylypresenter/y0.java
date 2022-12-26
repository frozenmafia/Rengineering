package com.appsamurai.storyly.storylypresenter;

import com.appsamurai.storyly.storylypresenter.storylyfooter.a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class y0 extends Lambda implements Styleable.ChangeBounds<List<? extends Pair<? extends Integer, ? extends Float>>, setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(o oVar) {
        super(1);
        this.a = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<? extends Pair<? extends Integer, ? extends Float>> list) {
        List<? extends Pair<? extends Integer, ? extends Float>> list2 = list;
        runAnimators.ag$a(list2, "parts");
        a interfaceDescriptor = this.a.getInterfaceDescriptor();
        interfaceDescriptor.getClass();
        runAnimators.ag$a(list2, "parts");
        a.values valuesVar = interfaceDescriptor.ah$a;
        if (valuesVar != 0) {
            valuesVar.ag$a(list2);
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
        return setAnimationMatrix.ag$a;
    }
}
