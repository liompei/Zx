
## How to Use


1. create ReleaseTree.kt

```kotlin
import timber.log.Timber

class ReleaseTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        super.log(priority, tag, message, t)
    }
}
```

2. init Application


```kotlin
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Zxlog.init(debug = BuildConfig.DEBUG, releaseTree = ReleaseTree())
    }

}
```

3. use Zxlog

```kotlin
Zxlog.v()
Zxlog.d()
Zxlog.w()
Zxlog.e()
```
