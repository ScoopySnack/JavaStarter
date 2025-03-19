package gr.aueb.cf.ch26.challenges;

import java.io.IOException;
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
