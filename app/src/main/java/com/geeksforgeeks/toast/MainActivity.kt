package com.geeksforgeeks.toast

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetScaffold()
        }
    }
}

private fun mToast(context: Context){
    Toast.makeText(context, "This is a Sample Toast", Toast.LENGTH_LONG).show()
}

@Composable
fun GetScaffold(){
    Scaffold(
        topBar = {
            TopAppBar(
            title = {Text("GFG | SampleToast", color = Color.White)},
                backgroundColor = Color(0XFF0F9D58)
            ) },
        content = { MainContent()}
    )
}

@Composable
fun MainContent(){
    val mContext = LocalContext.current
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        Button(onClick = { mToast(mContext) },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58))) {
            Text(text = "Click", color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GetScaffold()
}