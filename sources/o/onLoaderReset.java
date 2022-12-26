package o;

import com.fancode.video.base.VideoSource;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class onLoaderReset {
    private List<LoaderManagerImpl> ah$a;
    private VideoSource valueOf;

    public abstract void ag$a(isCallbackWaitingForData iscallbackwaitingfordata);

    public abstract void ah$a(Long l, isCallbackWaitingForData iscallbackwaitingfordata);

    public abstract void ah$a(isCallbackWaitingForData iscallbackwaitingfordata);

    public abstract void valueOf(isCallbackWaitingForData iscallbackwaitingfordata);

    public VideoSource ag$a() {
        return this.valueOf;
    }

    public void ag$a(LoaderManagerImpl loaderManagerImpl) {
        this.ah$a.remove(loaderManagerImpl);
    }
}
