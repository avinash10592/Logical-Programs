package Day22_logicalprograms;

class MultiThread extends Thread {
    public void run() {

        for (int loop = 0; loop <= 4; loop++) {

            // Sleep() method
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(loop);

        }
    }

}

class MulitThread {
    public static void main(String[] args) {
        MultiThread obj1 = new MultiThread();
        MultiThread obj2 = new MultiThread();

        // setDaemon() method
        obj1.setDaemon(true);
        System.out.println("Checking Thread1 is Daemon or not:  " + obj1.isDaemon());
        obj2.setDaemon(true);
        System.out.println("Checking Thread2 is Daemon or not:  " + obj2.isDaemon());
        // getId() method
        System.out.println("ID=" + obj1.getId());

        // getName() method
        System.out.println("name of the Thread" + obj1.getName());

        // setName() method
        obj1.setName("avinash");
        System.out.println("name of the Thread after changing the name " + obj1.getName());

        // getPriority() method
        System.out.println("Priority of the thread=" + obj1.getPriority());

        // setPriority() method
        obj1.setPriority(8);
        System.out.println("Priority of the thread after changing=" + obj1.getPriority());

        obj1.start();
        // isAlive() method
        System.out.println("Thread1 status=" + obj1.isAlive());
        // join() method
        try {
            obj1.join();
        } catch (Exception e) {

        }
        // isAlive() method
        System.out.println("Thread1 status=" + obj1.isAlive());
        obj2.start();
        // isAlive() method
        System.out.println("Thread2 status=" + obj2.isAlive());
        // join() method
        try {
            obj2.join();
        } catch (Exception e) {

        }
        // isAlive() method
        System.out.println("Thread2 status=" + obj2.isAlive());
    }

}