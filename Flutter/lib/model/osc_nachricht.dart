import 'package:flutter/services.dart';

class OSCNachricht {
  late int nachrichtenNummer;
  static const platform = MethodChannel('FunktionsAufrufe.flutter.dev/OSC');

  OSCNachricht(this.nachrichtenNummer);

  void sendeOSCNachrichtUeberJave() async {

    try {
      platform.invokeMethod("Nachricht$nachrichtenNummer");
    } catch (e){
      print(e);
    }
  }

}