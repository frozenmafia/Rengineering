package o;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class dismissAllowingStateLoss extends OutputStream implements onFindViewById {
    private final Handler ag$a;
    private final Map<GraphRequest, onGetLayoutInflater> ah$a = new HashMap();
    private onGetLayoutInflater toString;
    private int valueOf;
    private GraphRequest values;

    public dismissAllowingStateLoss(Handler handler) {
        this.ag$a = handler;
    }

    public final int values() {
        return this.valueOf;
    }

    @Override // o.onFindViewById
    public void toString(GraphRequest graphRequest) {
        this.values = graphRequest;
        this.toString = graphRequest != null ? this.ah$a.get(graphRequest) : null;
    }

    public final Map<GraphRequest, onGetLayoutInflater> valueOf() {
        return this.ah$a;
    }

    public final void valueOf(long j) {
        GraphRequest graphRequest = this.values;
        if (graphRequest == null) {
            return;
        }
        if (this.toString == null) {
            onGetLayoutInflater ongetlayoutinflater = new onGetLayoutInflater(this.ag$a, graphRequest);
            this.toString = ongetlayoutinflater;
            this.ah$a.put(graphRequest, ongetlayoutinflater);
        }
        onGetLayoutInflater ongetlayoutinflater2 = this.toString;
        if (ongetlayoutinflater2 != null) {
            ongetlayoutinflater2.ag$a(j);
        }
        this.valueOf += (int) j;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        runAnimators.ag$a(bArr, "buffer");
        valueOf(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        runAnimators.ag$a(bArr, "buffer");
        valueOf(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        valueOf(1L);
    }
}
