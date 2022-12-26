package com.giphy.sdk.core;

import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.core.network.response.MediaResponse;
import java.util.List;
import o.Transition;
import o.postResult;
import o.publishProgress;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class GPHCore {
    public static final GPHCore INSTANCE = new GPHCore();

    private GPHCore() {
    }

    /* loaded from: classes6.dex */
    public static final class values implements postResult<MediaResponse> {
        final /* synthetic */ Transition valueOf;

        values(Transition transition) {
            this.valueOf = transition;
        }

        @Override // o.postResult
        /* renamed from: toString */
        public void onComplete(MediaResponse mediaResponse, Throwable th) {
            this.valueOf.invoke(mediaResponse, th);
        }
    }

    public final void gifById(String str, Transition<? super MediaResponse, ? super Throwable, setAnimationMatrix> transition) {
        runAnimators.ag$a(str, "gifId");
        runAnimators.ag$a(transition, "completionHandler");
        publishProgress.values.ag$a().ag$a(str, new values(transition));
    }

    public static /* synthetic */ void gifsByIds$default(GPHCore gPHCore, List list, String str, Transition transition, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        gPHCore.gifsByIds(list, str, transition);
    }

    /* loaded from: classes6.dex */
    public static final class toString implements postResult<ListMediaResponse> {
        final /* synthetic */ Transition values;

        toString(Transition transition) {
            this.values = transition;
        }

        @Override // o.postResult
        /* renamed from: values */
        public void onComplete(ListMediaResponse listMediaResponse, Throwable th) {
            this.values.invoke(listMediaResponse, th);
        }
    }

    public final void gifsByIds(List<String> list, String str, Transition<? super ListMediaResponse, ? super Throwable, setAnimationMatrix> transition) {
        runAnimators.ag$a(list, "gifIds");
        runAnimators.ag$a(transition, "completionHandler");
        publishProgress.values.ag$a().toString(list, new toString(transition), str);
    }
}
