import 'dart:async';

import 'package:flutter/material.dart';
import 'package:seg_flutter_project/view/game_page.dart';

class CountdownUndButton extends StatefulWidget {
  const CountdownUndButton({Key? key}) : super(key: key);

  @override
  _CountdownUndButtonState createState() => _CountdownUndButtonState();
}

class _CountdownUndButtonState extends State<CountdownUndButton> {

  var sekundenBisStart = 10 ;


  void _countdown(){
    Timer.periodic(Duration(seconds: 1), (timer) async {
      if (sekundenBisStart >= 1) {
        setState(() {
          sekundenBisStart--;
        });

      } else {
        timer.cancel();
        Navigator.push( context, MaterialPageRoute(builder: (context) => const GamePage()));
        await new Future.delayed(const Duration(milliseconds : 500));
        setState(() {
          sekundenBisStart = 10;
        });
      }
    });
  }
  @override
  Widget build(BuildContext context) {
    return Column(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,

        children:<Widget>[
          Center(
            child: Text("$sekundenBisStart", style: TextStyle(fontSize: 50),) ,
          ),
          Center(
            // Center is a layout widget. It takes a single child and positions it
            // in the middle of the parent.
            child:TextButton(
              style: TextButton.styleFrom(
                padding: const EdgeInsets.all(16.0),
                primary: Colors.grey,
                textStyle: const TextStyle(fontSize: 20),
              ),
              onPressed: () {
                _countdown();
              },
              child: const Text('Starten'),
            ),

          ),
        ]
    );
  }
}
