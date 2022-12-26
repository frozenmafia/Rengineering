package com.fancode.video.models;

import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class VideoInfo {
    private final List<AudioTrackInfo> audioTrackInfo;
    private final List<VideoTrackInfo> videoTrackInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoInfo.audioTrackInfo;
        }
        if ((i & 2) != 0) {
            list2 = videoInfo.videoTrackInfo;
        }
        return videoInfo.copy(list, list2);
    }

    public final List<AudioTrackInfo> component1() {
        return this.audioTrackInfo;
    }

    public final List<VideoTrackInfo> component2() {
        return this.videoTrackInfo;
    }

    public final VideoInfo copy(List<AudioTrackInfo> list, List<VideoTrackInfo> list2) {
        runAnimators.ag$a(list, "audioTrackInfo");
        runAnimators.ag$a(list2, "videoTrackInfo");
        return new VideoInfo(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoInfo) {
            VideoInfo videoInfo = (VideoInfo) obj;
            return runAnimators.values(this.audioTrackInfo, videoInfo.audioTrackInfo) && runAnimators.values(this.videoTrackInfo, videoInfo.videoTrackInfo);
        }
        return false;
    }

    public int hashCode() {
        return (this.audioTrackInfo.hashCode() * 31) + this.videoTrackInfo.hashCode();
    }

    public String toString() {
        List<AudioTrackInfo> list = this.audioTrackInfo;
        List<VideoTrackInfo> list2 = this.videoTrackInfo;
        return "VideoInfo(audioTrackInfo=" + list + ", videoTrackInfo=" + list2 + ")";
    }

    public VideoInfo(List<AudioTrackInfo> list, List<VideoTrackInfo> list2) {
        runAnimators.ag$a(list, "audioTrackInfo");
        runAnimators.ag$a(list2, "videoTrackInfo");
        this.audioTrackInfo = list;
        this.videoTrackInfo = list2;
    }

    public final List<AudioTrackInfo> getAudioTrackInfo() {
        return this.audioTrackInfo;
    }

    public final List<VideoTrackInfo> getVideoTrackInfo() {
        return this.videoTrackInfo;
    }
}
