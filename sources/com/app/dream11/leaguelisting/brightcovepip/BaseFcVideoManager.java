package com.app.dream11.leaguelisting.brightcovepip;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import com.app.dream11Pro.R;
import com.fancode.video.FCVideoPlayer;
import com.fancode.video.base.VideoSource;
import java.util.ArrayList;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public abstract class BaseFcVideoManager {
    public static final toString ah$a = new toString(null);
    private final FCVideoPlayer values;

    /* loaded from: classes3.dex */
    public enum RemoteActionType {
        GO_LIVE,
        LIVE,
        REFRESH
    }

    /* loaded from: classes3.dex */
    public enum VolumeEnum {
        MUTE,
        UN_MUTE
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[RemoteActionType.values().length];
            iArr[RemoteActionType.REFRESH.ordinal()] = 1;
            iArr[RemoteActionType.GO_LIVE.ordinal()] = 2;
            iArr[RemoteActionType.LIVE.ordinal()] = 3;
            ah$a = iArr;
        }
    }

    public BaseFcVideoManager(FCVideoPlayer fCVideoPlayer) {
        runAnimators.ag$a(fCVideoPlayer, "videoView");
        this.values = fCVideoPlayer;
    }

    public final void ag$a(VolumeEnum volumeEnum) {
        runAnimators.ag$a(volumeEnum, "volume");
        if (volumeEnum == VolumeEnum.MUTE) {
            this.values.setVolume(0.0f);
        } else {
            this.values.setVolume(1.0f);
        }
    }

    public final void values(boolean z) {
        this.values.setPlay(z);
    }

    public final void ag$a(boolean z, VideoSource videoSource) {
        runAnimators.ag$a(videoSource, "videoSource");
        this.values.setPlay(z, videoSource);
    }

    public final void ag$a() {
        this.values.ak$a();
    }

    public final void toString(int i) {
        FCVideoPlayer fCVideoPlayer = this.values;
        fCVideoPlayer.valueOf((int) (fCVideoPlayer.HaptikSDK$a() - i));
    }

    public final void ah$a(int i) {
        FCVideoPlayer fCVideoPlayer = this.values;
        fCVideoPlayer.valueOf((int) (fCVideoPlayer.HaptikSDK$a() + i));
    }

    public final boolean values(int i) {
        return valueOf() - this.values.HaptikSDK$a() >= ((long) i);
    }

    public final long valueOf() {
        if (this.values.HaptikSDK$e()) {
            return this.values.ag$a();
        }
        return this.values.valueOf();
    }

    public final ArrayList<RemoteAction> valueOf(Context context, RemoteActionType remoteActionType, ArrayList<RemoteAction> arrayList) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(remoteActionType, "remoteActionType");
        runAnimators.ag$a(arrayList, "remoteActionList");
        arrayList.clear();
        int i = values.ah$a[remoteActionType.ordinal()];
        if (i == 1) {
            arrayList.add(valueOf(context));
        } else if (i == 2) {
            arrayList.add(ah$a(context));
        } else if (i == 3) {
            arrayList.add(toString(context));
        }
        if (remoteActionType != RemoteActionType.REFRESH) {
            if (this.values.getSignupData()) {
                arrayList.add(ag$a(context));
            } else {
                arrayList.add(values(context));
            }
        }
        return arrayList;
    }

    private final RemoteAction valueOf(Context context) {
        Icon createWithResource = Icon.createWithResource(context, (int) R.drawable.ic_refresh_icon);
        Intent intent = new Intent("FanCodePIP");
        intent.putExtra("action_type", 3);
        return new RemoteAction(createWithResource, "", "Refresh", PendingIntent.getBroadcast(context, 3, intent, 1140850688));
    }

    private final RemoteAction toString(Context context) {
        Icon createWithResource = Icon.createWithResource(context, (int) R.drawable.ic_live_icon);
        Intent intent = new Intent("FanCodePIP");
        intent.putExtra("action_type", 1);
        return new RemoteAction(createWithResource, "", "Live", PendingIntent.getBroadcast(context, 1, intent, 1140850688));
    }

    private final RemoteAction values(Context context) {
        Icon createWithResource = Icon.createWithResource(context, (int) R.drawable.ic_play_arrow_24dp);
        Intent intent = new Intent("FanCodePIP");
        intent.putExtra("action_type", 4);
        return new RemoteAction(createWithResource, "", "Play", PendingIntent.getBroadcast(context, 4, intent, 1140850688));
    }

    private final RemoteAction ag$a(Context context) {
        Icon createWithResource = Icon.createWithResource(context, (int) R.drawable.ic_pause_24dp);
        Intent intent = new Intent("FanCodePIP");
        intent.putExtra("action_type", 5);
        return new RemoteAction(createWithResource, "", "Pause", PendingIntent.getBroadcast(context, 5, intent, 1140850688));
    }

    private final RemoteAction ah$a(Context context) {
        Icon createWithResource = Icon.createWithResource(context, (int) R.drawable.ic_go_live);
        Intent intent = new Intent("FanCodePIP");
        intent.putExtra("action_type", 2);
        return new RemoteAction(createWithResource, "", "GoLive", PendingIntent.getBroadcast(context, 2, intent, 1140850688));
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
