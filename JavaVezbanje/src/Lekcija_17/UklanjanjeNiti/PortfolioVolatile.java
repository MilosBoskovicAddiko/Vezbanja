package Lekcija_17.UklanjanjeNiti;

class PortfolioVolatile extends Thread {
        private volatile Thread stopMe;

        public PortfolioVolatile(String threadName){
            super(threadName);
        }

        public void stopMe() {
            stopMe = null;
        }

        public void run() {
            stopMe = Thread.currentThread();

            while (stopMe == Thread.currentThread()) {
                // Izvrsiti odgovarajucu obradu portfolia
                System.out.println("The portfolio thread is running!");
            }

            System.out.println("The portfolio thread was killed");
        }
    }