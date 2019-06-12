//Integrating the observer with the app

public class MyApp extends MultiDexApplication {

	private static final String = MyApp.class.getName();

	@Override
	protected void onCreate() {
		super.onCreate();

		AppLifecycleObserver appLifecycleObserver = new AppLifecycleObserver();
		ProcessLifecycleOwner.get().getLifecycle().addObserver(appLifecycleObserver);
	}
}