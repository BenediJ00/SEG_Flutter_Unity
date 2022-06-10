package main.java.de.fhkiel.mediaip.example_without_library;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static main.java.de.fhkiel.mediaip.example_without_library.osc.Encoder.toOSC;

public class OSCSender {
    public static void main(String[] args) {

        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/lighthouse/lightx20y6", "Tschau");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName("127.0.0.1"),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
