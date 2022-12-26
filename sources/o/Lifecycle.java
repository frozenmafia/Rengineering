package o;

import android.app.ProgressDialog;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
/* loaded from: classes6.dex */
public abstract class Lifecycle extends RecyclerView.OnScrollListener {
    private final androidx.recyclerview.widget.LinearLayoutManager ag$a;
    private boolean toString;

    protected abstract void ah$a();

    public abstract boolean valueOf();

    public abstract boolean values();

    /* renamed from: o.Lifecycle$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends BaseAdapter.values {
        private final androidx.databinding.ViewDataBinding ag$a;

        public final androidx.databinding.ViewDataBinding values() {
            return this.ag$a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.databinding.ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            runAnimators.ag$a(viewDataBinding, "viewDataBinding");
            this.ag$a = viewDataBinding;
        }
    }

    public Lifecycle(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        runAnimators.ag$a(linearLayoutManager, "layoutManager");
        this.ag$a = linearLayoutManager;
    }

    /* loaded from: classes6.dex */
    public class Event extends BaseAdapter {
        private int toString;

        @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
        public void valueOf(BaseAdapter.values valuesVar, int i) {
        }

        @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
        public int values() {
            return 1;
        }

        public Event(int i) {
            this.toString = i;
        }

        @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
        public int values(int i) {
            return this.toString;
        }

        public void ag$a() {
            int itemCount = getItemCount();
            int values = values();
            if (itemCount <= 0 && values > 0) {
                notifyItemInserted(0);
            } else if (itemCount > 0 && values <= 0) {
                notifyItemRemoved(0);
            } else if (itemCount == 1) {
                notifyItemChanged(0);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class State {
        ProgressDialog ah$a;

        public State(Context context) {
            if (context != null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.ah$a = progressDialog;
                progressDialog.setMessage(context.getString(ComputableLiveData$3$ag$a.network_call));
            }
        }

        public void ag$a() {
            try {
                this.ah$a.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void values() {
            try {
                if (this.ah$a.isShowing()) {
                    this.ah$a.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        int childCount = this.ag$a.getChildCount();
        int itemCount = this.ag$a.getItemCount();
        int findFirstVisibleItemPosition = this.ag$a.findFirstVisibleItemPosition();
        if (childCount + findFirstVisibleItemPosition < itemCount || findFirstVisibleItemPosition < 0 || !this.toString || values() || valueOf()) {
            return;
        }
        ah$a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.toString = true;
        }
    }
}
