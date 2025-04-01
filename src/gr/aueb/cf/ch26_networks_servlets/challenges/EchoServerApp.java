package gr.aueb.cf.ch26_networks_servlets.challenges;

import gr.aueb.cf.ch26_networks_servlets.EchoServ;

public class EchoServerApp {

    public static void main(String[] args) {
        EchoServ es = new EchoServ();
        es.start();
    }
}
