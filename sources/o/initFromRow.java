package o;

import com.app.dream11.core.service.graphql.api.type.FeedBannerType;
import java.util.Date;
import java.util.List;
/* loaded from: classes3.dex */
public class initFromRow {
    private Date ag$a;
    private List<FeedBannerType> ah$a;
    private int toString;
    private Date valueOf;
    private com.app.dream11.core.service.graphql.api.type.Size values;

    public List<FeedBannerType> values() {
        return this.ah$a;
    }

    public com.app.dream11.core.service.graphql.api.type.Size ah$a() {
        return this.values;
    }

    public Date HaptikSDK$a() {
        return this.ag$a;
    }

    public Date valueOf() {
        return this.valueOf;
    }

    public int ah$b() {
        return this.toString;
    }

    public static toString ag$a() {
        return new toString();
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        com.app.dream11.core.service.graphql.api.type.Size ag$a;
        Date ah$a;
        Date toString;
        int valueOf;
        List<FeedBannerType> values;

        private toString() {
        }

        public toString ag$a(List<FeedBannerType> list) {
            this.values = list;
            return this;
        }

        public toString values(com.app.dream11.core.service.graphql.api.type.Size size) {
            this.ag$a = size;
            return this;
        }

        public toString ag$a(int i) {
            this.valueOf = i;
            return this;
        }

        public initFromRow ag$a() {
            initFromRow initfromrow = new initFromRow();
            initfromrow.ag$a = this.toString;
            initfromrow.valueOf = this.ah$a;
            initfromrow.values = this.ag$a;
            initfromrow.ah$a = this.values;
            initfromrow.toString = this.valueOf;
            return initfromrow;
        }
    }
}
