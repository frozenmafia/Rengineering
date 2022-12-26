package com.facebook.imagepipeline.nativecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.ComputableLiveData;
/* loaded from: classes4.dex */
public class ImagePipelineNativeLoader {
    public static final List<String> DEPENDENCIES = Collections.unmodifiableList(new ArrayList());
    public static final String DSO_NAME = "imagepipeline";

    public static void load() {
        ComputableLiveData.values(DSO_NAME);
    }
}
