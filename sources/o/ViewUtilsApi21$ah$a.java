package o;

import java.util.Iterator;
import kotlin.sequences.SequencesKt___SequencesKt$minus$2$iterator$1;
import o.FragmentTransitionSupport;
/* loaded from: classes7.dex */
public final class ViewUtilsApi21$ah$a implements invalidateChildInParent<T> {
    final /* synthetic */ T[] ah$a;
    final /* synthetic */ invalidateChildInParent<T> values;

    @Override // o.invalidateChildInParent
    public Iterator<T> iterator() {
        return transformMatrixToGlobal.values(this.values, new SequencesKt___SequencesKt$minus$2$iterator$1(FragmentTransitionSupport.AnonymousClass4.toString(this.ah$a))).iterator();
    }
}
