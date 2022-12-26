package o;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Repo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class onEnterLayoutOrScroll extends recordAnimationInfoIfBouncedHiddenView {
    /* JADX INFO: Access modifiers changed from: package-private */
    public onEnterLayoutOrScroll(Repo repo, bindViewHolder bindviewholder) {
        super(repo, bindviewholder);
    }

    public onEnterLayoutOrScroll ah$a(String str) {
        Objects.requireNonNull(str, "Can't pass null for argument 'pathString' in child()");
        if (ah$a().HaptikSDK$b()) {
            RecyclerView.ItemAnimatorRestoreListener.ah$a(str);
        } else {
            RecyclerView.ItemAnimatorRestoreListener.ag$a(str);
        }
        return new onEnterLayoutOrScroll(this.toString, ah$a().values(new bindViewHolder(str)));
    }

    public String toString() {
        onEnterLayoutOrScroll valueOf = valueOf();
        if (valueOf == null) {
            return this.toString.toString();
        }
        try {
            return valueOf.toString() + "/" + URLEncoder.encode(ag$a(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            throw new DatabaseException("Failed to URLEncode key: " + ag$a(), e);
        }
    }

    public onEnterLayoutOrScroll valueOf() {
        bindViewHolder ah$b = ah$a().ah$b();
        if (ah$b != null) {
            return new onEnterLayoutOrScroll(this.toString, ah$b);
        }
        return null;
    }

    public String ag$a() {
        if (ah$a().HaptikSDK$b()) {
            return null;
        }
        return ah$a().values().valueOf();
    }

    public boolean equals(Object obj) {
        return (obj instanceof onEnterLayoutOrScroll) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
