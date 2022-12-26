package o;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o.RecyclerView;
import o.getChangedScrapViewForPosition;
/* loaded from: classes5.dex */
public class getScrapCount extends Binder {
    private final values ah$a;

    /* loaded from: classes5.dex */
    public interface values {
        Task<Void> valueOf(Intent intent);
    }

    public getScrapCount(values valuesVar) {
        this.ah$a = valuesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(final getChangedScrapViewForPosition.toString tostring) {
        Executor executor;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        Task<Void> valueOf = this.ah$a.valueOf(tostring.valueOf);
        executor = RecyclerView.Orientation.toString;
        valueOf.addOnCompleteListener(executor, new OnCompleteListener(tostring) { // from class: o.dispatchViewRecycled
            private final getChangedScrapViewForPosition.toString values;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.values = tostring;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.values.values();
            }
        });
    }
}
