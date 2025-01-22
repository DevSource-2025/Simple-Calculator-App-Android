import 'package:calcu/buttons.dart';
import 'package:flutter/material.dart';
import 'package:math_expressions/math_expressions.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  var userinput = '';
  var answer = '';
  int a = 0;
  void parc() {
    Parser p = Parser();
    Expression exp = p.parse(userinput);
    ContextModel cm = ContextModel();
    double eval = exp.evaluate(EvaluationType.REAL, cm);
    answer = eval.toString();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Color(0xFF17171C),
        appBar: AppBar(
          title: Text("Calculator"),
          backgroundColor: Color(0xFF17171C),
        ),
        body: Column(
          children: [
            Expanded(
              child: Column(
                children: [
                  Align(
                    alignment: Alignment.bottomLeft,
                    child: Padding(
                      padding: const EdgeInsets.all(16.0),
                      child: Text(
                        userinput,
                        style: TextStyle(
                            fontSize: 40,
                            fontWeight: FontWeight.bold,
                            color: Colors.white),
                      ),
                    ),
                  ),
                  SizedBox(
                    height: 50,
                  ),
                  Align(
                    alignment: Alignment.bottomRight,
                    child: Padding(
                      padding: const EdgeInsets.all(8.0),
                      child: Text(
                        answer,
                        style: TextStyle(
                            fontSize: 50,
                            fontWeight: FontWeight.bold,
                            color: Colors.white),
                      ),
                    ),
                  ),
                ],
              ),
            ),
            Expanded(
              flex: 2,
              child: Column(
                children: [
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Buttons(
                        title: "C",
                        color: Color(0xFF4E505F),
                        onTap: () {
                          setState(() {
                            userinput = '';
                            answer = '';
                          });
                        },
                      ),
                      Buttons(
                        title: "+/-",
                        color: Color(0xFF4E505F),
                        onTap: () {
                          if (userinput[0] != '-') {
                            setState(() {
                              userinput = '-$userinput';
                            });
                          } else {
                            setState(() {
                              userinput = userinput.substring(1);
                            });
                          }
                        },
                      ),
                      Buttons(
                        title: "%",
                        color: Color(0xFF4E505F),
                        onTap: () {
                          setState(() {
                            userinput = '%';
                          });
                        },
                      ),
                      Buttons(
                        title: "/",
                        color: Color(0xFF4B5EFC),
                        onTap: () {
                          setState(() {
                            userinput += '/';
                          });
                        },
                      ),
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Buttons(
                        title: "7",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '7';
                          });
                        },
                      ),
                      Buttons(
                        title: "8",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '8';
                          });
                        },
                      ),
                      Buttons(
                        title: "9",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '9';
                          });
                        },
                      ),
                      Buttons(
                        title: "x",
                        color: Color(0xFF4B5EFC),
                        onTap: () {
                          setState(() {
                            userinput += '*';
                          });
                        },
                      ),
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Buttons(
                        title: "4",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '4';
                          });
                        },
                      ),
                      Buttons(
                        title: "5",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '5';
                          });
                        },
                      ),
                      Buttons(
                        title: "6",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '6';
                          });
                        },
                      ),
                      Buttons(
                        title: "-",
                        color: Color(0xFF4B5EFC),
                        onTap: () {
                          setState(() {
                            userinput += '-';
                          });
                        },
                      ),
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Buttons(
                        title: "1",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '1';
                          });
                        },
                      ),
                      Buttons(
                        title: "2",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '2';
                          });
                        },
                      ),
                      Buttons(
                        title: "3",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '3';
                          });
                        },
                      ),
                      Buttons(
                        title: "+",
                        color: Color(0xFF4B5EFC),
                        onTap: () {
                          setState(() {
                            userinput += '+';
                          });
                        },
                      ),
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Buttons(
                        title: ".",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '.';
                          });
                        },
                      ),
                      Buttons(
                        title: "0",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput += '0';
                          });
                        },
                      ),
                      Buttons(
                        title: "del",
                        color: Color(0xFF2E2F38),
                        onTap: () {
                          setState(() {
                            userinput = userinput.substring(1);
                          });
                        },
                      ),
                      Buttons(
                        title: "=",
                        color: Color(0xFF4B5EFC),
                        onTap: () {
                          setState(() {
                            parc();
                          });
                        },
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ],
        ));
  }
}
