package Day16_logicalprogram;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Shared {
    synchronized void methodOne(Shared s) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + "is executing methodOne...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getName() + "is calling methodTwo...");

        s.methodTwo(this);

        System.out.println(t.getName() + "is finished executing methodOne...");
    }

    synchronized void methodTwo(Shared s) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + "is executing methodTwo...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getName() + "is calling methodOne...");

        s.methodOne(this);

        System.out.println(t.getName() + "is finished executing methodTwo...");
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        final Shared s1 = new Shared();

        final Shared s2 = new Shared();

        Thread t1 = new Thread() {
            public void run() {
                s1.methodOne(s2);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                s2.methodTwo(s1);
            }
        };

        t1.start();

        t2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        long ids[] = bean.findMonitorDeadlockedThreads();

        if (ids != null) {
            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);

            for (ThreadInfo threadInfo1 : threadInfo) {
                System.out.println(threadInfo1.getThreadId());

                System.out.println(threadInfo1.getThreadName());

                System.out.println(threadInfo1.getLockName());

                System.out.println(threadInfo1.getLockOwnerId());

                System.out.println(threadInfo1.getLockOwnerName());
            }
        } else {
            System.out.println("No Deadlocked Threads");
        }
    }

}
