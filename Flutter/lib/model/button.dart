import 'package:flutter/material.dart';
import 'package:seg_flutter_project/controller/game_manager.dart';

class Button extends StatelessWidget {
  int buttonNumber;
  Button(this.buttonNumber);

  @override
  Widget build(BuildContext context) {
    GameManager gameManager = GameManager();
    final ButtonStyle style = ElevatedButton.styleFrom(
        textStyle: const TextStyle(fontSize: 20), primary: Color(0xff06048c));
    return ElevatedButton(
      style: style,
      onPressed: () {
        gameManager.oscManager.nachrichtenListe[buttonNumber].sendeOSCNachrichtUeberJave();
      },
      child: const Text('Feuer'),
    );
  }
}
