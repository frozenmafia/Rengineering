package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioTrack;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes4.dex */
public final /* synthetic */ class jb implements Runnable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1111b;
    private final /* synthetic */ int c;

    public /* synthetic */ jb(Context context, TaskCompletionSource taskCompletionSource, int i) {
        this.c = i;
        this.a = context;
        this.f1111b = taskCompletionSource;
    }

    public /* synthetic */ jb(AudioTrack audioTrack, agi agiVar, int i, byte[] bArr) {
        this.c = i;
        this.a = audioTrack;
        this.f1111b = agiVar;
    }

    public /* synthetic */ jb(cg cgVar, xq xqVar, int i, byte[] bArr) {
        this.c = i;
        this.a = cgVar;
        this.f1111b = xqVar;
    }

    public /* synthetic */ jb(jh jhVar, eo eoVar, int i) {
        this.c = i;
        this.f1111b = jhVar;
        this.a = eoVar;
    }

    public /* synthetic */ jb(jh jhVar, Exception exc, int i) {
        this.c = i;
        this.a = jhVar;
        this.f1111b = exc;
    }

    public /* synthetic */ jb(jh jhVar, String str, int i) {
        this.c = i;
        this.a = jhVar;
        this.f1111b = str;
    }

    public /* synthetic */ jb(nj njVar, nk nkVar, int i) {
        this.c = i;
        this.a = njVar;
        this.f1111b = nkVar;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.ads.interactivemedia.v3.internal.nk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.google.ads.interactivemedia.v3.internal.nk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.ads.interactivemedia.v3.internal.nk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((jh) this.a).h((Exception) this.f1111b);
                return;
            case 1:
                Object obj = this.a;
                ((xq) this.f1111b).b(((cg) obj).a());
                return;
            case 2:
                ((jh) this.f1111b).l((eo) this.a);
                return;
            case 3:
                ((jh) this.f1111b).m((eo) this.a);
                return;
            case 4:
                ((jh) this.a).i((Exception) this.f1111b);
                return;
            case 5:
                ((jh) this.a).k((String) this.f1111b);
                return;
            case 6:
                ke.F((AudioTrack) this.a, (agi) this.f1111b);
                return;
            case 7:
                nj njVar = (nj) this.a;
                this.f1111b.al(njVar.a, njVar.f1185b);
                return;
            case 8:
                nj njVar2 = (nj) this.a;
                this.f1111b.ao(njVar2.a, njVar2.f1185b);
                return;
            case 9:
                nj njVar3 = (nj) this.a;
                this.f1111b.ak(njVar3.a, njVar3.f1185b);
                return;
            default:
                Object obj2 = this.a;
                ((TaskCompletionSource) this.f1111b).setResult(asn.c((Context) obj2, "GLAS"));
                return;
        }
    }
}
