import 'package:flutter/material.dart';

class Buttons extends StatelessWidget {
  const Buttons(
      {super.key,
      required this.color,
      required this.title,
      required this.onTap});
  final Color color;
  final String title;
  final void Function() onTap;
  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onTap,
      child: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 5),
        child: Container(
          height: 85,
          width: 85,
          decoration: BoxDecoration(
            color: color,
            borderRadius: BorderRadius.circular(25),
          ),
          child: Center(
              child: Text(
            title,
            style: TextStyle(
                fontSize: 24, fontWeight: FontWeight.bold, color: Colors.white),
          )),
        ),
      ),
    );
  }
}
