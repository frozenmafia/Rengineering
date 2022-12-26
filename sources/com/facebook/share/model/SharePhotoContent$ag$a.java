package com.facebook.share.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class SharePhotoContent$ag$a extends ShareContent$ag$a<SharePhotoContent, SharePhotoContent$ag$a> {
    private final List<SharePhoto> ag$a = new ArrayList();

    public final List<SharePhoto> ah$b() {
        return this.ag$a;
    }

    public final SharePhotoContent$ag$a toString(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            this.ag$a.add(new SharePhoto$ag$a().valueOf(sharePhoto).valueOf());
        }
        return this;
    }

    public final SharePhotoContent$ag$a values(List<SharePhoto> list) {
        if (list != null) {
            for (SharePhoto sharePhoto : list) {
                toString(sharePhoto);
            }
        }
        return this;
    }

    public SharePhotoContent HaptikSDK$c() {
        return new SharePhotoContent(this, null);
    }

    @Override // com.facebook.share.model.ShareContent$ag$a
    /* renamed from: values */
    public SharePhotoContent$ag$a ag$a(SharePhotoContent sharePhotoContent) {
        return sharePhotoContent == null ? this : ((SharePhotoContent$ag$a) super.ag$a((SharePhotoContent$ag$a) sharePhotoContent)).values(sharePhotoContent.values());
    }

    public final SharePhotoContent$ag$a valueOf(List<SharePhoto> list) {
        this.ag$a.clear();
        values(list);
        return this;
    }
}
