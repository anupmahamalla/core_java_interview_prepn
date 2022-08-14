package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class ScheduledExecutorServiceDemo {

	private void execute() {
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		getTasksToRun().apply(executorService);
		executorService.shutdown();
	}

	private void executeWithMultiThread() {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
		getTasksToRun().apply(executorService);
		//executorService.shutdown();
	}

	private Function<ScheduledExecutorService, Void> getTasksToRun() {
		return (executorService -> {
			ScheduledFuture<?> scheduledFuture1 = executorService.schedule(() -> {
                System.out.println("THis is executorService.schedule() Demo");
			}, 1, TimeUnit.SECONDS);

			ScheduledFuture<?> scheduledFuture2 = executorService.scheduleAtFixedRate(() -> {
                System.out.println("THis is executorService.scheduleAtFixedRate() Demo");
			}, 1, 15, TimeUnit.SECONDS);

			ScheduledFuture<?> scheduledFuture3 = executorService.scheduleWithFixedDelay(() -> {
                System.out.println("THis is executorService.scheduleWithFixedDelay() Demo");
			}, 1, 10, TimeUnit.SECONDS);

			ScheduledFuture<String> scheduledFuture4 = executorService.schedule(() -> {
                System.out.println("THis is executorService.schedule() Demo again");
				return "Hellow world";
			}, 1, TimeUnit.SECONDS);
			return null;
		});
	}

	public static void main(String... args) {
		ScheduledExecutorServiceDemo demo = new ScheduledExecutorServiceDemo();
		//demo.execute();
		demo.executeWithMultiThread();
	}


}