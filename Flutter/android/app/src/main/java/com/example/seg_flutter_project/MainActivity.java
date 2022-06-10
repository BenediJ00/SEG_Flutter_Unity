package com.example.seg_flutter_project;


import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.os.StrictMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static main.java.de.fhkiel.mediaip.example_without_library.osc.Encoder.toOSC;
import static main.java.de.fhkiel.mediaip.example_without_library.osc.Decoder.fromOSC;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;



public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "FunktionsAufrufe.flutter.dev/OSC";
    private static final String ipAdresse = "192.168.0.72";
    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {

                            if (call.method.equals("Nachricht1")) {
                                sendOSCMessage1();
                                result.success("Nachricht 1 über OSC gesendet");

                            } else if (call.method.equals("Nachricht2")){
                                sendOSCMessage2();
                                result.success("Nachricht 2 über OSC gesendet");

                            }else if (call.method.equals("Nachricht3")){
                                sendOSCMessage3();
                                result.success("Nachricht 3 über OSC gesendet");

                            }else if (call.method.equals("Nachricht4")){
                                sendOSCMessage4();
                                result.success("Nachricht 4 über OSC gesendet");

                            } else if (call.method.equals("Nachricht5")){
                                sendOSCMessage5();
                                result.success("Nachricht 5 über OSC gesendet");

                            } else if (call.method.equals("Nachricht6")){
                                sendOSCMessage6();
                                result.success("Nachricht 6 über OSC gesendet");

                            } else if (call.method.equals("Nachricht7")){
                                sendOSCMessage7();
                                result.success("Nachricht 7 über OSC gesendet");

                            } else if (call.method.equals("Nachricht8")){
                                sendOSCMessage8();
                                result.success("Nachricht 8 über OSC gesendet");

                            } else if (call.method.equals("Nachricht9")){
                                sendOSCMessage9();
                                result.success("Nachricht 9 über OSC gesendet");

                            } else {

                                result.notImplemented();
                            }
                        }

                );
    }



    private void sendOSCMessage1() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "1;1;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage2() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "1;2;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage3() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "1;3;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage4() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "2;1;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage5() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "2;2;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage6() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "2;3;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage7() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "3;1;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage8() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "3;2;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendOSCMessage9() {
        // einen DatagrammSocket(UDP) erstellen
        try (DatagramSocket socket = new DatagramSocket()) {

            // den OSC Payload erstellen

            String toSend = toOSC("/MingVasen/ZuUnity", "3;3;");

            System.out.println(toSend.length() + ": " + toSend);

            // ein Packet mit dem Payload, der Adresse und Port erstellen
            DatagramPacket packet = new DatagramPacket(toSend.getBytes(), toSend.length(), InetAddress.getByName(ipAdresse),9001);

            // das Packet senden
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }



