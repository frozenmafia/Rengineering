package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import defpackage.ch;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.binderDied;
import o.invoke;
import o.onCreate;
import o.onSessionEvent;
import o.putEncryptedObject;
/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public class bz implements onCreate, Future<Bundle> {
    private static final String ah$a = "bz";
    protected AuthError ag$a;
    protected final CountDownLatch toString;
    protected final invoke valueOf;
    protected Bundle values;

    /* renamed from: bz$a */
    /* loaded from: classes.dex */
    public enum a {
        SUCCESS,
        ERROR,
        CANCEL
    }

    public bz() {
        this(null);
    }

    public bz(invoke invokeVar) {
        this.valueOf = invokeVar == null ? new binderDied() : invokeVar;
        this.toString = new CountDownLatch(1);
    }

    private void ag$a() {
        if (onSessionEvent.values()) {
            Log.e(ah$a, "Cannot call get on the main thread, unless you want ANRs");
            throw new IllegalStateException("Cannot call get on the main thread, unless you want ANRs");
        }
    }

    public Bundle ah$a() {
        AuthError authError = this.ag$a;
        if (authError != null) {
            Bundle errorBundle = AuthError.getErrorBundle(authError);
            errorBundle.putSerializable(ch.b.FUTURE.f19a, a.ERROR);
            return errorBundle;
        }
        return this.values;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: ah$a */
    public Bundle get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        ag$a();
        String str = ah$a;
        putEncryptedObject.valueOf(str, "Running get on Future with timeout=" + j + "unit=" + timeUnit.name());
        this.toString.await(j, timeUnit);
        return ah$a();
    }

    @Override // o.ensureViewModelStore
    /* renamed from: ah$a */
    public void ag$a(AuthError authError) {
        this.ag$a = authError;
        this.toString.countDown();
        this.valueOf.ah$a(authError);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.toString.getCount() == 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.ensureViewModelStore
    public void toString(Bundle bundle) {
        this.values = bundle;
        if (bundle == null) {
            putEncryptedObject.toString(ah$a, "Null Response");
            this.values = new Bundle();
        }
        this.values.putSerializable(ch.b.FUTURE.f19a, a.SUCCESS);
        this.toString.countDown();
        this.valueOf.toString(bundle);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: valueOf */
    public Bundle get() throws InterruptedException, ExecutionException {
        ag$a();
        putEncryptedObject.valueOf(ah$a, "Running get on Future");
        this.toString.await();
        return ah$a();
    }
}
