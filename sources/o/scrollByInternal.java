package o;

import com.google.android.gms.tasks.OnFailureListener;
import o.removeOnItemTouchListener;
/* loaded from: classes7.dex */
final /* synthetic */ class scrollByInternal implements OnFailureListener {
    private final processAppeared$ah$a values;

    private scrollByInternal(processAppeared$ah$a processappeared_ah_a) {
        this.values = processappeared_ah_a;
    }

    public static OnFailureListener values(processAppeared$ah$a processappeared_ah_a) {
        return new scrollByInternal(processappeared_ah_a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        removeOnItemTouchListener.AnonymousClass4.toString(this.values, exc);
    }
}
