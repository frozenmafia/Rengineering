package o;

import java.io.IOException;
import o.ActivityResultContract;
/* loaded from: classes.dex */
public final class ActivityResultContract$SynchronousResult$ah$a extends ActivityResultContract.SynchronousResult {
    @Override // o.ActivityResultContract.SynchronousResult
    public void ag$a(R r) throws IOException {
        OnBackPressedDispatcherKt.values(r, "writer == null");
        r.ah$a("type").ag$a("connection_terminate");
    }
}
