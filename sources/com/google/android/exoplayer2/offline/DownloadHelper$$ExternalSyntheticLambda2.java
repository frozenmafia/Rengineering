package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import java.util.List;
/* loaded from: classes7.dex */
public final /* synthetic */ class DownloadHelper$$ExternalSyntheticLambda2 implements TextOutput {
    public static final /* synthetic */ DownloadHelper$$ExternalSyntheticLambda2 INSTANCE = new DownloadHelper$$ExternalSyntheticLambda2();

    private /* synthetic */ DownloadHelper$$ExternalSyntheticLambda2() {
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public /* synthetic */ void onCues(List list) {
        TextOutput.CC.$default$onCues(this, list);
    }
}
