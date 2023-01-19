package drive.glpreno.composetest

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import drive.glpreno.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxWidth(1f))
                    {
                        Row(modifier = Modifier.fillMaxWidth(.5f)) {
                        Card(modifier = Modifier.background(R.color.purple_200),
                            elevation = 4dp, shape = Shapes
                        ) {
                            Image(painter = painterResource(id = R.drawable.ic_baseline_wifi_24), contentDescription ="whatsweb" )
                        }
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun sundasy(){

}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun simpleCard(){
    Card(modifier = Modifier.background(color = Color(R.color.purple_200), shape = RoundedCornerShape(4.dp))) {
        Column() {
            Image(painter = painterResource(id = R.drawable.ic_baseline_wifi_24), contentDescription ="Whats wEb" )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Greeting("Android")
    }
}