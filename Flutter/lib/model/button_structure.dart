import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:seg_flutter_project/controller/game_manager.dart';
import 'package:seg_flutter_project/model/button_reihe.dart';

class SchussButtons extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(body:Center(
      child: buildButtonStructureWidget(context)
    ));
  }

  Widget buildButtonStructureWidget(context){

    return Column(
      mainAxisSize: MainAxisSize.min,
      children: <Widget>[
        const SizedBox(height: 200),
        Text("8 Schuss"),
        const Spacer(),

        ButtonReihe(1, 2, 3),

        const Spacer(),

        ButtonReihe(4, 5, 6),

        const Spacer(),

        ButtonReihe(7, 8, 9),

      ],
    );
  }
}

