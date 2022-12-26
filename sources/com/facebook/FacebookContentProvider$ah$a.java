package com.facebook;

import java.util.Arrays;
import java.util.UUID;
import o.getTargetTypes;
import o.runAnimators;
import o.setCanRemoveViews;
/* loaded from: classes4.dex */
public final class FacebookContentProvider$ah$a {
    public /* synthetic */ FacebookContentProvider$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private FacebookContentProvider$ah$a() {
    }

    public final String toString(String str, UUID uuid, String str2) {
        runAnimators.ag$a(uuid, "callId");
        setCanRemoveViews setcanremoveviews = setCanRemoveViews.ah$a;
        String format = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2}, 4));
        runAnimators.ah$a(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
