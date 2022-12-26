package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import o.WindowInsetsAnimationCompat;
import o.at;
import o.copyWindowDataInto;
import o.setLayoutMode;
@Deprecated
/* loaded from: classes6.dex */
public class OkHttpGlideModule implements copyWindowDataInto {
    @Override // o.WindowInsetsCompat.BuilderImpl30
    public void values(Context context, at atVar) {
    }

    @Override // o.getInsetsForType
    public void ah$a(Context context, Glide glide, Registry registry) {
        registry.valueOf(WindowInsetsAnimationCompat.BoundsCompat.class, InputStream.class, new setLayoutMode.values());
    }
}
