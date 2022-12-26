package o;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class fixStartGap$ag$a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
    private final CountDownLatch ah$a;

    private fixStartGap$ag$a() {
        this.ah$a = new CountDownLatch(1);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(TResult tresult) {
        this.ah$a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.ah$a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.ah$a.countDown();
    }

    public boolean ah$a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.ah$a.await(j, timeUnit);
    }
}
