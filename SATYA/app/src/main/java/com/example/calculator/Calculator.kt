package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.MediumGray
import com.example.calculator.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing : Dp = 8.dp,
    onAction : (CalculatorActions) -> Unit
){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MediumGray)
        .padding(16.dp)){
        Column(
            modifier =Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ){

            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Medium,
                fontSize = 45.sp,
                color = Color.White,
                maxLines = 2,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick = {
                        onAction(CalculatorActions.Clear)
                    }
                    ) // BUTTON END

                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                ) // BUTTON END
            } // ROW END

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                ) // BUTTON END

            } // ROW END

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                ) // BUTTON END

            } // ROW END

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                ) // BUTTON END

            } // ROW END

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                ) // BUTTON END

                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                ) // BUTTON END

            } // ROW END

        }
    }
}