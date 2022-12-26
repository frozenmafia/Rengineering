package o;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public class willCreateInTime {
    private final Executor ah$a;
    private final Map<android.util.Pair<String, String>, Task<getRecycledViewCount>> toString = new androidx.collection.ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface toString {
        Task<getRecycledViewCount> values();
    }

    public willCreateInTime(Executor executor) {
        this.ah$a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Task<getRecycledViewCount> values(String str, String str2, toString tostring) {
        synchronized (this) {
            final android.util.Pair pair = new android.util.Pair(str, str2);
            Task<getRecycledViewCount> task = this.toString.get(pair);
            if (task != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    sb.append("Joining ongoing request for: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                return task;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("Making new request for: ");
                sb2.append(valueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            Task continueWithTask = tostring.values().continueWithTask(this.ah$a, new Continuation(this, pair) { // from class: o.clearScrap
                private final android.util.Pair ag$a;
                private final willCreateInTime values;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.values = this;
                    this.ag$a = pair;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.values.ag$a(this.ag$a, task2);
                }
            });
            this.toString.put(pair, continueWithTask);
            return continueWithTask;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task ag$a(android.util.Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.toString.remove(pair);
        }
        return task;
    }
}
