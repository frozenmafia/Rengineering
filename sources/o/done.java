package o;

import android.net.Uri;
import com.giphy.sdk.core.network.api.GPHApiClient;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.ModernAsyncTask;
/* loaded from: classes4.dex */
public interface done {
    Executor ag$a();

    <T> ModernAsyncTask.AsyncTaskResult<T> ah$a(Uri uri, String str, GPHApiClient.HTTPMethod hTTPMethod, Class<T> cls, Map<String, String> map, Map<String, String> map2);

    ExecutorService valueOf();

    <T> ModernAsyncTask.AsyncTaskResult<T> values(Uri uri, String str, GPHApiClient.HTTPMethod hTTPMethod, Class<T> cls, Map<String, String> map, Map<String, String> map2, Object obj);
}
