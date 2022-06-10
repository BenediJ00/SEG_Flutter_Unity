import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:seg_flutter_project/controller/game_manager.dart';
import 'package:seg_flutter_project/model/button.dart';

class ButtonReihe extends StatelessWidget {
  int button1;
  int button2;
  int button3;

  ButtonReihe(this.button1,this.button2,this.button3);

  @override
  Widget build(BuildContext context) {

    return Row(
      children: <Widget>[
        const SizedBox(width: 50),
        Button(button1),
        const Spacer(),
        Button(button2),
        const Spacer(),
       Button(button3),
        const SizedBox(width: 50),
      ],
    );
  }
}


