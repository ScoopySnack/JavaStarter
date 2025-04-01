package gr.aueb.cf.ch26_networks_servlets.challenges;

import java.net.Socket;

public class ConcurrentFileSRV extends Thread{
    private final Socket sockFd;

    public ConcurrentFileSRV(Socket sockFd) {
        this.sockFd = sockFd;
    }

//    @Override
////    public void run() {
////        try {
////
////        }catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
}
