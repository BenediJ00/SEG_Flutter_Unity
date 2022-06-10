import 'package:flutter/material.dart';
import 'package:seg_flutter_project/controller/game_manager.dart';
import 'package:flutter/services.dart';
import 'package:seg_flutter_project/model/button_structure.dart';

class GamePage extends StatefulWidget {
  const GamePage({Key? key}) : super(key: key);

  @override
  _GamePageState createState() => _GamePageState();
}

class _GamePageState extends State<GamePage> {
  
  @override
  Widget build(BuildContext context) {

    return SchussButtons();

  }
}
