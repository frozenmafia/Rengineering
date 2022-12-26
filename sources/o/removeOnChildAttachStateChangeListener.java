package o;

import com.google.android.gms.tasks.OnSuccessListener;
/* loaded from: classes7.dex */
final /* synthetic */ class removeOnChildAttachStateChangeListener implements OnSuccessListener {
    private final processAppeared$ah$a valueOf;

    private removeOnChildAttachStateChangeListener(processAppeared$ah$a processappeared_ah_a) {
        this.valueOf = processappeared_ah_a;
    }

    public static OnSuccessListener ag$a(processAppeared$ah$a processappeared_ah_a) {
        return new removeOnChildAttachStateChangeListener(processappeared_ah_a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.valueOf.toString(((findViewByPosition) obj).valueOf());
    }
}
