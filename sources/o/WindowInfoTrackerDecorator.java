package o;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import o.StaggeredGridLayoutManager;
import okhttp3.ResponseBody;
/* loaded from: classes5.dex */
final class WindowInfoTrackerDecorator<T> implements getWindowExtension<ResponseBody, T> {
    private final StaggeredGridLayoutManager.LayoutParams<T> ag$a;
    private final Gson toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInfoTrackerDecorator(Gson gson, StaggeredGridLayoutManager.LayoutParams<T> layoutParams) {
        this.toString = gson;
        this.ag$a = layoutParams;
    }

    @Override // o.getWindowExtension
    /* renamed from: ah$a */
    public T ag$a(ResponseBody responseBody) throws IOException {
        StaggeredGridLayoutManager.SavedState.AnonymousClass1 gson = this.toString.toString(responseBody.charStream());
        try {
            T read = this.ag$a.read(gson);
            if (gson.aj$a() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
