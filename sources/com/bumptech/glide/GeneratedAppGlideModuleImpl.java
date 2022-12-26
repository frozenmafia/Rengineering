package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.app.dream11.utils.GlideConfiguration;
import java.util.Collections;
import java.util.Set;
import o.ViewCompat;
import o.at;
import o.hasPermanentMenuKey;
/* loaded from: classes3.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final GlideConfiguration toString = new GlideConfiguration();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.app.dream11.utils.GlideConfiguration");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override // o.WindowInsetsCompat.BuilderImpl29, o.WindowInsetsCompat.BuilderImpl30
    public void values(Context context, at atVar) {
        this.toString.values(context, atVar);
    }

    @Override // o.WindowInsetsCompat.Impl, o.getInsetsForType
    public void ah$a(Context context, Glide glide, Registry registry) {
        new hasPermanentMenuKey().ah$a(context, glide, registry);
        this.toString.ah$a(context, glide, registry);
    }

    @Override // o.WindowInsetsCompat.BuilderImpl29
    public boolean valueOf() {
        return this.toString.valueOf();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> values() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: ah$a */
    public ViewCompat.UnhandledKeyEventManager ag$a() {
        return new ViewCompat.UnhandledKeyEventManager();
    }
}
