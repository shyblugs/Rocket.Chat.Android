package chat.rocket.persistence.realm.repositories;

import android.os.Handler;
import android.os.Looper;
import io.realm.Realm;

public class RealmRepository {

  protected void close(Realm realm, Looper looper) {
    new Handler(looper).post(realm::close);
  }
}
