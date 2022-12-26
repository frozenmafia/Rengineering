package o;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import o.StaggeredGridLayoutManager;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* loaded from: classes5.dex */
final class overrideDecorator<T> implements getWindowExtension<T, RequestBody> {
    private final Gson ah$a;
    private final StaggeredGridLayoutManager.LayoutParams<T> values;
    private static final MediaType valueOf = MediaType.get("application/json; charset=UTF-8");
    private static final Charset ag$a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    public overrideDecorator(Gson gson, StaggeredGridLayoutManager.LayoutParams<T> layoutParams) {
        this.ah$a = gson;
        this.values = layoutParams;
    }

    @Override // o.getWindowExtension
    /* renamed from: ah$a */
    public RequestBody ag$a(T t) throws IOException {
        getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
        StaggeredGridLayoutManager.Span values = this.ah$a.values(new OutputStreamWriter(getminsmallestwidth.HaptikSDK$d(), ag$a));
        this.values.write(values, t);
        values.close();
        return RequestBody.create(valueOf, getminsmallestwidth.aj$a());
    }
}
