package com.facebook.hermes.instrumentation;
/* loaded from: classes6.dex */
public interface HermesMemoryDumper {
    String getId();

    String getInternalStorage();

    void setMetaData(String str);

    boolean shouldSaveSnapshot();
}
