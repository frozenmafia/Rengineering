package com.giphy.sdk.core.models.json;

import com.giphy.sdk.core.models.Media;
import com.google.gson.Gson;
import java.io.IOException;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class MainAdapterFactory implements offsetFullSpansForAddition {
    @Override // o.offsetFullSpansForAddition
    public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
        runAnimators.ag$a(gson, "gson");
        runAnimators.ag$a(invalidatespaninfo, "type");
        final StaggeredGridLayoutManager.LayoutParams<T> gson2 = gson.toString(this, invalidatespaninfo);
        return new StaggeredGridLayoutManager.LayoutParams<T>() { // from class: com.giphy.sdk.core.models.json.MainAdapterFactory$create$1
            @Override // o.StaggeredGridLayoutManager.LayoutParams
            public void write(StaggeredGridLayoutManager.Span span, T t) throws IOException {
                runAnimators.ag$a(span, "out");
                StaggeredGridLayoutManager.LayoutParams.this.write(span, t);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // o.StaggeredGridLayoutManager.LayoutParams
            public T read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
                runAnimators.ag$a(anonymousClass1, "in");
                ?? read = StaggeredGridLayoutManager.LayoutParams.this.read(anonymousClass1);
                if (read instanceof Media) {
                    ((Media) read).postProcess();
                }
                return read;
            }
        };
    }
}
