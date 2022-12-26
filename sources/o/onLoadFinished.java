package o;

import com.fancode.video.base.VideoSource;
import java.util.ArrayList;
import java.util.List;
import o.LoaderManagerImpl;
/* loaded from: classes4.dex */
public abstract class onLoadFinished {
    protected String ag$a = "";
    private List<LoaderManagerImpl.LoaderInfo> valueOf = new ArrayList();

    public abstract hasDeliveredData ag$a();

    public abstract void valueOf(VideoSource videoSource, onCreateLoader oncreateloader);

    public void valueOf(LoaderManagerImpl.LoaderInfo loaderInfo) {
        this.valueOf.add(loaderInfo);
    }

    public void ah$a(LoaderManagerImpl.LoaderInfo loaderInfo) {
        this.valueOf.remove(loaderInfo);
    }
}
