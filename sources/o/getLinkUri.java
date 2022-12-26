package o;

import com.appsamurai.storyly.exoplayer2.common.offline.StreamKey;
import java.util.List;
import o.ContentInfoCompat;
import o.ParcelableCompat;
import o.SelfDestructiveThread;
/* loaded from: classes3.dex */
public final class getLinkUri implements ContentInfoCompat.Api31Impl {
    private final ContentInfoCompat.Api31Impl ah$a;
    private final List<StreamKey> toString;

    public getLinkUri(ContentInfoCompat.Api31Impl api31Impl, List<StreamKey> list) {
        this.ah$a = api31Impl;
        this.toString = list;
    }

    @Override // o.ContentInfoCompat.Api31Impl
    public SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values<getSource> ag$a() {
        return new ParcelableCompat.ParcelableCompatCreatorHoneycombMR2(this.ah$a.ag$a(), this.toString);
    }

    @Override // o.ContentInfoCompat.Api31Impl
    public SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values<getSource> valueOf(toContentInfoCompat tocontentinfocompat, getClip getclip) {
        return new ParcelableCompat.ParcelableCompatCreatorHoneycombMR2(this.ah$a.valueOf(tocontentinfocompat, getclip), this.toString);
    }
}
