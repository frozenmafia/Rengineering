package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.invokeSuspend;
/* loaded from: classes3.dex */
public class drawToBitmap extends Cdefault<InputStream> {
    private static final UriMatcher ag$a;

    /* renamed from: o.drawToBitmap$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public abstract class Cdefault<T> implements invokeSuspend<T> {
        private T ah$a;
        private final ContentResolver toString;
        private final Uri valueOf;

        protected abstract void toString(T t) throws IOException;

        protected abstract T valueOf(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

        @Override // o.invokeSuspend
        public void values() {
        }

        public Cdefault(ContentResolver contentResolver, Uri uri) {
            this.toString = contentResolver;
            this.valueOf = uri;
        }

        @Override // o.invokeSuspend
        public final void valueOf(Priority priority, invokeSuspend.toString<? super T> tostring) {
            try {
                T valueOf = valueOf(this.valueOf, this.toString);
                this.ah$a = valueOf;
                tostring.values((invokeSuspend.toString<? super T>) valueOf);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("LocalUriFetcher", 3)) {
                    Log.d("LocalUriFetcher", "Failed to open Uri", e);
                }
                tostring.values((Exception) e);
            }
        }

        @Override // o.invokeSuspend
        public void valueOf() {
            T t = this.ah$a;
            if (t != null) {
                try {
                    toString(t);
                } catch (IOException unused) {
                }
            }
        }

        @Override // o.invokeSuspend
        public DataSource ah$a() {
            return DataSource.LOCAL;
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        ag$a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public drawToBitmap(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.drawToBitmap.Cdefault
    /* renamed from: ag$a */
    public InputStream valueOf(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream drawtobitmap = toString(uri, contentResolver);
        if (drawtobitmap != null) {
            return drawtobitmap;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    private InputStream toString(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = ag$a.match(uri);
        if (match != 1) {
            if (match == 3) {
                return ah$a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        return ah$a(contentResolver, lookupContact);
    }

    private InputStream ah$a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.drawToBitmap.Cdefault
    /* renamed from: values */
    public void toString(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.invokeSuspend
    public Class<InputStream> ag$a() {
        return InputStream.class;
    }
}
