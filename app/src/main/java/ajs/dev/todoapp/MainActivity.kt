package ajs.dev.todoapp

import ajs.dev.todoapp.ui.theme.TodoAppTheme
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { TodoAppTheme {
            Scaffold (Modifier.fillMaxSize()) {

                NavBar()


            }
        } }
    }
}

@Composable
fun NavBar(modifier: Modifier = Modifier) {
    Row(modifier.fillMaxWidth().fillMaxHeight(0.8f).background(color = Color.Blue), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "task list button",
            modifier = Modifier.size(40.dp),
            tint = Color.White

        )

        Icon (
            imageVector = Icons.Default.Check,
            contentDescription = "completed tasks button",
            modifier = Modifier.size(40.dp),
            tint = Color.White
        )

    }
}

@Composable fun PlaceHolder(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxHeight(0.92f), verticalArrangement = Arrangement.Center){
        Text(
            text = "Todo app",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 52.sp


        )
    }

}

@Preview(showSystemUi = true)
@Composable fun TodoPreview() {
    TodoAppTheme {
        Column(Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceBetween) {
            PlaceHolder()
            NavBar()

        }
    }
}